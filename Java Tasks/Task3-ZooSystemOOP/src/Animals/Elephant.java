package Animals;

public class Elephant extends Animals {

     public Elephant(String name) {
         super(name, "Elephant");
     }
         @Override
         public void makeSound(){
             System.out.println(getName()+" trumpets!");
         }
         @Override
         public void performAction(){
             System.out.println(getName()+" is bathing.");
         }

     }

