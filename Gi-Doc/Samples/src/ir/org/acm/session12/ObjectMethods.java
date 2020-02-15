package ir.org.acm.session12;

public class ObjectMethods implements Cloneable {

    int i;
    String s;
    double d;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectMethods myType = (ObjectMethods) o;

        if (i != myType.i) return false;
        if (Double.compare(myType.d, d) != 0) return false;
        return !(s != null ? !s.equals(myType.s) : myType.s != null);

    }

//    @Override
//    public int hashCode() {
//
//        int result;
//        long temp;
//        result = i;
//        result = 31 * result + (s != null ? s.hashCode() : 0);
//        temp = Double.doubleToLongBits(d);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//
//    }

    @Override
    public String toString() {

        return "ObjectMethods{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", d=" + d +
                '}';

    }

    Object myClone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public ObjectMethods clone() throws CloneNotSupportedException {
        return (ObjectMethods) super.clone();
    }

}
