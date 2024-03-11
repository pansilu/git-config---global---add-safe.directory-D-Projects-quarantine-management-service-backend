package lk.uom.fit.qms.dto;

import java.io.Serializable;

public class GraphData implements Serializable {

    private static final long serialVersionUID = 8429241083255179592L;

    private String key;
    private Long value;

    public GraphData(String key, Long value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
