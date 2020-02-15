package ir.org.acm.session17.exception;

public class My implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close() called!");
    }

    void m() throws Exception {

        if (true) throw new Exception("E1");

    }


}
