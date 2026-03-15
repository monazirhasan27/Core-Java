package CoreJavaPractice;

public class HelloMethod3 {

    public static int add(int a, int b){
        return a+b;
    }

    public static void changeVal(int x){

        x = 100;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int result = add(a,b);

        System.out.println(result);

       int x = 50;
       changeVal(x);
        System.out.println(x);
    }
}
