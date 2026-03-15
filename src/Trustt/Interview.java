package Trustt;

import java.util.*;

public class Interview {


    public static void main(String[] args) {

        String s = "racerace";

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){

            map.put(ch, map.getOrDefault(ch, 0) +1);
        }

        for(char ch : s.toCharArray()){

            if(map.get(ch) == 1){
                System.out.println(ch);
                break;
            }

        }

    }
}
