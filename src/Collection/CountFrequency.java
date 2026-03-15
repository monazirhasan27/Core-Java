package Collection;

// Q2. Count the frequency of each word in a list

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList(
                "apple", "banana", "orange", "apple",
                "banana", "apple", "orange", "banana"
        );

        System.out.println("original list: " + fruits);

        Map<String, Integer> freq = new HashMap<>();

        for(String fruit : fruits){
            freq.put(fruit, freq.getOrDefault(fruit, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
