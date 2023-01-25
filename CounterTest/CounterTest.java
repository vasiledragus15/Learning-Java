package CounterTest;

public class CounterTest {
    public static void main(String[] args) {
        
        //Testing
        
        Counter c1 = new Counter();
        int[] a1 = new int[] {1, 2, 3, 1, 2, 1, 4, 1, 4, 5, 6, 1, 1, 4, 49, 2, 1};
        Counter.countInArray(a1, 1, c1);
        System.out.println("Element 1 is present " + c1.getValue() + " times!");

        Counter c2 = new Counter();
        int[] a2 = new int[] {2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2};
        Counter.countInArray(a2, 2, c2);
        System.out.println("Element " + a2[0] + " is present " + c2.getValue() + " times!");

        Counter c3 = new Counter();
        int[][] m1 = new int[][] {{1, 2, 3, 1, 1, 1, 2, 3, 1, 2, 3, 1},{1, 1, 1, 1, 1, 1, 1, 1,}};
        Counter.countInMatrix(m1, 1, c3);
        System.out.println("Element " + m1[0][0] + " is present " + c3.getValue() + " times!");
    }
}
