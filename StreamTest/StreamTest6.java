package StreamTest;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest6 {

    public static void main(String[] args) {
        
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        List<String> limit = strings.stream()
                                    .limit(4)
                                    .collect(Collectors.toList());
        System.out.println("strings = " + strings);
        System.out.println("result = " + limit);

    }
    
}