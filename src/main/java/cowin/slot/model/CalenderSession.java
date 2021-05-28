package cowin.slot.model;

import java.util.List;

public class CalenderSession {
    public String sessionId;
    public String date;
    public int availableCapacity;
    public int availableCapacityDose1;
    public int availableCapacityDose2;
    public int minAgeLimit;
    public String vaccine;
    public List<String> slots;

    public CalenderSession(String sessionId, String date, int availableCapacity, int availableCapacityDose1,
                           int availableCapacityDose2, int minAgeLimit, String vaccine, List<String> slots) {
        this.sessionId = sessionId;
        this.date = date;
        this.availableCapacity = availableCapacity;
        this.availableCapacityDose1 = availableCapacityDose1;
        this.availableCapacityDose2 = availableCapacityDose2;
        this.minAgeLimit = minAgeLimit;
        this.vaccine = vaccine;
        this.slots = slots;
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

    public List<String> getSlots() {
        return slots;
    }

    public void setSlots(List<String> slots) {
        this.slots = slots;
    }
}
