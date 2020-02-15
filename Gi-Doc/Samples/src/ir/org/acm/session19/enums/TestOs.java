package ir.org.acm.session19.enums;

public class TestOs {
    
    public static void main(String[] args) {
        
        Os my;
        
        my = Os.LINUX;
        
        if (my == Os.LINUX) System.out.println("My OS is Linux!");
        else System.out.println("My OS is not Linux!");
        
        System.out.println( Os.LINUX.getVersion() );

        Os.LINUX.setVersion(14);

        Os.LINUX.m();

    }

}
