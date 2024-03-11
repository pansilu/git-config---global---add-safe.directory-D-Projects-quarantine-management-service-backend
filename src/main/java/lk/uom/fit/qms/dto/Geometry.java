package lk.uom.fit.qms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {

    private List<CoordinatesSet> geometries;

    public List<CoordinatesSet> getGeometries() {
        return geometries;
    }

    public void setGeometries(List<CoordinatesSet> geometries) {
        this.geometries = geometries;
    }
}
