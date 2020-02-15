package ir.org.acm.session13.dynamicProxy;

public class Test {

    public static void main(String[] args) {

        getService().m();
        
    }
    
    static I getService() {
        
        return (I) MyProxy.createFor( new My() );
        
    }
    
}
