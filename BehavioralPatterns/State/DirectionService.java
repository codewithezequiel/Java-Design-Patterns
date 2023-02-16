package BehavioralPatterns.State;

import BehavioralPatterns.State.Interface.TravelMode;

public class DirectionService {
    private TravelMode travelMode;

    
    public DirectionService(TravelMode travelMode) {
        this.travelMode = travelMode;
    }


    public Object getDirection() {
        return travelMode.getDirection();
    }

    
    public Object getEta() {
        return travelMode.getEta();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

}
