package lk.uom.fit.qms.dto;

import java.io.Serializable;
import java.util.List;

public class GraphArrayResponse implements Serializable {

    private static final long serialVersionUID = -4529066348993826328L;

    private List<String> keys;
    private List<GraphDataArray> dataSet;

    public GraphArrayResponse(List<String> keys, List<GraphDataArray> dataSet) {
        this.keys = keys;
        this.dataSet = dataSet;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public List<GraphDataArray> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<GraphDataArray> dataSet) {
        this.dataSet = dataSet;
    }
}
