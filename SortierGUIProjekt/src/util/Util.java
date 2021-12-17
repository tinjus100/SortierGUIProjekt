package util;

public class Util {
    public static void swap(int[] a, int x, int y) {
        int zahl = a[x];
        a[x] = a[y];
        a[y] = zahl;
    }
}
