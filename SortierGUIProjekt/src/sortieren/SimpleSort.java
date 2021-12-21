package sortieren;

import guiProjekt.ArrayPanel;
import guiProjekt.SortierAusgabe;
import util.Util;

import java.util.Arrays;

public class SimpleSort {
    private SortierAusgabe output;
    public int[] a;

    public SimpleSort(int[] input) {
        a = input;
        this.output = null;
    }

    public SimpleSort(int[] input, SortierAusgabe output) {
        a = input;
        this.output = output;
        output.println("SimpleSort gestartet");
    }

    public void sort(ArrayPanel panel) {
        if (output != null) {
            output.println("Vor SimpleSort: " + Arrays.toString(a));
        }

        for (int i = a.length-1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] >= a[i]) {
                    Util.swap(a,j,i);
                    panel.setArray(a);
                }
            }
        }

        if (output != null) {
            output.println("Nach SimpleSort: " + Arrays.toString(a));
        }
    }
}