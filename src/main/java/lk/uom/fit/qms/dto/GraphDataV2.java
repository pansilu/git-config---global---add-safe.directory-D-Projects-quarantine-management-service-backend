package lk.uom.fit.qms.dto;

import java.io.Serializable;

public class GraphDataV2 implements Serializable {

    private static final long serialVersionUID = 6946241664254032805L;

    private String key;
    private Long value1;
    private Long value2;

    public GraphDataV2(String key, Long value1, Long value2) {
        this.key = key;
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getValue1() {
        return value1;
    }

    public void setValue1(Long value1) {
        this.value1 = value1;
    }

    public Long getValue2() {
        return value2;
    }

    public void setValue2(Long value2) {
        this.value2 = value2;
    }
}
