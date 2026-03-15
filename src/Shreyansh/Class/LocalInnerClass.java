package Shreyansh.Class;

class Outer {
    void display() {
        String msg = "Hello from Local Inner Class";

        // Local Inner Class inside method
        class Local {
            void show() {
                System.out.println(msg); // can access local variable
            }
        }

        // Must create object inside method
        Local localObj = new Local();
        localObj.show();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        outerObj.display();
    }
}


