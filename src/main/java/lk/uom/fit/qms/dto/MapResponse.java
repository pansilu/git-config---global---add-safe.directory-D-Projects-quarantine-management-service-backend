package lk.uom.fit.qms.dto;

import lk.uom.fit.qms.util.enums.UserState;

public class MapResponse {

    private Long id;
    private String lat;
    private String lon;
    private UserState status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public UserState getStatus() {
        return status;
    }

    public void setStatus(UserState status) {
        this.status = status;
    }
}
