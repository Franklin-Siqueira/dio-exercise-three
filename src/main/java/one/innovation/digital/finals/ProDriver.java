package one.innovation.digital.finals;

public class ProDriver extends Driver {
    @Override
    public String steeringWheel() {
        return "Special steering wheel";
    }
/*    @Override
    public String transmission() {
        return super.transmision();
    }
 */
    public String drive(final String destination){
        return "Driving with passengers to " + destination;
    }
}
