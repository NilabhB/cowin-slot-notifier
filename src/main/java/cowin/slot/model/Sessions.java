package cowin.slot.model;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
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
