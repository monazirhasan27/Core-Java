package CoreJavaPractice;

import java.util.Scanner;

public class HelloBackend2 {
    public static void main(String[] args) {
        System.out.println("I am becoming a backend developer");
        System.out.println(10 + 20);

        String name = "Monazir";
        int age = 24;
        double salary = 120000;
        boolean isBackendDeveloper = true;

        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My salary is " + salary);
        System.out.println("My isBackendDeveloper is " + isBackendDeveloper);

        int number = 15;

        if(number % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        if(number > 0){
            System.out.println("Postive");
        }
        else if(number < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        Scanner in = new Scanner(System.in);
        int a = in.nextByte();

        if(a % 3 == 0 && a % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(a % 5 == 0){
            System.out.println("Buzz");
        } else if (a % 3 == 0) {
            System.out.println("Fizz");
        }
        else{
            System.out.println(a);
        }

        Scanner inp = new Scanner(System.in);
        int num = inp.nextByte();
//        int sum = 0;
        for(int i = 1; i <=num; i++){
            System.out.print(i + " ");
//            sum = sum + i;
        }
        System.out.println();
        System.out.println("sum is " + num * (num + 1)/2);
    }
}
