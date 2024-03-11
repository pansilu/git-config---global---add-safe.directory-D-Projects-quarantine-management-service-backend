package lk.uom.fit.qms.service.impl;

import lk.uom.fit.qms.dto.AddressDto;
import lk.uom.fit.qms.exception.QmsException;
import lk.uom.fit.qms.model.Address;
import lk.uom.fit.qms.repository.AddressRepository;
import lk.uom.fit.qms.service.AddressService;
import lk.uom.fit.qms.service.GramaNiladariDivisionService;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.lang.reflect.Type;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AddressServiceImpl implements AddressService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ModelMapper modelMapper;

    private final AddressRepository addressRepository;

    private final GramaNiladariDivisionService gramaNiladariDivisionService;

    @Autowired
    public AddressServiceImpl(ModelMapper modelMapper, AddressRepository addressRepository, GramaNiladariDivisionService gramaNiladariDivisionService) {
        this.modelMapper = modelMapper;
        this.addressRepository = addressRepository;
        this.gramaNiladariDivisionService = gramaNiladariDivisionService;
    }

    @PostConstruct
    private void init() {
        logger.info("start init removing isolate address method");
        deleteIsolateAddresses();
    }

    @Override
    public List<AddressDto> getAllAddress(Long gndId, String police, String line) throws QmsException {

        gramaNiladariDivisionService.getGramaNiladariDivision(gndId);

        String patternLine;
        String patternPolice;

        List<Address> addresses;

        if (!StringUtils.isEmpty(line) && !StringUtils.isEmpty(police)) {

            patternLine = "%" + line + "%";
            patternPolice = "%" + police + "%";

            addresses = addressRepository.filterByLineAndPoliceArea(gndId, patternLine, patternPolice);
        } else if (!StringUtils.isEmpty(police)) {

            patternPolice = "%" + police + "%";

            addresses = addressRepository.filterByPoliceArea(gndId, patternPolice);
        } else if (!StringUtils.isEmpty(line)) {

            patternLine = "%" + line + "%";

            addresses = addressRepository.filterByLine(gndId, patternLine);
        } else {
            addresses = addressRepository.filterByGnd(gndId);
        }

        Type type = new TypeToken<List<AddressDto>>() {}.getType();
        return modelMapper.map(addresses, type);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteIsolateAddresses() {

        List<Address> isolateAddresses = addressRepository.findIsolateAddresses();
        isolateAddresses.forEach(address -> address.setDeleted(true));

        addressRepository.saveAll(isolateAddresses);
    }
}
