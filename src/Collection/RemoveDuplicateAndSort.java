package Collection;
import java.util.*;

// Q1. Remove duplicates from a list of integers and print them in sorted order.

import java.util.ArrayList;

public class RemoveDuplicateAndSort {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2);

        System.out.println(numbers);

        Set<Integer> nums = new TreeSet<>(numbers);

        System.out.println(nums);
    }
}
