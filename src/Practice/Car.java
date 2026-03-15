package Practice;

// Focus: class, object, method calling.

public class Car {

    String color = "Red";
    int speed = 100;

    void drive(){
        System.out.println("Car is driving at speed: " + speed);
    }

    void stop(){
        System.out.println("car is stopped");
    }

    public static void main(String[] args) {

        Car myCar = new Car(); // This is object creation.

        System.out.println("The color of my car is " + myCar.color); // Printing the color of the car
        myCar.drive(); // calling method
        myCar.stop();

    }
}


