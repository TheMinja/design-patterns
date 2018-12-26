package singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("EagerSingleton");
    }

    public static void main(String[] args) {
        EagerSingleton.getInstance().print();
    }
}
