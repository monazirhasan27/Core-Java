package CollectionsByRiddhi;

import java.util.*;

public class HashMapHello {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Mo");
        map.put(2, "Na");
        map.putIfAbsent(2, "BMW");
        map.putIfAbsent(3, "ford");

        //for printing values only.
        for(String x : map.values()){
            System.out.println(x);
        }

        //for printing key and values both

        for(int x : map.keySet()){
            System.out.println(x + " -> " + map.get(x));
        }

        //printing using Entry.set

        for(Map.Entry<Integer, String> st : map.entrySet()){
            System.out.println(st.getKey() + " -> " + st.getValue());
        }
    }
}
