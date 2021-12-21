package sortieren;

import guiProjekt.ArrayPanel;
import guiProjekt.SortierAusgabe;
import util.Util;

import java.util.Arrays;

public class InsertionSort {
    private SortierAusgabe output;
    public int[] a;

    public InsertionSort(int[] input) {
        a = input;
        this.output = null;
    }

    public InsertionSort(int[] input, SortierAusgabe output) {
        a = input;
        this.output = output;
        output.println("InsertionSort gestartet");
    }

    public void sort(ArrayPanel panel) {
        if (output != null) {
            output.println("Vorher: " + Arrays.toString(a));
        }

        for (int i = 1; i < a.length; i++) {
            int j = i;
            while(j > 0 && a[j-1] > a[j]) {
                Util.swap(a, j, j - 1);
                panel.setArray(a);
                j--;
            }
        }

        if (output != null) {
            output.println("Nachher: " + Arrays.toString(a));
        }
    }
}