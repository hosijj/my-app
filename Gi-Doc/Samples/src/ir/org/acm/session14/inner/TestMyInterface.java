package ir.org.acm.session14.inner;

public class TestMyInterface {
    
    public static void main(String[] args) {
        
        MyInterface obj = new MyInterface() {

            @Override
            public void m() {
                System.out.println("Impl.");
            }
            
        };

        obj.m();

    }

}
