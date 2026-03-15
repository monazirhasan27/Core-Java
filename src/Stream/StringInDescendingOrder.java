package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StringInDescendingOrder {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Orange");

        System.out.println(fruits);

//        List<String> fruit = fruits.stream()
//                .sorted((a, b) -> b.compareTo(a))
//                .collect(Collectors.toList());

        List<String> fruit = fruits.stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());

        System.out.println(fruit);

    }
}
