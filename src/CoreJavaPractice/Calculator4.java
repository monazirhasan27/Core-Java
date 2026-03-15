package CoreJavaPractice;

public class Calculator4 {

    public int add(int a , int b){
        return a+b;
    }

    public int sub(int a , int b){
        return a-b;
    }

    public int mul(int a , int b){
        return a*b;
    }

    public static void main(String[] args) {

        Calculator4 c = new Calculator4();

        int ans = c.add(5,10);
        System.out.println(ans);

        int ans1 = c.sub(10 ,5);
        System.out.println(ans1);


    }
}
