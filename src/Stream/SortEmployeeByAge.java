package Stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private int age;

    Employee(int id,String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

public class SortEmployeeByAge {
    public static void main(String[] args) {

     List<Employee> employee = Arrays.asList(
             new Employee(1,"Mona", 25),
             new Employee(2, "Hasan", 27),
             new Employee(3, "Ahsan", 28)
     );

     List<Employee> sort = employee.stream()
             .sorted((e1, e2) -> e1.getAge() - e2.getAge())
             .collect(Collectors.toList());

        sort.forEach(System.out::println);

        System.out.println();

        List<Employee> ageGreater = employee.stream()
                .filter(e -> e.getAge() > 25)
                .collect(Collectors.toList());

        ageGreater.forEach(System.out::println);
    }
}
