//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Porche", "911", 2022);
        Car car2 = new Car("Ferrari", "F8 Tributo", 2021);

        car1.displayInfo();
        car2.displayInfo();


        car1.accelerate(30);
        car2.accelerate(50);


        car1.brake(10);
        car2.brake(20);


        car1.honk();
        car2.honk();


        car1.displayInfo();
        car2.displayInfo();
    }
}



