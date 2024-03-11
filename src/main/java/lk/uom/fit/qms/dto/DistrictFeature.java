package lk.uom.fit.qms.dto;

import org.json.simple.JSONObject;

public class DistrictFeature {

    private String type;
    private JSONObject geometry;
    private DistrictProperties properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JSONObject getGeometry() {
        return geometry;
    }

    public void setGeometry(JSONObject geometry) {
        this.geometry = geometry;
    }

    public DistrictProperties getProperties() {
        return properties;
    }

    public void setProperties(DistrictProperties properties) {
        this.properties = properties;
    }
}
