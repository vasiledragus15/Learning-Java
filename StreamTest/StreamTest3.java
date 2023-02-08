package StreamTest;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest3 {
    
    public static void main(String[] args) {
    
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        List<String> result = strings.stream()
                                     .sorted()
                                     .limit(4)
                                     .collect(Collectors.toList());
        System.out.println("result = " + result);                           
    }    
}