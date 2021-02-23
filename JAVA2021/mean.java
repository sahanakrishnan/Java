public class mean {
    static void mean1(int i, int j, int k, int l, int m, int n, int o) {
        int count = 0;
        int numbering = 0;
    for (int z = 0; z < 7; z++){
        numbering += z;
        count += 1;
    double total = (numbering / count);
    System.out.println( "the mean is " + total);
}  
    }


    public static void main(final int[] args) {
        mean1(4,5,4,2,7,8,6);


    }

}