package factory;

public class Child extends Human {

    private String name;
    private int age;
    private double height;

    public Child(String name, int age, double height){
        this.name = name;
        this.age = Math.min(age, 12);
        this.height = Math.min(height, 59);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
