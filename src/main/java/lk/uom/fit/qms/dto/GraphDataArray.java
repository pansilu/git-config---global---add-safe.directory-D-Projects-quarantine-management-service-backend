package lk.uom.fit.qms.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GraphDataArray implements Serializable {

    private static final long serialVersionUID = -2263811300235617948L;

    private String label;
    private List<Long> data = new ArrayList<>();

    public GraphDataArray(String label, Long value) {
        this.label = label;
        this.data.add(value);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Long> getData() {
        return data;
    }

    public void setData(List<Long> data) {
        this.data = data;
    }
}
