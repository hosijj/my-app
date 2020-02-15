package ir.org.acm.session12.cloning;

public class Sheep implements Cloneable {
    
    char d;
    char n;
    char a;

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

}
