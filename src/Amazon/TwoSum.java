package Amazon;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // Hashmap
    public static int[] Two(int[] num, int target){

        int n = num.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n-1; i++){

            int com = target - num[i];

            if(map.containsKey(com)){
                return new int[] {map.get(com), i};
            }

            map.put(num[i], i);

        }

        return new int[] {};
    }

    // Using Two pointers

//    public static int[] TwoSumTwoPointer(int[] nums, int target){
//
//        int n = nums.length;
//
//        int left = 0;
//        int right = n - 1;
//
//        while(left < right){
//
//            if(nums[left] + nums[right] == target){
//                return new int[] {left, right};
//            }
//
//            if(nums[left] + nums[right] < target){
//                left++;
//            }
//            else {
//                right--;
//            }
//
//        }
//
//        return new int[] {};
//    }

    public static void main(String[] args) {

        int[] num = {1, 2, 4, 7, 11, 15};
        int target = 15;

        int[] ans = Two(num , target);
//        int[] ans1 = TwoSumTwoPointer(num , target);

        System.out.println("Using HashMap" + Arrays.toString(ans));

//        System.out.println("Using Two pointer" + Arrays.toString(ans1));
    }
}
