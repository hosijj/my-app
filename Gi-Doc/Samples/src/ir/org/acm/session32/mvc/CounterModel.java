package ir.org.acm.session32.mvc;

import java.util.Observable;

public class CounterModel extends Observable {
    
    private int counter = 0;
    
    public void increase() {
        counter++;
        setChanged();
        notifyObservers(counter);
    }
    
    public void decrease() {
        counter--;
        setChanged();
        notifyObservers(counter);
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
}
