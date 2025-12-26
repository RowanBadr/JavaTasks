import Animals.Animals;

public class ZooKeeper {
    private  String name;

    public ZooKeeper(String name){
        this.name=name;
    }

    public void interactWithAnimal(Animals animal) {
        System.out.println("== Zookeeper " + name + " is interacting with " + animal.getName() + " ==");

        animal.displayInfo();
        animal.makeSound();
        animal.performAction();
        animal.eat();

        System.out.println("--------------------------------------");
    }



}
