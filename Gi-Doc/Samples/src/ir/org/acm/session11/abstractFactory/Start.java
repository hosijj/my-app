package ir.org.acm.session11.abstractFactory;

public class Start {

    public static void main(String[] args) {

        CarTypes car = getCar(VehicleFactory.LUXURY_VEHICLE, "SUV");

        System.out.println("You can buy this saloon car: " + car.getCarName() +
                " Features: " + car.getCarFeatures());

    }

    static CarTypes getCar(String vhCategory, String vhType) {

        CarTypes car = null;

        VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);

        if (vhType.equals("SALOON")) {
            car = vf.getCar();
        }
        else if (vhType.equals("SUV")) {
            car = vf.getSUV();
        }

        return car;

    }

    
}
