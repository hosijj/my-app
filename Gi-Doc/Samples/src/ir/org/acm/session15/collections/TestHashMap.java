package ir.org.acm.session15.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

    /*
    Map is a member of collections framework, but doesn't extend Collection interface.
    So you don't have iterator to get the elements.
    To have the map members as another data structure (Collection):
    1- Collection<BankAccount> c = map.values();
       to convert Map to Collection
    2- Set<Map.Entry<String,BankAccount>> e = map.entrySet();
       to convert map to Set
     */

    public static void main(String[] args) {
        
        HashMap<String,BankAccount> map = new HashMap(); // Array of Entry
        map.put( "A",  new BankAccount(1234, "Ali", 1300) );
        map.put( "R", new BankAccount(1235, "Reza", 2500) );

        BankAccount o1 = map.get("A");
        System.out.println( o1.getOwner() + " : " + o1.getBalance() );

        System.out.println("----------------");

        Collection<BankAccount> c = map.values();
        for (BankAccount o : c)
            System.out.println( o.getOwner() );

        System.out.println("----------------");

        Set<Map.Entry<String,BankAccount>> e = map.entrySet();
        for (Map.Entry<String,BankAccount> o : e) {
            System.out.println( o.getKey() + " " + o.getValue().getOwner() );
        }

    }
    
}
