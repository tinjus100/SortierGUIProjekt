package sortieren;

import guiProjekt.SortierAusgabeProjekt;
import util.Util;

import java.util.Arrays;

public class SelectionSort {
    private SortierAusgabeProjekt ausgabeProjekt;
    public int[] a;

    public SelectionSort(int[] input) {
        a = input;
        this.ausgabeProjekt = null;
    }

    public SelectionSort(int[] input, SortierAusgabeProjekt ausgabeProjekt) {
        a = input;
        this.ausgabeProjekt = ausgabeProjekt;
        ausgabeProjekt.println("SelectionSort gestartet");
    }

    public void sortieren() {
        // Äußere Schleife, separiert unsortierten von sortiertem Bereich
        if (ausgabeProjekt != null) {
            ausgabeProjekt.println("Vorher: " + Arrays.toString(a));
        }

        for (int i = 0; i < a.length-1; i++) {
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            Util.swap(a, i, min);
        }

        if (ausgabeProjekt != null) {
            ausgabeProjekt.println("Nachher: " + Arrays.toString(a));
        }
    }
}

