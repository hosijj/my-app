package ir.org.acm.session14.inner;

import ir.org.acm.session08.banking.entity.BankAccount;

public class Woman extends Human {
    
    private int x;
    
    class Baby extends Human { // Inner

        @Override
        void talk() {

            System.out.println("Baby is Crying...");
            x=12;

            Human khodam   = this;
            Human outeram  = Woman.this;

        }
    
    }
    
    static class S { } // Nested
    
    void giveBirth() {
        
        class Infant extends Human { // Local

            @Override
            void walk() {
                System.out.println("Infant is kicking...");
            }
            
        }
        
        new Infant().walk();
        
    }
    
    Human giveBirth2() {
        
        class Infant extends Human {

            @Override
            void walk() {
                System.out.println("Infant is kicking...");
            }

        }
        
        return new Infant();
        
    }
    
     Human giveBirth3() {

        return new Human() { // Anonymous Class
            @Override
            void walk() {
                System.out.println("Infant is kicking...");
            }

        }; 
        
    }
    

}
