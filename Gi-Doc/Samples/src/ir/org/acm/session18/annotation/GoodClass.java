package ir.org.acm.session18.annotation;

@Good public class GoodClass {
    
    @Good int num;
    
    @Good
    GoodClass() { }
    
    @Good void m() { }
    
    void m(@Good int arg) { }

}
