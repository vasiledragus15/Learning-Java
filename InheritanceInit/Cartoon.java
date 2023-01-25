package InheritanceInit;

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }
    /*
     *  Exercise that shows how constructors work when using 
     *  inheritance, in particular the base class is initialized
     *  before the derived-class constructors can access it
     */
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
