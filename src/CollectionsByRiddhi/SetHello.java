package CollectionsByRiddhi;

import java.util.*;

public class SetHello {
    public static void main(String[] args) {

        // Note: Set does ot allow duplicates
        // HashSet: Fast and Unordered.

        System.out.println(".....operating on HashSet..... ");

        Set<Integer> st = new HashSet<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(2);

        for(int x : st){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(st.size());
        System.out.println(st);  // Output: [1,2,3], Set does not allow duplicates.

        st.remove(3);

        System.out.println(st);
        System.out.println(st.contains(3));

        // TreeSet: Ordered but slow.

        System.out.println(".....operating on TreeSet..... ");

        Set<Integer> st1 = new TreeSet<>();

        st1.add(10);
        st1.add(11);
        st1.add(9);
        st1.add(7);
        st1.add(9);
        st1.add(1);

        System.out.println(st1);

        System.out.println(".....operating on LinkedHasSet..... ");

        Set<Integer> st2 = new LinkedHashSet<>();

        st2.add(1);
        st2.add(5);
        st2.add(4);
        st2.add(2);
        st2.add(3);

        System.out.println(st2);

    }
}
