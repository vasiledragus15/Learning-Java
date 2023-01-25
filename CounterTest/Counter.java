package CounterTest;

public class Counter {
    private int countValue;

    public Counter() {
        this.countValue = 0;
    }
    
    public int getValue() {
        return countValue;
    }

    public void increment() {
        this.countValue++;
    }

    static void countInArray(int[] array, int elem, Counter c) {
        for (final int i : array) {
            if (i == elem) {
                c.increment();
            }
        }
    }

    static void countInMatrix(int[][] matrix, int elem, Counter c) {
        for (final int[] i : matrix) {
            countInArray(i, elem, c); 
        }
    }
}   
