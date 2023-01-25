package constructorexample;

public class UninitializedStringTest {
    public static void main (String[] args) throws Throwable {
        UninitializedString uninitializedString = new UninitializedString();
        uninitializedString.string1 = "Suca";
        System.out.println(uninitializedString.string1);
        InitializedString initializedString = new InitializedString("Ciao");
        System.out.println(initializedString.string2);
    }

    
}
