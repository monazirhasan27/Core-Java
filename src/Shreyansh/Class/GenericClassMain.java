package Shreyansh.Class;

class GenericClassTest<T>{
    T value;

    GenericClassTest(T value){
        this.value = value;
    }

    public void setValue(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }
}


public class GenericClassMain {
    public static void main(String[] args) {

        // for Integer

        GenericClassTest<Integer> obj1 = new GenericClassTest<>(100);
        System.out.println("Integer: " + obj1.getValue());


        //For String

        GenericClassTest<String> obj2 = new GenericClassTest<>("Mona");
        System.out.println("String: " + obj2.getValue());

        //for double

        GenericClassTest<Double> obj3 = new GenericClassTest<>(8.00);
        System.out.println("Double: " + obj3.getValue());


        //Raw type object

//        GenericClassTest rawTypePrintObj = new GenericClassTest();
//
//        rawTypePrintObj.setValue(1);
//        rawTypePrintObj.setValue("Hello");
    }
}
