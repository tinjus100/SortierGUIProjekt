package sortieren;

import guiProjekt.ArrayPanel;
import guiProjekt.SortierAusgabe;
import util.Util;

import java.util.Arrays;

public class BubbleSort {
    private SortierAusgabe output;
    public int[] a;

    public BubbleSort(int[] input) {
        a = input;
        this.output = null;
    }

    public BubbleSort(int[] input, SortierAusgabe output) {
        a = input;
        this.output = output;
        output.println("BubbleSort gestartet");
    }

    public void sort(ArrayPanel panel) {
        if (output != null) {
            output.println("Vorher: " + Arrays.toString(a));
        }

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    Util.swap(a, j, j+1);
                    panel.setArray(a);
                }
            }
        }

        if (output != null) {
            output.println("Nachher: " + Arrays.toString(a));
        }
    }
}