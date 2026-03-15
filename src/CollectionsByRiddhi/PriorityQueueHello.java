package CollectionsByRiddhi;

import java.util.PriorityQueue;

// PriorityQueue follow min-heap by default -> means smallest value have the highest priority...


public class PriorityQueueHello {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);

        System.out.println("Elements in the PriorityQueue are: " + pq);

        pq.poll();

        System.out.println("pq after 1 poll: " + pq);


        // How will you build max-heap priorityQueue?
        // Note: PriorityQueue guarantees order ONLY when you remove elements (poll()), not when you print the queue.

        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a,b) -> b - a);

        pq1.add(10);
        pq1.add(5);
        pq1.add(20);

        pq1.poll();

        System.out.println("Elements in the max-heap PriorityQueue are: " + pq1);

//        pq.poll();
//        System.out.println("pq after 1 poll: " + pq1);


        // How to print PriorityQueue in order?

        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b) -> b - a);

        pq2.add(10);
        pq2.add(5);
        pq2.add(20);

        while(!pq2.isEmpty()){
            System.out.print(pq2.poll() + " ");
        }

    }
}
