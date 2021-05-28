package cowin.slot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableCalenderByCenter.class)
@JsonDeserialize(builder = ImmutableCalenderByCenter.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
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
