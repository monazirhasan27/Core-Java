package Practice;

public class Counter {
    int count = 0;                        // instance variable (object-specific)
    static int totalCount = 0;            // static variable (shared across all objects)

    Counter(){
        count++;                         // increases only for THIS object
        totalCount++;                    // increases for ALL objects
    }

    void showCount(){

        System.out.println("This is count: " + count + ", this is totalCount: " + totalCount);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();

        c1.showCount();

        Counter c2 = new Counter();

        c2.showCount();

        Counter c3 = new Counter();

        c3.showCount();
    }
}
