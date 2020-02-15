package ir.org.acm.session11.abstractFactory;

public abstract class SUVCar extends CarTypes {

    public abstract String getSUVName();

    public abstract String getSUVFeatures();

    public String getCarName() {
        return getSUVName();
    }

    public String getCarFeatures() {
        return getSUVFeatures();
    }
    
}