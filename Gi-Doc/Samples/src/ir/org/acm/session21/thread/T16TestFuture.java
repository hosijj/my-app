package ir.org.acm.session21.thread;

import java.util.concurrent.*;

public class T16TestFuture {
    
     public static void main(String[] args) {
        
        ExecutorService executor = Executors.newSingleThreadExecutor();

        System.out.println("Before submit...");

        Future<Integer> f = executor.submit(new Callable() {

            public Object call() throws Exception {

                int sum =0;
                for (int i=0; i<10; i++) {
                    sum += i;
                    try {
                        Thread.sleep(500);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return sum;

            }

        });

        System.out.println("After submit...");
        
        System.out.println("before get...");
        
        int k = 2;
        while ( !f.isDone() ) {
             System.out.println("Still working...");
             System.out.println("K is " + k);
             k = k + 2;
             try {
                        Thread.sleep(300);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
             }
        }
        
        try {
            Integer value = f.get();
            System.out.println(value);
        } catch(Exception e) { // thread is interrupted
            e.printStackTrace();
        }    
        
        System.out.println("End of main...");
        
        executor.shutdown();

    }
    
}
