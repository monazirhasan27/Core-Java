package CoreJavaPractice;

import java.util.Scanner;

public class IsPrime3 {

    public static boolean isPrime(int num){

        if(num <= 1){
            return false;
        }

        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        if(isPrime(n)){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime number");
        }
    }
}
