import factory.Human;
import factory.HumanFactory;

public class Main {

    public static void main(String[] args) {
        Human child = HumanFactory.getHuman(HumanFactory.HumanType.CHILD,
                "Jill", 10, 49);

        Human adult = HumanFactory.getHuman(HumanFactory.HumanType.ADULT,
                "Josephine", 34, 65);

        System.out.println("child: " + child.toString());
        System.out.println("adult: " + adult.toString());
    }
}
