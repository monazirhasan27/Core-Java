package CollectionsByRiddhi;

import java.util.PriorityQueue;

public class PriorityQueueCustomObject {


    static class Result{

        String name;
        int marks;

         Result(String name, int marks){
            this.name = name;
            this.marks = marks;
        }

        @Override
        public String toString(){
             return name + "(" + marks + ")";
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Result> pq = new PriorityQueue<>((a,b) -> b.marks - a.marks);

//        Result obj1 = new Result("Monazir", 99);
//        Result obj2 = new Result("Faizan", 100);
//        Result obj3 = new Result("Hasan", 97);

        pq.add(new Result("Monazir", 99));
        pq.add(new Result("Faizan", 100));
        pq.add(new Result("Hasan", 97));

        System.out.println(pq);

        System.out.println(pq.toString());

    }
}
