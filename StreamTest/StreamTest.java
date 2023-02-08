package StreamTest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
     
        List<String> string = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = string.stream();
        List<String> result2 = stream.limit(4).collect(Collectors.toList());
        System.out.println("result = " + result2);
    }
    
}