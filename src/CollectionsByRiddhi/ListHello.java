package CollectionsByRiddhi;

// Learning List:
// class that implements List interface are: ArrayList, LinkedList and vector.
// list is same as array but can be re-size and follow 0 indexing

import java.util.*;

public class ListHello {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1); // index 0
        list.add(2); // index 1
        list.add(3); // index 3
        list.add(5);
        list.add(4);

//       List<Integer> ans =  list.subList(1,3);
//        System.out.println(ans);

//        Collections.sort(list);   // reverse in ascending order
//        Collections.sort(list, Collections.reverseOrder());  // Reverse descending order.

        for(int x : list){
            System.out.println(x);
        }

        // How to convert list into Array??....VVI for Leetcode

        Integer[] arr = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr));

          for(int x : arr){
              System.out.print(x + " ");
          }

//        System.out.println(list.size());

    }
}
