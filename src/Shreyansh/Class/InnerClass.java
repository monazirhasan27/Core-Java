package Shreyansh.Class;

public class InnerClass {
    String role = "Developer";     // instance variable
    static String company = "TechCorp"; // static variable

    // Inner Class (non-static)
    class Inner {
        void display() {
            // ✅ Can access both instance & static members of Outer
            System.out.println("Role: " + role);
            System.out.println("Company: " + company);
        }
    }
}
