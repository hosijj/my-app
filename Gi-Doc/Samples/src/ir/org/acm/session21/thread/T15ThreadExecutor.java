package ir.org.acm.session21.thread;

import ir.org.acm.session20.thread.T04HumanRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T15ThreadExecutor {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable r = new T04HumanRunnable("Ali");

        executor.submit( r ); // No need to create Thread directly!

    }

}
