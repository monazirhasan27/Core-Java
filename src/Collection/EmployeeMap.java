package Collection;

import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) {

        Map<Integer, String> employee = new TreeMap<>();

        employee.put(1, "Muhammed");
        employee.put(3,"Mona");
        employee.put(2, "Hasan");

        System.out.println(employee);

        for (Map.Entry<Integer, String> entry : employee.entrySet()){
            System.out.println("ID" + entry.getKey() +" -> " + entry.getValue());
        }

    }
}
