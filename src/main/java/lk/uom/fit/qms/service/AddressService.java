package lk.uom.fit.qms.service;

import lk.uom.fit.qms.dto.AddressDto;
import lk.uom.fit.qms.exception.QmsException;

import java.util.List;

public interface AddressService {

    List<AddressDto> getAllAddress(Long gndId, String police, String line) throws QmsException;

    void deleteIsolateAddresses();
}
