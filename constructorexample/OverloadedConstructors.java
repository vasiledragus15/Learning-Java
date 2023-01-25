package constructorexample;

public class OverloadedConstructors {
    OverloadedConstructors() {
      this(1, "pezzo di merda");
    }
    OverloadedConstructors(int num, String str) {
     System.out.println(num + " " + str);   
    }
    public static void main(String[] args) {
        OverloadedConstructors oc1 = new OverloadedConstructors();
    }
}
