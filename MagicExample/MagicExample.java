package MagicExample;

public class MagicExample {
    private static final int SIZE = 100;

    public static void main(String[] args) {
        double [] array = new double[100];
        double sum = 0;
        for(int i = 0; i < SIZE; i++){
            array[i] = Math.random();
            sum = sum + array[i];
        }
        System.out.println("Sum " + sum);
    }
}
