package cowin.slot.model;

import java.util.List;

public class CalenderByDistrictRoot {
    public List<CalenderByDistrictCenter> centers;

    public CalenderByDistrictRoot(List<CalenderByDistrictCenter> centers) {
        this.centers = centers;
    }

    public List<CalenderByDistrictCenter> getCenters() {
        return centers;
    }

    public void setCenters(List<CalenderByDistrictCenter> centers) {
        this.centers = centers;
    }
}
