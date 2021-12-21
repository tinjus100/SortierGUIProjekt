package sortieren;

import guiProjekt.ArrayPanel;
import guiProjekt.SortierAusgabe;
import util.Util;

import java.util.Arrays;

public class SimpleSort {
    private SortierAusgabe ausgabe;
    public int[] a;

    public SimpleSort(int[] input) {
        a = input;
        this.ausgabe = null;
    }

    public SimpleSort(int[] input, SortierAusgabe ausgabe) {
        a = input;
        this.ausgabe = ausgabe;
        ausgabe.println("SimpleSort gestartet");
    }

    public void sortieren(ArrayPanel panel) {
        // Äußere Schleife, separiert unsortierten von sortiertem Bereich
        if (ausgabe != null) {
            ausgabe.println("Vorher: " + Arrays.toString(a));
        }

        for (int i = a.length-1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] >= a[i]) {
                    Util.swap(a,j,i);
                }
                panel.setArray(a);
            }
        }

        if (ausgabe != null) {
            ausgabe.println("Nachher: " + Arrays.toString(a));
        }
    }
}