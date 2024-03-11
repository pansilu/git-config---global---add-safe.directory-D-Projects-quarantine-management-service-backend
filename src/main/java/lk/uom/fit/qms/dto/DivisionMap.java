package lk.uom.fit.qms.dto;

import lk.uom.fit.qms.model.Division;

public class DivisionMap {

    private Division division;

    public DivisionMap(Division division) {
        this.division = division;
    }

    public DivisionMap() {
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }
}
