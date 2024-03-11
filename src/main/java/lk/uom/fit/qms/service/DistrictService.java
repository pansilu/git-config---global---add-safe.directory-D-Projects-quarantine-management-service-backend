package lk.uom.fit.qms.service;

import lk.uom.fit.qms.dto.DistrictResDto;
import lk.uom.fit.qms.exception.QmsException;
import lk.uom.fit.qms.model.District;

import java.util.List;

public interface DistrictService {

    List<DistrictResDto> getAllDistrictsInProvince(Long provinceId, String search) throws QmsException;

    void checkDistrictExists(Long id) throws QmsException;

    District findDistrictById(Long id) throws QmsException;

    DistrictResDto getDistrictDetailsById(Long id) throws QmsException;

    List<DistrictResDto> getAllDistricts(String search, List<Long> districtIds) throws QmsException;
}
