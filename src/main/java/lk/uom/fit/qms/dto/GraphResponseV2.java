package lk.uom.fit.qms.dto;

import java.io.Serializable;
import java.util.List;

public class GraphResponseV2 implements Serializable {

    private static final long serialVersionUID = -5542532040847187479L;

    private List<GraphDataV2> data;

    public List<GraphDataV2> getData() {
        return data;
    }

    public void setData(List<GraphDataV2> data) {
        this.data = data;
    }
}
