import Animals.*;

public class Main {
    public static void main(String[] args) {

        Animals lion     = new Lion("Simba");
        Animals elephant = new Elephant("Dumbo");
        Animals monkey   = new Monkey("George");

        // Create zookeeper
        ZooKeeper zookeeper = new ZooKeeper("Alex");


        Animals[] animals = { lion, elephant, monkey };

        for (Animals animal : animals) {
            zookeeper.interactWithAnimal(animal);
        }
    }

        }

