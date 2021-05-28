package cowin.slot.model;

public class CalenderVaccineFee {
    public String vaccine;
    public String fee;

    public CalenderVaccineFee(String vaccine, String fee) {
        this.vaccine = vaccine;
        this.fee = fee;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
}
