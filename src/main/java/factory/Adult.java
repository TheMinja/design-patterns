package factory;

public class Adult extends Human {

    private String name;
    private int age;
    private double height;

    public Adult(String name, int age, double height){
        this.name = name;
        this.age = Math.max(age, 100);
        this.height = height;
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
