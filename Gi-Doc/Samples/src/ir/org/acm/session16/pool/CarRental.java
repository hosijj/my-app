package ir.org.acm.session16.pool;

import java.util.ArrayList;

public final class CarRental { // Pool
    
    private static CarRental instance = null;
    
    private final static int INITIAL_NUMBER_OF_OBJECT = 3;
    private final static int MAX_NUMBER_OF_OBJECT = 5;
    
    private ArrayList<Car> freeList = new ArrayList<Car>(MAX_NUMBER_OF_OBJECT);
    private ArrayList<Car> usedList = new ArrayList<Car>(MAX_NUMBER_OF_OBJECT);
    
    private void addToPool(int number) {
        for (int i=0; i < number; i++) 
                freeList.add( new Car() );
    }
    
    private CarRental(){
        addToPool(INITIAL_NUMBER_OF_OBJECT);
    }
    
    public static CarRental getInstance(){
        if (instance == null) instance = new CarRental();
        return instance;
    }
    
    public Car borrow() {

        Car c = null;
        
        if (usedList.size() < MAX_NUMBER_OF_OBJECT
                && freeList.size() == 0) addToPool(1);
        
        if (!freeList.isEmpty()){
            c = freeList.get(0);
            usedList.add(c);
            freeList.remove(c);
        } else {
            System.out.println("Sorry!, No Car is Available!");
            return null;
        }
        
        return c;
    }
    
    public void release (Car c) {
        
        if ( c != null && usedList.contains(c) ){
            usedList.remove(c);
            freeList.add(c);
        }
        
    }

    public void report() {
        System.out.println("---------------------");
        System.out.println("Free Cars: " + freeList.size());
        System.out.println("Used Cars: " + usedList.size());
    }
    
}
