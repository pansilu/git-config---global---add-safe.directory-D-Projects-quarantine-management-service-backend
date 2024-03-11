package lk.uom.fit.qms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoordinatesSet {

    List<List<BigDecimal[]>> coordinates;

    public List<List<BigDecimal[]>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<BigDecimal[]>> coordinates) {
        this.coordinates = coordinates;
    }
}
