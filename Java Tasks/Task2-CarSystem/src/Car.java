public class Car {

    public String brand;
    public String model;
    public int year;
    public double speed;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public void accelerate(double increment) {
        speed += increment;
        System.out.println(brand + " accelerated by " + increment + " km/h. Current speed: " + speed);
    }

    public void brake(double decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + " slowed down by " + decrement + " km/h. Current speed: " + speed);
    }
    public void honk(){
        System.out.println(brand + " " + model + " says: Beep beep!");
    }

    public void displayInfo() {
        System.out.println("Car Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Current Speed: " + speed);

    }
}



