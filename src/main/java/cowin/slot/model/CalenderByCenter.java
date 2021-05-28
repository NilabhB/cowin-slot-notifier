package cowin.slot.model;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface CalenderByCenter {
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

    List<CalenderVaccineFee> vaccineFees();

    List<CalenderSession> sessions();
}
