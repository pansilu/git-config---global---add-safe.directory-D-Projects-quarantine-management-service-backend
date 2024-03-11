package lk.uom.fit.qms.service;

import lk.uom.fit.qms.dto.ProvinceResDto;
import lk.uom.fit.qms.exception.QmsException;

import java.util.List;

public interface ProvinceService {

    List<ProvinceResDto> findAllProvinces(String search);

    void checkProvinceExits(Long id) throws QmsException;
}
