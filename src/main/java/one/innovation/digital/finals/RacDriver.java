package one.innovation.digital.finals;

public class RacDriver extends Driver {
    @Override
    public String steeringWheel() {
        return "Racer steering wheel";
    }
    public String race(final String circuit){
        return "Speeding at the " + circuit + "circuit.";
    }
}
