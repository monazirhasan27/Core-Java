package PracticeOOPS;

public class Car1 {

    private String color;
    private int speed;

    Car1(String color, int speed){
        this.color = color;
        setSpeed(speed);
    }

    int getSpeed(){
        return speed;
    }

    void setSpeed(int speed){

        if(speed > 0){
            this.speed = speed;
        }
        else{
            System.out.println("Invalid Speed");        }
    }

    public static void main(String[] args) {

        Car1 c1 = new Car1("red", -5);

        int ans1 = c1.getSpeed();

        System.out.println(ans1);
    }
}
