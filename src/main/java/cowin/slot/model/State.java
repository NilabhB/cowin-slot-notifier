package cowin.slot.model;

import org.immutables.value.Value;

@Value.Immutable
public interface State {
    int stateId();

    String stateName();

    String stateNameL();
}
