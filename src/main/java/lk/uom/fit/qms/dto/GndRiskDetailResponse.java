package lk.uom.fit.qms.dto;

import lk.uom.fit.qms.util.enums.RiskType;

public class GndRiskDetailResponse {

    private Long id;
    private RiskType riskType;
    private String feature;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RiskType getRiskType() {
        return riskType;
    }

    public void setRiskType(RiskType riskType) {
        this.riskType = riskType;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
