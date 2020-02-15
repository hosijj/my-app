package ir.org.acm.session06;

public class TestThis {

    int number; // field --> Heap

    void m() {
        this.number++;
    }

    void overwrite(int number) { // local --> stack
        this.number = number; // move from stack to heap
    }

}
