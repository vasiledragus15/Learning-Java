package ForTest;

public class ForTest3 {
    public static final int SIZE = 1000;
    public static void main(String[] args) {
        for (int i = 1; i < SIZE; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
