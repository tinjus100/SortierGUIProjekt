package sortieren;

import guiProjekt.ArrayPanel;
import guiProjekt.SortierAusgabe;
import util.Util;

import java.util.Arrays;

public class SelectionSort {
    private SortierAusgabe output;
    public int[] a;

    public SelectionSort(int[] input) {
        a = input;
        this.output = null;
    }

    public SelectionSort(int[] input, SortierAusgabe output) {
        a = input;
        this.output = output;
        output.println("SelectionSort gestartet");
    }

    public void sort(ArrayPanel panel) {
        if (output != null) {
            output.println("Vorher: " + Arrays.toString(a));
        }

        for (int i = 0; i < a.length-1; i++) {
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            Util.swap(a, i, min);
            panel.setArray(a);
        }

        if (output != null) {
            output.println("Nachher: " + Arrays.toString(a));
        }
    }
}

