package CollectionsByRiddhi;

import java.util.Stack;

public class StackHello {
    public static void main(String[] args) {

        //LIFO order...

        Stack<Integer> st = new Stack<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.push(6);

        st.remove(0);
        st.pop();

        System.out.println(st);

        System.out.println(st.toString());

    }
}
