package Shreyansh.Class;

import java.util.Arrays;


/*
Common functions used in Enum:
1. values(); -> Returns all enum constants as an array, in the order they are declared
2. Ordinals(); -> Returns the index (position) of the enum constant, starting from 0, based on declaration order.
3. valueOf(); ->  Converts a String → enum constant, but the string must exactly match the enum name.
4. name(); -> Returns the exact name of the enum constant as declared in the source code
 */

enum days{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

public class EnumClass {
    public static void main(String[] args) {

        for(days d : days.values()){
            System.out.print(d.ordinal() + " ");
        }

        System.out.println();

    }
}
