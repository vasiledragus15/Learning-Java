package ForTest;

import java.util.Random;

public class ForTest2 {
    static Random rand = new Random();
    static int previous = rand.nextInt(100);
    public static void main (String[] args){
        while(true){
            int current = rand.nextInt(100);
            if (current == previous) {
                System.out.println("Number " + current + " equals to " + previous);
            } else if (current < previous) {
                System.out.println("Number " + current + " is lower than " + previous);
            } else {
                System.out.println("Number " + current + " is greater than " + previous);
            }
            previous = current;
        }
    }    
}
