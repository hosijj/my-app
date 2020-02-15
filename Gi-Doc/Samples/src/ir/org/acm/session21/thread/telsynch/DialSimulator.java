package ir.org.acm.session21.thread.telsynch;

public class DialSimulator {
    
     public static void main(String[] args) {
         
         TelHandSet ths = new TelHandSet();
         
         new DialPerson("Sara",     ths).start();
         new DialPerson("Elnaz",    ths).start();
         new DialPerson("Mahdiyeh", ths).start();
         
     }
    
}
