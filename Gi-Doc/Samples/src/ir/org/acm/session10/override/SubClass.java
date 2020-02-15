package ir.org.acm.session10.override;

public class SubClass extends SuperClass {

    @Override
    public void m() {
        System.out.println("Running SubClass Implementation...");
    }

    public static void x() {
        System.out.println("Running SubClass Implementation...");
    }

//    public void y() { // Cannot Override final method
//        System.out.println("Running SuperClass Implementation...");
//    }

    public void eat() {
        System.out.println("Wash Hands...");
        super.eat();
        System.out.println("Brush Teeth...");
    }

    @Override
    public Integer getNumber() { // covariant return type
            return 0;
    }


}
