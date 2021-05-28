package cowin.slot.model;

import org.immutables.value.Value;

@Value.Immutable
public interface CalenderVaccineFee {
    String vaccine();

    String fee();
}
