package ListCharacters;

public class ListCharacters {
    public static void main (String[] args) {
        for (char c = 0; c < 128; c++ ) {
            if (Character.isUpperCase(c)) {
                System.out.println("value: " + (int)c + "\tcharacter: " + c);
            }   else if (Character.isLowerCase(c)) {
                System.out.println("value: " + (int)c + "\tcharacter: " + c);
            } else if (!Character.isLowerCase(c) && !Character.isUpperCase(c)) {
                System.out.println("value: " + (int)c + "\tcharacter: " + c);
            }
            
        }
    }   
}
