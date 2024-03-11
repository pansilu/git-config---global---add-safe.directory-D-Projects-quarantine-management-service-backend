package lk.uom.fit.qms.dto;

public class DistrictResDto {

    private Long id;
    private String name;
    private String code;
    private String feature;

    private ProvinceResDto province;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProvinceResDto getProvince() {
        return province;
    }

    public void setProvince(ProvinceResDto province) {
        this.province = province;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
