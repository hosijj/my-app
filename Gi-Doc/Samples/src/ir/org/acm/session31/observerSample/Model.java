package ir.org.acm.session31.observerSample;

import java.util.Observable;

public class Model extends Observable {
    
    private String name;
    private int field;
    private int a;
    private int b;
    private int c;

    public Model(String name) {
        this.name = name;
    }
    
    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
        setChanged();
        notifyObservers();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
