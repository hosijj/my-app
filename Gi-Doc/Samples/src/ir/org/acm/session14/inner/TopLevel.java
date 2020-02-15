package ir.org.acm.session14.inner;

// Outer
public class TopLevel { // TopLevel.class
    
    class Inner { } // TopLevel$Inner.class
    
    static class Nested { } // TopLevel$Nested.class
    
    void m() {
        
        final int i=0; // local variable
        
        class Local { 
        
            void t() {
                int j = i;
            }
        
        } // TopLevel$1Local.class
        
    }
    
    void m2() {
        class Local { } // TopLevel$2Local.class
    }
    
    void m3() {
        
        // TopLevel$1.class
        Object o = new Object() { // Anonymous class
            @Override
            public String toString() {
                return "I am Anonymous!";
            }
        };
        
    }

}
