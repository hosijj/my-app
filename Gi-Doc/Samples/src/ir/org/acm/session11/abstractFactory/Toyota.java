package ir.org.acm.session11.abstractFactory;

public class Toyota extends VehicleFactory {

    public SaloonCar getCar() {
        return new Camry("Camry");
    }

    public SUVCar getSUV() {
        return new LandCruiser("LandCruiser");
    }
}