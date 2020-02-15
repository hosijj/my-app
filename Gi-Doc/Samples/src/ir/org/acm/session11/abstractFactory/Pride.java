package ir.org.acm.session11.abstractFactory;

public class Pride extends SaloonCar {

    private String name;

    public Pride(String cName) {
        name = cName;
    }

    public String getCarName() {
        return name;
    }

    public String getCarFeatures() {
        return "Pride Features ";
    }

}