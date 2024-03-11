package lk.uom.fit.qms.service.impl;

import lk.uom.fit.qms.dto.DivisionResDto;
import lk.uom.fit.qms.exception.QmsException;
import lk.uom.fit.qms.exception.pojo.QmsExceptionCode;
import lk.uom.fit.qms.model.Division;
import lk.uom.fit.qms.repository.DivisionRepository;
import lk.uom.fit.qms.service.DistrictService;
import lk.uom.fit.qms.service.DivisionService;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.lang.reflect.Type;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DivisionServiceImpl implements DivisionService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final DivisionRepository divisionRepository;

    private final ModelMapper modelMapper;

    private final DistrictService districtService;

    @Autowired
    public DivisionServiceImpl(DivisionRepository divisionRepository, ModelMapper modelMapper, DistrictService districtService) {
        this.divisionRepository = divisionRepository;
        this.modelMapper = modelMapper;
        this.districtService = districtService;
    }

    @Override
    public List<DivisionResDto> getAllDivisionsInDistrict(Long districtId, String search) throws QmsException {

        districtService.checkDistrictExists(districtId);

        List<Division> divisions;

        if(StringUtils.isEmpty(search)) {
            divisions = divisionRepository.findDivisionsByDistrictIdOrderByName(districtId);
        } else {
            String pattern = "%" + search + "%";
            divisions = divisionRepository.filterBySearch(districtId, pattern);
        }

        Type type = new TypeToken<List<DivisionResDto>>() {}.getType();
        return modelMapper.map(divisions, type);
    }

    @Override
    public void checkDivisionExists(Long id) throws QmsException {

        if(!divisionRepository.existsById(id)) {
            logger.warn("DS Division didn't exist for id: {}", id);
            throw new QmsException(QmsExceptionCode.USR00X, HttpStatus.NOT_FOUND, "DS Division Not Found!!!");
        }
    }

    @Override
    public Division findDivisionByName(String name) {
        return divisionRepository.findDivisionByDsName(name);
    }

    @Override
    public Division createNewDivision(Division division) {
        return divisionRepository.save(division);
    }

    @Override
    public List<Division> getAllDivisions() {
        return divisionRepository.findAll();
    }
}
