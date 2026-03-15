package Amazon;

public class LongestConsecutiveSequence {

    public static int longest(int[] nums){

        int n = nums.length;
        int maxCount = 1;

        for(int i = 0; i < n; i++){

            int count = 1;
            int current = nums[i]; // 1

            for(int j = 0; j < n; j++){

                if(i == j){
                    continue;
                }

                if(nums[j] == current + 1){

                    count++;
                    maxCount = Math.max(count, maxCount);
                    current++;
                    j = 0;
                }
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {

        int[] array = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longest(array));

    }
}
