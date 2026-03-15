package Collection;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        //List: Ordered, but allow duplicates

        List<String> employee = new ArrayList<>();

            employee.add("Muhammed");
            employee.add("Monazir");
            employee.add("Hasan");
            employee.add("Ahsan");
            employee.add("Hasan");

          System.out.println("List: " + employee);

        //Set: unordered, but does not accept duplicates

        Set<String> newEmp = new HashSet<>(employee);
          System.out.println("Set: " + newEmp);


        // Map: Accept key-value pair.

        Map<Integer, String> EmpNumber = new HashMap<>();

            EmpNumber.put(1, "Muhammed");
            EmpNumber.put(2, "Monazir");
            EmpNumber.put(3, "Hasan");
            EmpNumber.put(4, "Ahsan");

        System.out.println("Map: " + EmpNumber);


    }
}
