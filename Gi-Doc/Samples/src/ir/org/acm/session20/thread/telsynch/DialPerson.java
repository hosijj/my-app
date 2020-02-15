package ir.org.acm.session20.thread.telsynch;

public class DialPerson extends Thread {
    
    private String name;
    private TelHandSet ths;

    public DialPerson(String name, TelHandSet ths) {
        this.name = name;
        this.ths = ths;
    }
  
    public void run() {
      ths.dial(name);
    }
    
}  