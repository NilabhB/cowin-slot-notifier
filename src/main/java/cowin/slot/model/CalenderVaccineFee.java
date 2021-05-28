package cowin.slot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableCalenderVaccineFee.class)
@JsonDeserialize(builder = ImmutableCalenderVaccineFee.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface CalenderVaccineFee {
    String vaccine();

    String fee();
}
