package Shreyansh.Class;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous Inner Class overriding sound()
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };

        dog.sound(); // Dog barks
    }
}

