package UncheckedStackTrace;

public class UncheckedStackTrace {
    public static void main(String[] args) {
        final int[] a = new int[] {10, 20, 30};
        System.out.println(a.length);
        final int b = accessArray(a, 1);
        System.out.println(b);
        final int f = accessArray(a, 2);
        System.out.println(f);
        final int c = accessArray(a, 3);    
        final int d = accessArray(a, 5); 
    }

    public static int accessArray(final int[] array, final int pos) {
        return array[pos];
    }
    
}