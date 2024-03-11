package lk.uom.fit.qms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HospitalDetailSheet {

    private HospitalOverallData data;

    public HospitalOverallData getData() {
        return data;
    }

    public void setData(HospitalOverallData data) {
        this.data = data;
    }
}
