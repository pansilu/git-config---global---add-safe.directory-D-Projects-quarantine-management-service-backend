package lk.uom.fit.qms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DistrictFeatureDetail {

    private List<DistrictFeature> features;

    public List<DistrictFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<DistrictFeature> features) {
        this.features = features;
    }
}
