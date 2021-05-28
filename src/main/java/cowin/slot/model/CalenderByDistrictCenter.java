package cowin.slot.model;

import java.util.List;

public class CalenderByDistrictCenter {

    public int centerId;
    public String name;
    public String nameL;
    public String address;
    public String addressL;
    public String stateName;
    public String stateNameL;
    public String districtName;
    public String districtNameL;
    public String blockName;
    public String blockNameL;
    public String pincode;
    public double lat;
    public double lng;
    public String from;
    public String to;
    public String feeType;
    public List<CalenderVaccineFee> vaccine_fees;
    public List<CalenderSession> sessions;

    public CalenderByDistrictCenter(int centerId, String name, String nameL, String address, String addressL,
                                    String stateName, String stateNameL, String districtName, String districtNameL,
                                    String blockName, String blockNameL, String pincode, double lat, double lng,
                                    String from, String to, String feeType, List<CalenderVaccineFee> vaccine_fees,
                                    List<CalenderSession> sessions) {
        this.centerId = centerId;
        this.name = name;
        this.nameL = nameL;
        this.address = address;
        this.addressL = addressL;
        this.stateName = stateName;
        this.stateNameL = stateNameL;
        this.districtName = districtName;
        this.districtNameL = districtNameL;
        this.blockName = blockName;
        this.blockNameL = blockNameL;
        this.pincode = pincode;
        this.lat = lat;
        this.lng = lng;
        this.from = from;
        this.to = to;
        this.feeType = feeType;
        this.vaccine_fees = vaccine_fees;
        this.sessions = sessions;
    }

    public int getCenterId() {
        return centerId;
    }

    public void setCenterId(int centerId) {
        this.centerId = centerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameL() {
        return nameL;
    }

    public void setNameL(String nameL) {
        this.nameL = nameL;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressL() {
        return addressL;
    }

    public void setAddressL(String addressL) {
        this.addressL = addressL;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateNameL() {
        return stateNameL;
    }

    public void setStateNameL(String stateNameL) {
        this.stateNameL = stateNameL;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictNameL() {
        return districtNameL;
    }

    public void setDistrictNameL(String districtNameL) {
        this.districtNameL = districtNameL;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getBlockNameL() {
        return blockNameL;
    }

    public void setBlockNameL(String blockNameL) {
        this.blockNameL = blockNameL;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public List<CalenderVaccineFee> getVaccine_fees() {
        return vaccine_fees;
    }

    public void setVaccine_fees(List<CalenderVaccineFee> vaccine_fees) {
        this.vaccine_fees = vaccine_fees;
    }

    public List<CalenderSession> getSessions() {
        return sessions;
    }

    public void setSessions(List<CalenderSession> sessions) {
        this.sessions = sessions;
    }
}
