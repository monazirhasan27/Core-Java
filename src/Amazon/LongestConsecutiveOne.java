package Amazon;

public class LongestConsecutiveOne {

    public static int longest(int[] num){

            //...Brute Force...TC O(n^2)
//        int maxCount = 0;
//        for(int i = 0; i < num.length; i++){
//
//            if(num[i] == 1){
//
//                int count = 0;
//                for(int j = i; j< num.length; j++){
//                    if(num[j] == 1){
//                        count++;
//                        maxCount = Math.max(maxCount, count);
//                    }
//                    else{
//                        break;
//                    }
//                }
//            }
//        }
//
//        return maxCount;

        // ... Optimized solution.. TC O(n)...

        int count = 0;
        int maxCount = 0;
        int n = num.length;

        for(int i = 0; i < n; i++){

            if(num[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int[] array = {1,1,0,1,1,1,1,0};

        System.out.println(longest(array));

    }
}
