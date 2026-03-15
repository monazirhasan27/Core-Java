package CollectionsByRiddhi;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeHello {
    public static void main(String[] args) {

        // DEQUE = Double Ended Queue (Insert/remove BOTH SIDES)

        /*
        Operation	    Meaning
        addFirst(x)	    insert at front
        addLast(x)	    insert at back
        pollFirst()	    remove from front
        pollLast()	    remove from back
        peekFirst()	    see front
        peekLast()	    see back

         */

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);

        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);

        dq.pollLast();
        dq.pollFirst();

        System.out.println(dq);
    }
}
