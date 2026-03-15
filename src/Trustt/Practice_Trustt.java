package Trustt;

class Employee{
    private int Id;
    private String age;

    public int getId(){
        return Id;
    }

    public void setId(int id){
        this.Id = id;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }
}

class Calculator{
    int sum(int a, int b){

        System.out.println("Adding two numbers");
        return a+b;
    }

}

class A extends Calculator{

    int sum(int a, int b, int c){
        return a+b+c;
    }

    @Override
    int sum(int a, int b){

        super.sum(a,b);
        System.out.println("Here overridden");
        return a+b;
    }

}


public class Practice_Trustt {

    public static void main(String[] args) {

    }
}
