package cowin.slot.model;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface CalenderSession {
    String sessionId();

    String date();

    int availableCapacity();

    int availableCapacityDose1();

    int availableCapacityDose2();

    int minAgeLimit();

    String vaccine();

    List<String> slots();
}
