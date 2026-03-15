package CollectionsByRiddhi;

import java.util.*;

public class MapHello {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Monazir", 1);
        map.put("Hasan", 2);
        map.put("Ahsan", 3);
        map.put("Ahsan", 4);

        System.out.println(map.size());

        System.out.println(map);
        System.out.println(map.get("Monazir"));

        // How to loop through HahMap?

        // 1. Iterating for value.
        for(Integer x : map.values()){
            System.out.println(x);
        }

        // 2. Iterating for key and value.
        for(String x : map.keySet()){
            System.out.println(x + "->" + map.get(x));
        }

        // 3. Using Map.entrySet() with For-Each Loop

        for(Map.Entry<String, Integer> x : map.entrySet()){
            System.out.println(x.getKey() + "->" + x.getValue());
        }
    }
}
