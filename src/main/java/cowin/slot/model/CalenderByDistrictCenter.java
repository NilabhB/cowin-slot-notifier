package cowin.slot.model;

import java.util.List;

public class CalenderByDistrictCenter {

    public int center_id;
    public String name;
    public String name_l;
    public String address;
    public String address_l;
    public String state_name;
    public String state_name_l;
    public String district_name;
    public String district_name_l;
    public String block_name;
    public String block_name_l;
    public String pincode;
    public double lat;
    public double lng;
    public String from;
    public String to;
    public String fee_type;
    public List<CalenderVaccineFee> vaccine_fees;
    public List<CalenderSession> sessions;

    public CalenderByDistrictCenter(int center_id, String name, String name_l,
                                    String address, String address_l,
                                    String state_name, String state_name_l,
                                    String district_name, String district_name_l,
                                    String block_name, String block_name_l, String pincode,
                                    double lat, double lng, String from, String to,
                                    String fee_type, List<CalenderVaccineFee> vaccine_fees, List<CalenderSession> sessions) {
        this.center_id = center_id;
        this.name = name;
        this.name_l = name_l;
        this.address = address;
        this.address_l = address_l;
        this.state_name = state_name;
        this.state_name_l = state_name_l;
        this.district_name = district_name;
        this.district_name_l = district_name_l;
        this.block_name = block_name;
        this.block_name_l = block_name_l;
        this.pincode = pincode;
        this.lat = lat;
        this.lng = lng;
        this.from = from;
        this.to = to;
        this.fee_type = fee_type;
        this.vaccine_fees = vaccine_fees;
        this.sessions = sessions;
    }

    public int getCenter_id() {
        return center_id;
    }

    public void setCenter_id(int center_id) {
        this.center_id = center_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_l() {
        return name_l;
    }

    public void setName_l(String name_l) {
        this.name_l = name_l;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress_l() {
        return address_l;
    }

    public void setAddress_l(String address_l) {
        this.address_l = address_l;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getState_name_l() {
        return state_name_l;
    }

    public void setState_name_l(String state_name_l) {
        this.state_name_l = state_name_l;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getDistrict_name_l() {
        return district_name_l;
    }

    public void setDistrict_name_l(String district_name_l) {
        this.district_name_l = district_name_l;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    public String getBlock_name_l() {
        return block_name_l;
    }

    public void setBlock_name_l(String block_name_l) {
        this.block_name_l = block_name_l;
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

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
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
