package Amazon;

import java.util.HashMap;
import java.util.Map;

public class subarrayWithSumK {

    public static int subarray(int[] num, int k){


        // ...Brute force...
//        int count = 0;
//
//        for(int i = 0; i < num.length; i++){
//               int sum = 0;
//            for(int j = i; j < num.length; j++){
//
//                sum = sum + num[j];
//
//                if(sum == k){
//                    count++;
//                }
//
//            }
//        }
//        return count;

        // ....Sliding Window appoach... valid only for positive numbers...

//        int n = num.length;
//        int left = 0;
//        int sum = 0, count = 0;
//
//        for(int right = 0; right < n; right++){
//
//            sum += num[right];
//
//            while(sum > k){
//                sum = sum - num[left];
//                left++;
//            }
//
//            if(sum == k){
//                count++;
//            }
//        }
//
//        return count;


         // ....prefix sum + hasing concept... Valid in every case and TC = O(n)....

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int currentSum = 0;
        int count = 0;

        for(int x : num){

            currentSum += x;

            if(map.containsKey(currentSum - k)){
                count = count + map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] array = {1,1,1};
        int k = 2;

        System.out.println(subarray(array, k));

    }
}
