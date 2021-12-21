package util;

public class ArrayGenerator {
    public static int[] randomNumbers(int n, int max) {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * (max + 1));
        }

        return a;
    }

    public static int[] noDuplicates(int n, int max) {
        int[] a = new int[max + 1];
        int[] z = new int[n];
        int temp;
        int r;

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        for (int i = 0; i < n; i++) {
            r = (int) (Math.random() * (max + 1));
            temp = a[r];
            if (temp != -1) {
                z[i] = temp;
                a[r] = -1;
            } else {
                i--;
            }
        }

        return z;
    }
}