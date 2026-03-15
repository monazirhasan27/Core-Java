package Shreyansh.Class;

class NestedClass {
    static String company = "TechCorp";
    String role = "Developer";  // instance variable

    // Static Nested Class
    static class Nested {
        void display() {
            // ✅ Directly access static variable
            System.out.println("Company: " + company);

            // ❌ Can't directly access role
            // System.out.println(role); // Error

            // ✅ Create object of Outer to access instance variable
            NestedClass outerObj = new NestedClass();
            System.out.println("Role: " + outerObj.role);
        }
    }

}