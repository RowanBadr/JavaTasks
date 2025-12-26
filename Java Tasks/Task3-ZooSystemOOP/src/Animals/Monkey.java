package Animals;

public class Monkey extends Animals {

    public Monkey(String name) {
        super(name, "Monkey");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "screeches excitedly!");
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " is swinging from tree to tree.");
    }
}
