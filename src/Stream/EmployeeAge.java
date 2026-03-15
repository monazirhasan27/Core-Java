package Stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employeee{
    private String name;
    private int age;

    Employeee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return name + "("+ age + ")";
    }
}


public class EmployeeAge {
    public static void main(String[] args) {

        List<Employeee> emp = Arrays.asList(
                new Employeee("Monazir", 25),
                new Employeee("Ahsan", 26),
                new Employeee("Hasan", 27)
        );

        List<String> name = emp.stream()
                .filter(e -> e.getAge() > 25)
                .map(Employeee::getName)
                .collect(Collectors.toList());

        System.out.println(name);

    }
}
