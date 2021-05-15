package cowin.slot.model;

import java.util.List;

public class Sessions {
    int centerId;
    String name;
    String nameL;
    String address;
    String addressL;
    String stateName;
    String stateNameL;
    String blockName;
    String blockNameL;
    int pincode;
    String from;
    String to;
    String feeType;
    int fee;
    String sessionId;
    String date;
    int availableCapacity;
    int availableCapacityDose1;
    int availableCapacityDose2;
    int minAgeLimit;
    String vaccine;
    List<String> slot;


    public Sessions(int centerId, String name, String nameL, String address, String addressL, String stateName,
                    String stateNameL, String blockName, String blockNameL, int pincode, String from, String to, String feeType, int fee,
                    String sessionId, String date, int availableCapacity, int availableCapacityDose1,
                    int availableCapacityDose2, int minAgeLimit, String vaccine, List<String> slot) {
        this.centerId = centerId;
        this.name = name;
        this.nameL = nameL;
        this.address = address;
        this.addressL = addressL;
        this.stateName = stateName;
        this.stateNameL = stateNameL;
        this.blockName = blockName;
        this.blockNameL = blockNameL;
        this.pincode = pincode;
        this.from = from;
        this.to = to;
        this.feeType = feeType;
        this.fee = fee;
        this.sessionId = sessionId;
        this.date = date;
        this.availableCapacity = availableCapacity;
        this.availableCapacityDose1 = availableCapacityDose1;
        this.availableCapacityDose2 = availableCapacityDose2;
        this.minAgeLimit = minAgeLimit;
        this.vaccine = vaccine;
        this.slot = slot;
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

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
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

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public int getAvailableCapacityDose1() {
        return availableCapacityDose1;
    }

    public void setAvailableCapacityDose1(int availableCapacityDose1) {
        this.availableCapacityDose1 = availableCapacityDose1;
    }

    public int getAvailableCapacityDose2() {
        return availableCapacityDose2;
    }

    public void setAvailableCapacityDose2(int availableCapacityDose2) {
        this.availableCapacityDose2 = availableCapacityDose2;
    }

    public int getMinAgeLimit() {
        return minAgeLimit;
    }

    public void setMinAgeLimit(int minAgeLimit) {
        this.minAgeLimit = minAgeLimit;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }
}
