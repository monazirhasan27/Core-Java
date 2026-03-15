package PracticeOOPS;

public class Counter3 {

    int count;
    static int totalCount;

    Counter3(){
        count++;
        totalCount++;
    }

    public static void main(String[] args) {

        Counter3 c1 = new Counter3();
        Counter3 c2 = new Counter3();
        Counter3 c3 = new Counter3();

        System.out.println(c1.count);
        System.out.println(c2.count);
        System.out.println(c3.count);

        System.out.println(Counter3.totalCount);
    }
}
