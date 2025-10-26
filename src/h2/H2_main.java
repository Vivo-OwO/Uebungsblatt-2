package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 12;
        int j = 45;
        int k = 7;
        int min;
        int max;

        if (i < j && i < k) {
            min = i;
        } else if (j < k) {
            min = j;
        } else {
            min = k;
        }
        if (i > j && i > k) {
            max = i;
        } else if (j > k) {
            max = j;
        } else {
            max = k;
        }
        System.out.println("minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}