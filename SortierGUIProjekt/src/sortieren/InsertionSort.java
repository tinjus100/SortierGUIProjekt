package sortieren;

import guiProjekt.SortierAusgabeProjekt;
import util.Util;

import java.util.Arrays;

public class InsertionSort {
    private SortierAusgabeProjekt ausgabeProjekt;
    public int[] a;

    public InsertionSort(int[] input) {
        a = input;
        this.ausgabeProjekt = null;
    }

    public InsertionSort(int[] input, SortierAusgabeProjekt ausgabeProjekt) {
        a = input;
        this.ausgabeProjekt = ausgabeProjekt;
        ausgabeProjekt.println("InsertionSort gestartet");
    }

    public void sortieren() {
        // Äußere Schleife, separiert unsortierten von sortiertem Bereich
        if (ausgabeProjekt != null) {
            ausgabeProjekt.println("Vorher: " + Arrays.toString(a));
        }

        for (int i = 1; i < a.length; i++) {
            int j = i;
            while(j > 0 && a[j-1] > a[j]) {
                Util.swap(a, j, j - 1);
                j--;
            }
        }

        if (ausgabeProjekt != null) {
            ausgabeProjekt.println("Nachher: " + Arrays.toString(a));
        }
    }
}