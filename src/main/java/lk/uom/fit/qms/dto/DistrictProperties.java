package lk.uom.fit.qms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class DistrictProperties {

    @JsonProperty("stroke-opacity")
    private BigDecimal strokeOpacity;
    @JsonProperty("fill-opacity")
    private BigDecimal fillOpacity;
    private String stroke;
    @JsonProperty("NAME_0")
    private String name1;
    @JsonProperty("NAME_1")
    private String name2;

    public BigDecimal getStrokeOpacity() {
        return strokeOpacity;
    }

    public void setStrokeOpacity(BigDecimal strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
    }

    public BigDecimal getFillOpacity() {
        return fillOpacity;
    }

    public void setFillOpacity(BigDecimal fillOpacity) {
        this.fillOpacity = fillOpacity;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}
