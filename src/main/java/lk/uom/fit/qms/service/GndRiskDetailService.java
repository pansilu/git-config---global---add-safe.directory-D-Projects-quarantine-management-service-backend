package lk.uom.fit.qms.service;

import lk.uom.fit.qms.dto.GndRiskDetailResponse;
import lk.uom.fit.qms.exception.QmsException;
import lk.uom.fit.qms.model.QuarantineUser;

import java.util.List;

public interface GndRiskDetailService {

    void updateGndRiskDetail(QuarantineUser quarantineUser);

    void updateGndRiskDetails();

    List<GndRiskDetailResponse> getGndRiskDetailsForDistrict(Long districtId) throws QmsException;
}
