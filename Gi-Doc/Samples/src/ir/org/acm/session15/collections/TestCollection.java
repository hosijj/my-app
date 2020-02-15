package ir.org.acm.session15.collections;

import java.util.*;

public class TestCollection {
    
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount(1234, "A", 1000);
        BankAccount acc2 = new BankAccount(1235, "B", 500);
        BankAccount acc3 = new BankAccount(1236, "C", 200);
        
        TestCollection t = new TestCollection();
        
        BankAccount[] list1 = {acc1, acc2, acc3};
        System.out.println( t.getTotal1( list1  ) ) ;
        
        ArrayList<BankAccount> list2 = new ArrayList<BankAccount>();
        list2.add(acc1);
        list2.add(acc2);
        list2.add(acc3);
        System.out.println( t.getTotal2( list2 ) ) ;
        
        System.out.println( t.getTotal3( list2 ) ) ;
        
        System.out.println( t.getTotal4( list2 ) ) ;

    }
    
    long getTotal1(BankAccount[] list) {
        
        long sum = 0;

        /*
        for (BankAccount ba : list)
            sum += ba.getBalance();
        */
        for (int i=0; i < list.length; i++)
            sum += list[i].getBalance();

        return sum;
        
    }
    
    long getTotal2(ArrayList<BankAccount> list) {
        
        long sum = 0;
        /*
        for (BankAccount ba : list)
            sum += ba.getBalance();
        */        

        for (int i=0; i < list.size(); i++)
            sum += list.get(i).getBalance();
        
        return sum;
        
    }
    
    long getTotal21(ArrayList list) {
        
        long sum = 0;
        /*
        for (BankAccount ba : list)
            sum += ba.getBalance();
        */        

        for (int i=0; i < list.size(); i++)
            sum += ((BankAccount)list.get(i)).getBalance();
        
        return sum;
        
    }
    
    long getTotal3(List<BankAccount> list) {
        
        long sum = 0;
        /*
        for (BankAccount ba : list)
            sum += ba.getBalance();
        */
        
         for (int i=0; i < list.size(); i++)
            sum += list.get(i).getBalance();
         
        return sum;
        
    }
    
    long getTotal4(Collection<BankAccount> c) {
        
        long sum = 0;
        /*
        for (BankAccount ba : c)
            sum += ba.getBalance();
        */
        
        Iterator it = c.iterator();
        while( it.hasNext() ) {
            BankAccount ba = (BankAccount) it.next();
            sum += ba.getBalance();
        }
        
        Iterator<BankAccount> it2 = c.iterator();
        while( it2.hasNext() )
            sum += it2.next().getBalance();

        Vector i;

        return sum;
        
    }
    
}
