package cowin.slot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableSessionsByPin.class)
@JsonDeserialize(builder = ImmutableSessionsByPin.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface SessionsByPin {
    List<Sessions> sessions();
}
