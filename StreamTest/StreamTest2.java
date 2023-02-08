package StreamTest;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest2 {

    public static void main(String[] args) {
        
        List<String> string = List.of("I", "am", "a", "list", "of", "Strings");
        List<String> result = string.stream()
                                    .limit(4)
                                    .collect(Collectors.toList());
        
        System.out.println("result = " + result);
    }    
}