package cowin.slot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableCalenderSession.class)
@JsonDeserialize(builder = ImmutableCalenderSession.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
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
