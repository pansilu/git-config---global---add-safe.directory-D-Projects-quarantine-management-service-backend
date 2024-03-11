package lk.uom.fit.qms.dto;

import org.json.simple.JSONObject;

public class GndFeature {

    private String type;
    private String id;
    private JSONObject geometry;
    private GndProperties properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JSONObject getGeometry() {
        return geometry;
    }

    public void setGeometry(JSONObject geometry) {
        this.geometry = geometry;
    }

    public GndProperties getProperties() {
        return properties;
    }

    public void setProperties(GndProperties properties) {
        this.properties = properties;
    }
}
