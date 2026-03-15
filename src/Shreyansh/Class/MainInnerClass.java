package Shreyansh.Class;

public class MainInnerClass {
    public static void main(String[] args) {
        // Step 1: Create outer class object
        InnerClass outerObj = new InnerClass();

        // Step 2: Create inner class object using outerObj
        InnerClass.Inner innerObj = outerObj.new Inner();

        innerObj.display();
    }
}
