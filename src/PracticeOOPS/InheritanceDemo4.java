package PracticeOOPS;

class Person {

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Student extends Person{

    String course;

    Student(String name, int age, String course){
        super(name, age);
        this.course = course;
    }

    @Override
    void display(){
        System.out.println("Name: " + name + " Age: " + age + "course: " + course);
    }
}

class InheritanceDemo4{
    public static void main(String[] args){

        Person p1 = new Person("p1", 18);
        p1.display();

        Student s1 = new Student("Monazir", 24, "CSE");
        s1.display();

        Person p2 = new Student("p2", 19, "CSE");
        p2.display();
    }
}

