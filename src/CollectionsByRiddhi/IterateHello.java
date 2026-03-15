package CollectionsByRiddhi;

import java.util.Iterator;
import java.util.*;

public class IterateHello {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get an iterator for the ArrayList
        Iterator<String> it = cars.iterator();
//
//        // Iterate through the list using the iterator
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Or you can iterate using for-each loop as well.

               /* for(String x : cars){
                    System.out.println(x);
                }*/
    }
}
