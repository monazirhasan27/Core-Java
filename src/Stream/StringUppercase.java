package Stream;

import java.util.*;
import java.util.*;
import java.util.stream.Collectors;

public class StringUppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("monazir", "ahsan", "Hasan");

        System.out.println(names);

        List<String> uppername = names.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(uppername);

    }
}
