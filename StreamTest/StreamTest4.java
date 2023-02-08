package StreamTest;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest4 {

    public static void main(String[] args) {
        
        List<String> stringList = List.of("I", "am", "a", "list", "of", "Strings");
        
        List<String> result = stringList.stream()
                                        .sorted((s1,s2) -> s1.compareToIgnoreCase(s2))
                                        .limit(4)
                                        .collect(Collectors.toList());
        System.out.println("result = " + result);
    }    
}