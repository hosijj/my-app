package ir.org.acm.session14.Comparator;

public class Human {
    
    private String name;
    private int age;
    private double weight;
    private double height;

    public Human() {
    }

    public Human(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
