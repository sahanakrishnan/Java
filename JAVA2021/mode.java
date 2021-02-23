public class mode {
    static int mode(final int a[], final int n) {
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < n; ++i) {
            int count = 0;
            for (j = 0; j < n; ++j) {
                if (a[j] == a[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    public static void main(final String args[]) {
        final int n = 5;
        final int a[] = { 0, 6, 7, 2, 7 };
        System.out.println("Mode ::"+mode(a,n));
     }

}