package ir.org.acm.session19.enums;

// After 1.5
public enum Os {

    WINDOWS(8), LINUX(12), SOLARIS(5);

    // Os WINDOWS = new Os(8);
    // Os LINUX   = new Os(12);
    // Os SOLARIS = new Os(5);
    
    private double version;

    private Os(double v) {
        version = v;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    void m() {
        System.out.println("HI!");
    }

}
