package lk.uom.fit.qms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HospitalOverallData {

    private List<HospitalStat> hospital_data;

    public List<HospitalStat> getHospital_data() {
        return hospital_data;
    }

    public void setHospital_data(List<HospitalStat> hospital_data) {
        this.hospital_data = hospital_data;
    }
}
