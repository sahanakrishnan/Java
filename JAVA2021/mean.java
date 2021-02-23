public class Mean {
    static void mean1(int[] array) {
        int total = 0;
        for (int z = 0; z < array.length; z++) {
            total += array[z];
        }
        double average = total / (array.length);
        System.out.println("Average is " + average);
    }

    public static void main(final String args[]) {
        int[] array = { 4, 5, 4, 2, 7, 8, 6 };
        mean1(array);

    }

}