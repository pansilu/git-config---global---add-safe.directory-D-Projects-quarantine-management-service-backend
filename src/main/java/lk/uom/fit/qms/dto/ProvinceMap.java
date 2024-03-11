package lk.uom.fit.qms.dto;

import lk.uom.fit.qms.model.Province;

import java.util.Map;

public class ProvinceMap {

    private Province province;
    private Map<String, DistrictMap> districtMaps;

    public ProvinceMap(Province province, Map<String, DistrictMap> districtMaps) {
        this.province = province;
        this.districtMaps = districtMaps;
    }

    public ProvinceMap() {
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Map<String, DistrictMap> getDistrictMaps() {
        return districtMaps;
    }

    public void setDistrictMaps(Map<String, DistrictMap> districtMaps) {
        this.districtMaps = districtMaps;
    }
}
