package cowin.slot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableCalenderByDistrictRoot.class)
@JsonDeserialize(builder = ImmutableCalenderByDistrictRoot.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface CalenderByDistrictRoot {
    List<CalenderByDistrictCenter> centers();
}
