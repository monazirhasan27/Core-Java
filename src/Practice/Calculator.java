package Practice;

//Method overloading

public class Calculator {

    void add(int a , int b){
        System.out.println(a+b);
    }
    void add(int a , int b, int c){
        System.out.println(a+b+c);
    }
    void add(int a , String d){
        System.out.println(a + d);
    }

    public static void main(String[] args) {

     Calculator myCalc = new Calculator();

     int a = 10; int b = 20; int c = 30; String d = " Mona";

     myCalc.add(a,b);
     myCalc.add(a,b,c);
     myCalc.add(a,d);

    }
}
