package cowin.slot.model;

import java.util.List;

public class Districts {
    private final List<District> districts;

    public Districts(List<District> districts) {
        this.districts = districts;
    }

    public List<District> getDistricts() {
        return districts;
    }
}
