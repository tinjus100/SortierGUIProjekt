package sortieren;

import guiProjekt.ArrayPanel;
import guiProjekt.SortierAusgabe;
import util.Util;

import java.util.Arrays;

public class ShakerSort {
    private SortierAusgabe output;
    public int[] a;

    public ShakerSort(int[] input) {
        a = input;
        this.output = null;
    }

    public ShakerSort(int[] input, SortierAusgabe output) {
        a = input;
        this.output = output;
        output.println("ShakerSort gestartet");
    }

    public int[] sortArray(ArrayPanel panel) {

        int i = 0, length = a.length;
        while (i < length) {
            shaker1(panel, i, length);
            length--;
            shaker2(panel, i, length);
            i++;
        }
        return a;
    }

    private void shaker1(ArrayPanel panel, int i, int length) {
        for (int j = i; j < length - 1; j++) {
            if (a[j] > a[j + 1]) {
                Util.swap(a,j,j+1);
                panel.setArray(a);
            }
        }
    }

    private void shaker2(ArrayPanel panel, int i, int length) {
        for (int j = length - 1; j >= i; j--) {
            if (a[j] > a[j + 1]) {
                Util.swap(a,j,j+1);
                panel.setArray(a);
            }
        }
    }


    public void sort(ArrayPanel panel) {
        if (output != null) {
            output.println("Vor ShakerSort: " + Arrays.toString(a));
        }

        ShakerSort shakerSort = new ShakerSort(a);
        a = shakerSort.sortArray(panel);

        if (output != null) {
            output.println("Nach ShakerSort: " + Arrays.toString(a));
        }
    }
}