package BehavioralPatterns.State.ConcreteTravelModes;

import BehavioralPatterns.State.Interface.TravelMode;

public class Driving implements TravelMode {

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }

    @Override
    public Object getEta() {
        System.out.println("Calculating Eta (driving)");
        return 1;
    }

}
