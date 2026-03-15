package Collection;

import java.util.*;

public class SetVsHashMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ABC", "BCD", "ABC", "EFG", "BCD");

        //Solving using set

        Set<String> unique = new HashSet<>();
//        unique.addAll(list); // all inn one line
          for(String s : list){
              unique.add(s);
          }
          System.out.println(unique);

          //Solving Using map

          Map<String, Integer> map = new HashMap<>();

          for(String s : list){

              if(!map.containsKey(s)){
                  map.put(s,1);
                  System.out.println(s);
              }
          }

    }
}
