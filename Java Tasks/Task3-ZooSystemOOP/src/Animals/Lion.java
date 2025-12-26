package Animals;

public class Lion extends Animals{
    public Lion (String name){
        super(name,"Lion");
    }
    @Override
    public void makeSound(){
        System.out.println(getName()+" roars!");
    }
    @Override
    public void performAction(){
        System.out.println(getName()+" is hunting preys.");
    }
}
