package Shreyansh.Interface;

import java.lang.reflect.Modifier;

public class ReflectionDemo {

    public static class Bird{

        int height = 2;
        String name = "sparrow";

        Bird(){
            System.out.println("Bird is sparrow");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

//        Class<?> obj = Class.forName("Bird");
          Class obj = Bird.class;

        System.out.println(obj.getName());
        System.out.println(Modifier.toString(obj.getModifiers()));
        System.out.println(obj.getFields());
    }
}
