package Inheritance;

public class Detergent extends Cleanser {
    
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // calls the base class version of the method
    }
    public void foam () {
    append(" foam()");
    }
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base clas:");
        Cleanser.main(args);
    }
}
