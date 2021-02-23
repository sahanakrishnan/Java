import java.util.*;
public class median {
    public static double findMedian(final int a[], final int n) {
        Arrays.sort(a);

        if (n % 2 != 0)
            return (double) a[n / 2];

        return (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

    public static void main(final String args[]) {
        final int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
        final int n = a.length;
        System.out.println("Median = " + findMedian(a, n)); 
    } 
} 