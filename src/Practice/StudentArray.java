package Practice;

public class StudentArray {
    int roll;
    String name;
    int marks;

    StudentArray(int roll, String name, int marks){

        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("The details are: " + "Roll Number is " + roll + ", Name is " + name + ", and marks is " + marks);
    }

    public static void main(String[] args) {

        StudentArray[] students = new StudentArray[5];

        students[0] = new StudentArray(1, "Monazir", 85);
        students[1] = new StudentArray(2, "Rahul", 90);
        students[2] = new StudentArray(3, "Anjali", 75);
        students[3] = new StudentArray(4, "Sneha", 95);
        students[4] = new StudentArray(5, "Arjun", 80);


        for(int i = 0; i < students.length; i++){
            students[i].display();
        }
    }
}
