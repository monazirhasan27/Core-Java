package Shreyansh.Class;

enum Role {
        ADMIN,
        USER,
        GUEST;
}

class EnumPractice {
    public static void main(String[] args) {

        for(Role r : Role.values()){
            System.out.print(r.ordinal() + " ");
            System.out.println(r);
        }

        Role adminString = Role.valueOf("ADMIN");
        System.out.println(adminString);
    }
}
