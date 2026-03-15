package Practice;

public class Student {
    int rollNo;
    String name;

    Student(){
        rollNo = 69;
        name = "Default Constructor";

    }

    Student(int roll, String Name){
        this.rollNo =roll;
        this.name = Name;
    }

    Student(Student s){
        this.rollNo = s.rollNo;
        this.name = s.name;
    }

    void display(){
        System.out.println("Roll no: " + rollNo + ", Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(69, "Monazir");
        s2.display();

        Student s3 = new Student(s2);
        s3.display();

    }
}
