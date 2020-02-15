package ir.org.acm.session11.abstractFactory;

public class LandCruiser extends SUVCar {

    private String name;

    public LandCruiser(String sName) {
        name = sName;
    }

    public String getSUVName() {
        return name;
    }

    public String getSUVFeatures() {
        return "Land Cruiser Features ";
    }



}