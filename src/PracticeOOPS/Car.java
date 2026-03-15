package PracticeOOPS;

public class Car {

    String color;
    int speed;

    Car(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

    void drive(){
        System.out.println("The brand of the car is: " + color + " and the speed is: " + speed);
    }

    void stops(){
        speed = 0;
        System.out.println("Car has stopped: " + speed);
    }

    public static void main(String[] args) {

        Car c1 = new Car("BMW" , 999);  // creating obj c1....
        Car c2 = new Car("Mercedes" , 99);

        System.out.println(c1.color);
        System.out.println(c1.speed);
        c1.drive();

        System.out.println(c2.color);
        System.out.println(c2.speed);
        c2.drive();

        c1.stops();


    }
}
