package lk.uom.fit.qms.dto;

import java.io.Serializable;
import java.util.List;

public class GraphResponse implements Serializable {

    private static final long serialVersionUID = -582299377941725080L;

    private List<GraphData> data;

    public List<GraphData> getData() {
        return data;
    }

    public void setData(List<GraphData> data) {
        this.data = data;
    }
}
