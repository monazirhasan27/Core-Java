package Practice;

class Shape{

    double area(){
        System.out.println("Shape is undefined");
        return 0;
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
   double area(){
        return length*breadth;
    }
}


public class OverrideDemo {
    public static void main(String[] args) {

        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(2,3);
        System.out.println(s1.area());
        System.out.println(s2.area());
    }

}
