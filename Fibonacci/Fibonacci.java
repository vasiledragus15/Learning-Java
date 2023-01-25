package Fibonacci;

public class Fibonacci {
    int f0 = 0;
    int f1 = 1; 
    int result;
   
    public void calculateFibonacci(int fn) {
        if(fn < 0) {
            System.out.println("Value out of bound");
        }
        if(f0 == fn) {
            System.out.println(f0);
        }
        for(int i = 2; i <= fn; i++){
            if(i == 2) {
                System.out.print(f0 + " " + f1);
            }
            System.out.print(" " + (result = f0 + f1));
            f0 = f1;
            f1 = result;
        }
    }
}
