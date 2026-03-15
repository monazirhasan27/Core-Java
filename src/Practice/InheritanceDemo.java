package Practice;


class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayPerson(){
        System.out.println("Person name is " + name + " and age is " + age);
    }

}

class Son extends Person{
    int roll;
    int marks;

    Son(String name, int age, int roll, int marks){
        super(name, age);
        this.roll = roll;
        this.marks = marks;
    }

    void displaySon(){
        System.out.println("Son name is " + name + ", age is " + age + ", roll is " + roll + ", marks is " + marks);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Person p = new Person("Monazir", 27);
        p.displayPerson();

        Son s = new Son("Monazir", 27, 69, 99);
        s.displaySon();

    }
}
