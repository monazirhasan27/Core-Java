package Trustt;

import java.util.ArrayList;
import java.util.List;

public class StringJuggle {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> ans = new ArrayList<>(5);
        int i = 1;
        findPrime(i, n, ans);
        int res = 1;
        for(int k : ans) {
            res = res*k;
            System.out.println(k);
        }
        System.out.println(res);
    }



    public static void findPrime(int index, int n , List<Integer> ans){
        if(ans.size() == n){
            return;
        }
        if(index > 1) {
            boolean isPrime = true;
            for(int d = 2; d * d <= index; d++){
                if(index % d == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){

                ans.add(index);
            }
        }

        findPrime(index+1, n, ans);


    }
}
