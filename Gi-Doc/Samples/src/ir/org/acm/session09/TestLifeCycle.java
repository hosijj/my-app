package ir.org.acm.session09;

public class TestLifeCycle {
    
    public static void main(String[] args) throws Exception {
        
        //LifeCycle obj = new LifeCycle();
        //obj.m1();

        System.out.println("new LifeCycle().m1();");

        new LifeCycle().m1();
        
        System.gc();
        
        //LifeCycle.m2();
        
        //Class.forName("session09.LifeCycle");
        
        
    }
    
}
