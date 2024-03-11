package lk.uom.fit.qms.dto;

import java.io.Serializable;
import java.util.List;

public class GraphResponseV3 implements Serializable {

    private static final long serialVersionUID = 8682129797461964306L;

    private List<GraphDataV3> data;

    public List<GraphDataV3> getData() {
        return data;
    }

    public void setData(List<GraphDataV3> data) {
        this.data = data;
    }
}
