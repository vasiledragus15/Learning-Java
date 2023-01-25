package Inheritance;

public class Sanitizer extends Detergent {
    
    public void scrub() {
        append(" Sanitizer.scrub()");
        //super.scrub();
    }
    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        Sanitizer x = new Sanitizer();
        x.sterilize();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
