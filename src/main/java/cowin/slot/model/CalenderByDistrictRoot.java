package cowin.slot.model;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface CalenderByDistrictRoot {
    List<CalenderByDistrictCenter> centers();
}
