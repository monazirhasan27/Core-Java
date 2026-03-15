package Collection;

import java.util.ArrayList;
import java.util.*;

public class FirstUnique {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2);

        System.out.println("Original number: " + number);

        Map<Integer, Integer> freq = new LinkedHashMap<>();

        for(int nums : number){
            freq.put(nums, freq.getOrDefault(nums,0)+1);
        }

        Integer firstUnique = null;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if (entry.getValue() == 1){
                firstUnique = entry.getKey();
                break;
            }
        }

        if(firstUnique != null){
            System.out.println(firstUnique);
        }

        else {
            System.out.println("not found");
        }

    }
}
