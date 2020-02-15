package ir.org.acm.session14.inner;

public class WomanFactory {
    
    Woman getWoman(String s) {
        
        Woman w = null;

        switch(s) {
            
            case "A" : w = new Woman() {
                @Override
                void eat() {
                    System.out.println("Healthy Food...");
                }
            };
                break;
                    
            case "B" : w = new Woman() {
                @Override
                void talk() {
                    System.out.println("Little...");
                }
            };
                break;
                    
            case "C" : w = new Woman() {
                @Override
                void walk() {
                    System.out.println("Runner...");
                }
            };
                break;
            
        }
        
        return w;
        
    }

}
