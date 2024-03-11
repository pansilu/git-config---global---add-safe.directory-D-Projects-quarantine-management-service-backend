package lk.uom.fit.qms.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lk.uom.fit.qms.config.LocalDateDeserializer;
import lk.uom.fit.qms.util.enums.UserState;
import lk.uom.fit.qms.util.enums.GraphType;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class GraphRequestDto implements Serializable {

    private static final long serialVersionUID = -6874786041720095511L;

    private Long provinceId;
    private Long districtId;
    private Long divisionId;
    private Long gndId;

    private List<Long> districtIdList;

    @NotNull(message = "Select graph type to proceed")
    private GraphType graphType;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate startDate;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate endDate;
    private UserState covidCaseType = UserState.ALL;

    public GraphType getGraphType() {
        return graphType;
    }

    public void setGraphType(GraphType graphType) {
        this.graphType = graphType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }

    public Long getGndId() {
        return gndId;
    }

    public void setGndId(Long gndId) {
        this.gndId = gndId;
    }

    public UserState getCovidCaseType() {
        return covidCaseType;
    }

    public void setCovidCaseType(UserState covidCaseType) {
        this.covidCaseType = covidCaseType;
    }

    public List<Long> getDistrictIdList() {
        return districtIdList;
    }

    public void setDistrictIdList(List<Long> districtIdList) {
        this.districtIdList = districtIdList;
    }

    @Override
    public String toString() {
        return "GraphRequestDto{" +
                "provinceId=" + provinceId +
                ", districtId=" + districtId +
                ", divisionId=" + divisionId +
                ", gndId=" + gndId +
                ", districtIdList=" + districtIdList +
                ", graphType=" + graphType +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", covidCaseType=" + covidCaseType +
                '}';
    }
}
