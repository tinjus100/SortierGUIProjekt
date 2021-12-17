package sortieren;

import guiProjekt.ArrayPanelProjekt;
import guiProjekt.SortierAusgabeProjekt;
import util.Util;

import java.util.Arrays;

public class BubbleSort {
    private SortierAusgabeProjekt ausgabeProjekt;
    public int[] a;

    public BubbleSort(int[] input) {
        a = input;
        this.ausgabeProjekt = null;
    }

    public BubbleSort(int[] input, SortierAusgabeProjekt ausgabeProjekt) {
        a = input;
        this.ausgabeProjekt = ausgabeProjekt;
        ausgabeProjekt.println("BubbleSort gestartet");
    }

    public void sortieren(ArrayPanelProjekt ppap) {
        // Äußere Schleife, separiert unsortierten von sortiertem Bereich
        if (ausgabeProjekt != null) {
            ausgabeProjekt.println("Vorher: " + Arrays.toString(a));
        }

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    Util.swap(a, j, j+1);
                    ppap.setArray(a);
                }
            }
        }

        if (ausgabeProjekt != null) {
            ausgabeProjekt.println("Nachher: " + Arrays.toString(a));
        }
    }
}