package lk.uom.fit.qms.service;

import lk.uom.fit.qms.dto.DivisionResDto;
import lk.uom.fit.qms.exception.QmsException;
import lk.uom.fit.qms.model.Division;

import java.util.List;

public interface DivisionService {

    List<DivisionResDto> getAllDivisionsInDistrict(Long districtId, String search) throws QmsException;

    void checkDivisionExists(Long id) throws QmsException;

    Division findDivisionByName(String name);

    Division createNewDivision(Division division);

    List<Division> getAllDivisions();
}
