package cowin.slot.model;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface CalenderByDistrictCenter {
    int centerId();

    String name();

    String nameL();

    String address();

    String addressL();

    String stateName();

    String stateNameL();

    String districtName();

    String districtNameL();

    String blockName();

    String blockNameL();

    String pincode();

    double lat();

    double lng();

    String from();

    String to();

    String feeType();

    List<CalenderVaccineFee> vaccine_fees();

    List<CalenderSession> sessions();
}
