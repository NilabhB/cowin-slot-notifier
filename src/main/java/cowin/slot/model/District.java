package cowin.slot.model;

import org.immutables.value.Value;

@Value.Immutable
public interface District {
    int stateId();
    int districtId();
    String districtName();
    String districtL();
}
