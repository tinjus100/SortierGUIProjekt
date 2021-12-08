package sortieren;
 import gui.SortierAusgabe;
 import util.Util;
 import java.util.Arrays;

public class InsertionSort {
    private SortierAusgabe ausgabe;
    public int[] a;

    public InsertionSort(int[] input) {
        a = input;
        this.ausgabe = null;
    }

    public InsertionSort(int[] input, SortierAusgabe ausgabe) {
        a = input;
        this.ausgabe = ausgabe;
        ausgabe.println("InsertionSort gestartet");
    }

    public void sortieren() {
        // Äußere Schleife, separiert unsortierten von sortiertem Bereich
        if (ausgabe != null) {
            ausgabe.println("Vorher: " + Arrays.toString(a));
        }

        for (int i = 1; i < a.length; i++) {
            int j = i;
            while(j > 0 && a[j-1] > a[j]) {
                Util.swap(a, j, j - 1);
                j--;
            }
        }

        if (ausgabe != null) {
            ausgabe.println("Nachher: " + Arrays.toString(a));
        }
    }
}