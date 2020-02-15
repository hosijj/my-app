package ir.org.acm.session11.abstractFactory;

public abstract class VehicleFactory {

    public static final String LUXURY_VEHICLE = "Luxury";
    public static final String NON_LUXURY_VEHICLE = "Non-Luxury";

    public abstract SaloonCar getCar();

    public abstract SUVCar getSUV();

    public static VehicleFactory getVehicleFactory(String type) {
        
        if (type.equals(VehicleFactory.LUXURY_VEHICLE)) {
            return new Toyota();
        }
        if (type.equals(VehicleFactory.NON_LUXURY_VEHICLE)) {
            return new Saipa();
        }
        return new Toyota();
    }
}