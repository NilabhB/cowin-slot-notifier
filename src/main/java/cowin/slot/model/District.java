package cowin.slot.model;

public class District {
   private int stateId;
   private int districtId;
   private String districtName;
   private String districtL;

    public District(int stateId, int districtId, String districtName, String districtL) {
        this.stateId = stateId;
        this.districtId = districtId;
        this.districtName = districtName;
        this.districtL = districtL;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictL() {
        return districtL;
    }

    public void setDistrictL(String districtL) {
        this.districtL = districtL;
    }
}
