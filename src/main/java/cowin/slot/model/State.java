package cowin.slot.model;

public class State {
    private int stateId;
    private String stateName;
    private String stateNameL;

    public State(int stateId, String stateName, String stateNameL) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.stateNameL = stateNameL;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateNameL() {
        return stateNameL;
    }

    public void setStateNameL(String stateNameL) {
        this.stateNameL = stateNameL;
    }
}
