package PracticeOOPS;

public class Student2 {

    String name;
    int age;
    String course;

    Student2(){
        this("unknow", 0, "not assigned");
    }

    Student2(String name, int age){
        this(name, age, "not assigned");
    }

    Student2(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String toString(){
        return name + " " + age + " " + course;
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2();
        Student2 s2 = new Student2("Monazir", 24);
        Student2 s3 = new Student2("Hasan", 23, "Computer Science");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
