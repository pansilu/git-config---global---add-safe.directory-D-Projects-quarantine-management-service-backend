package lk.uom.fit.qms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HospitalStat {

    private HospitalData hospital;

    public HospitalData getHospital() {
        return hospital;
    }

    public void setHospital(HospitalData hospital) {
        this.hospital = hospital;
    }
}
