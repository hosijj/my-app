package ir.org.acm.session11.abstractFactory;

public class Roniz extends SUVCar {

    private String name;

    public Roniz(String sName) {
        name = sName;
    }

    public String getSUVName() {
        return name;
    }

    public String getSUVFeatures() {
        return "Roniz Features ";
    }

}
