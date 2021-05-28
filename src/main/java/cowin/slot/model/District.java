package cowin.slot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableDistrict.class)
@JsonDeserialize(builder = ImmutableDistrict.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface District {
    int stateId();

    int districtId();

    String districtName();

    String districtL();
}
