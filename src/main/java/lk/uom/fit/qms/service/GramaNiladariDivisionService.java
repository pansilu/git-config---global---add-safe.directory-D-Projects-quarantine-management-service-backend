package lk.uom.fit.qms.service;

import lk.uom.fit.qms.dto.GnDivisionResDto;
import lk.uom.fit.qms.exception.QmsException;
import lk.uom.fit.qms.model.GramaNiladariDivision;

import java.util.List;

public interface GramaNiladariDivisionService {

    GramaNiladariDivision getGramaNiladariDivision(Long id) throws QmsException;

    List<GnDivisionResDto> getAllGnDivisionsInDsDivision(Long divisionId, String search) throws QmsException;

    List<GnDivisionResDto> getAllGnDivisions(String search);

    GnDivisionResDto getGnDivisionDetailsById(Long id) throws QmsException;

    Long findUserGndId(String province, String district, String ds, String gnd);

    String[] getGndCenterCoordinates(Long gndId);
}
