package Flower;

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor with int arg only, petalCount = " + petalCount);
    }
    Flower(String ss) {
        System.out.println("Constructor with String args only, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);
        this.s = s; 
        System.out.println("String and int args");
    }
    Flower() {
        this("hi", 47);
        System.out.println("Default constructor (no args)");
    }
    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + ", s = " + s);
    }
    public static void main(String[] args) {
        Flower f1 = new Flower();
        f1.printPetalCount();
    
    }
}
