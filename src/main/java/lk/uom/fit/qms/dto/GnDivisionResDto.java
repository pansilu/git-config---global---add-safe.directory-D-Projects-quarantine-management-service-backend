package lk.uom.fit.qms.dto;

public class GnDivisionResDto {

    private Long id;
    private String name;
    private String code;
    private String gndNo;
    private String objectId;
    private String feature;

    private DivisionResDto division;

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

    public String getGndNo() {
        return gndNo;
    }

    public void setGndNo(String gndNo) {
        this.gndNo = gndNo;
    }

    public DivisionResDto getDivision() {
        return division;
    }

    public void setDivision(DivisionResDto division) {
        this.division = division;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
