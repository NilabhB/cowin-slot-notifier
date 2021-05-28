package cowin.slot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableState.class)
@JsonDeserialize(builder = ImmutableState.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface State {
    int stateId();

    String stateName();

    String stateNameL();
}
