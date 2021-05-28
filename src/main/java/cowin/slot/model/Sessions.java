package cowin.slot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableSessions.class)
@JsonDeserialize(builder = ImmutableSessions.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Sessions {
    int centerId();

    String name();

    String nameL();

    String address();

    String addressL();

    String stateName();

    String stateNameL();

    String blockName();

    String blockNameL();

    int pincode();

    String from();

    String to();

    String feeType();

    int fee();

    String sessionId();

    String date();

    int availableCapacity();

    int availableCapacityDose1();

    int availableCapacityDose2();

    int minAgeLimit();

    String vaccine();

    List<String> slot();
}
