package Shreyansh.Interface;

public class LambdaExpression {

    public interface Bird{
        void canFly();
    }

    public static void main(String[] args) {

        Bird obj = () -> {
            System.out.println("Bird can fly");
        };

        obj.canFly();
    }
}
