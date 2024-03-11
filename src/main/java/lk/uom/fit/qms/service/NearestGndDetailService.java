package lk.uom.fit.qms.service;

import lk.uom.fit.qms.model.GramaNiladariDivision;

import java.util.List;

public interface NearestGndDetailService {

    List<GramaNiladariDivision> getNearestGnDivisionDetailsForGivenGnd(Long gndId);
}
