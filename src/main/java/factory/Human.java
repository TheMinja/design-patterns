package factory;

public abstract class Human {

    public abstract String getName();
    public abstract int getAge();

    /**
     *
     * @return height in inches
     */
    public abstract double getHeight();

    @Override
    public String toString(){
        return "Name: " + this.getName()+ " Age: " + this.getAge() + " Height: " + this.getHeight();
    }
}
