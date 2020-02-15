
package ir.org.acm.session31.strategy;

public class TestWomanEmotion {
    
    public static void main(String[] args) {
        
        Woman w = new Woman();
        
        w.setEmotion( new Angry() );
        w.talk();
        w.eat();
        
        System.out.println("Give a Gift!");
        
        w.setEmotion( new Happy() );
        w.talk();
        w.eat();
        
    }

}
