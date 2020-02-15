package ir.org.acm.session13.contract;

public class Gholi implements Programmer {

    @Override
    public void code() {
        System.out.println("Gholi is coding...");
    }

    @Override
    public void doc() {
        System.out.println("Gholi is documenting...");
    }

    @Override
    public void test() {
        System.out.println("Gholi is testing...");
    }

}
