package Shreyansh.Interface;

public class TestInterfaceClass {

    interface test1{
        void show1();
    }
    interface test2{
        void show2();
    }

    static class test implements test1, test2 {
        public void show1(){
            System.out.println("implemented in class show1");
        }

        public void show2(){
            System.out.println("Implemented in class show2");
        }
    }

    public static void main(String[] args) {
            test obj = new test();

            obj.show1();
            obj.show2();
    }
}
