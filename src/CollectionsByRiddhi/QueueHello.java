package CollectionsByRiddhi;

import java.util.LinkedList;
import java.util.Queue;

public class QueueHello {
    public static void main(String[] args) {

        //FIFO Queue

        Queue<Integer> q = new LinkedList<>();

        q.add(1);         // Inserts the specified element; throws exception if insertion fails.
        q.add(2);
        q.offer(3);    // Inserts the specified element; returns false if insertion fails.
        q.offer(4);
        q.offer(5);
        q.offer(6);

        q.remove();      // Removes and returns the head of the queue; throws exception if empty.
        q.poll();        // Removes and returns the head; returns null if empty.

        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());

        System.out.println(q);

    }

}
