package Arrays;

public class UseArrays {
    public static void main (String[] args){
        int [] a = new int[] {10, 20, 30};
        System.out.println("a: " + a[0] + " " + a[1] + " " + a[2]);
        double[] b = new double[] {10.1, 10.2};
        b[1] = 10.21;
        String[] c = new String[] {"10", "20", "3" + "0"};
        System.out.println("c.length: " + c.length);
        boolean[] d = new boolean[10000];
        System.out.println("d[5000]: " + d[5000]); 
        int[][] e = new int[5][5];
        System.out.println("e.length: " + e.length);
        int[][] f = new int [][] {new int[] {11, 12, 13, 14}, new int[] {21, 22, 23, 24}, new int[] {31, 32, 33, 34}};
        System.out.println("f.length: " + f.length);
        System.out.println("f[0].length: " + f[0].length);
        System.out.println("f[1][2]: " + f[1][2]);
        System.out.println("Error on f[1][4]: " + f[1][4]);

    }
}
