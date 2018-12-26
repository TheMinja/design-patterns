package factory;

public class HumanFactory {

    public enum HumanType {
        CHILD,
        ADULT
    }

    public static Human getHuman(HumanType type, String name, int age, double height) {
        switch (type) {
            case CHILD:
                return new Child(name, age, height);
            case ADULT:
                return new Adult(name, age, height);
        }
        return null;
    }
}
