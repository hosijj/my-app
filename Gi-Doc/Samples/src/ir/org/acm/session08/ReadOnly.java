package ir.org.acm.session08;

public class ReadOnly { // Immutable

    private final int value;

    public ReadOnly(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
