package ir.org.acm.session21.thread.waitnotify;

import java.util.ArrayList;

public class Child extends Thread {

       private String name;
       private ArrayList dish;

       public Child(String n, ArrayList d) {
               name = n;
               dish = d;
       }

       public void run() {

           synchronized(dish) {

               System.out.println(name + " sees " + dish.size() + " cookies");
               if (dish.size() >= 1) {
                   System.out.println(name + " starts eating...");
                   dish.remove(dish.size() - 1);
                   return; // End of this thread
               }

               while (dish.size() < 1) {
                   try {
                       System.out.println(name + " is waiting for cookie...");
                       dish.wait(); // continue after notify()
                   } catch (InterruptedException e) { /* End of this thread */ }
               }

               System.out.println(name + " sees " + dish.size() + " cookies and starts eating...");
               dish.remove(dish.size() - 1);
               // end of this thread

           }

       }

}  