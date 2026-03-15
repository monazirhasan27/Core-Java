package Shreyansh.Interface;

// Predicate takes value and return boolean

public class Predicate {

    @FunctionalInterface
    public interface PredicateInterface<T>{
        boolean test (T t);
    }

    public static void main(String[] args) {

        PredicateInterface<Integer> obj = (num) -> {
            if(num % 2 == 0){
                return true;
            }

            else {
                return false;
            }
        };

        System.out.println(obj.test(6));;
    }
}
