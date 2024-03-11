package lk.uom.fit.qms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DistrictGndFeatureDetail {

    private List<GndFeature> features;

    public List<GndFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<GndFeature> features) {
        this.features = features;
    }
}
