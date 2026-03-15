package Amazon;

public class LongestConsecutiveOneWithKflip {

    public static int longestK(int[] num , int k){

        int left = 0;
        int countZero = 0;
        int n = num.length;
        int maxLen = 0;

        for(int right = 0; right < n; right++){

            if(num[right] == 0){
                countZero++;
            }

            while(countZero > k){
                if(num[left] == 0){
                    countZero--;
                }
                left++;
            }

            if(countZero <= k){

                int length = right - left + 1;
                maxLen = Math.max(maxLen, length);

            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] array = {1,1,1,0,0,0,1,1,1,1,0};
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};

        int k1 = 3;
        int k = 2;

        System.out.println(longestK(array, k));
    }
}
