package cowin.slot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableDistricts.class)
@JsonDeserialize(builder = ImmutableDistricts.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Districts {
    List<District> districts();
}
