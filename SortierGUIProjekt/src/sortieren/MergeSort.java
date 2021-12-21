package sortieren;

import guiProjekt.ArrayPanel;
import guiProjekt.SortierAusgabe;

import java.util.Arrays;

    public class MergeSort {
        private SortierAusgabe output;
        public int[] a;

        public MergeSort(int[] input) {
            a = input;
            this.output = null;
        }

        public MergeSort(int[] input, SortierAusgabe output) {
            a = input;
            this.output = output;
            output.println("MergeSort gestartet");
        }

        public int[] sort(ArrayPanel panel, int l, int r) {

            if (l < r) {
                int q = (l + r) / 2;

                sort(panel, l, q);
                sort(panel,q + 1, r);
                merge(panel, l, q, r);
            }
            return a;
        }

        private void merge(ArrayPanel panel, int l, int q, int r) {
            int[] array = new int[a.length];
            int i, j;
            for (i = l; i <= q; i++) {
                array[i] = a[i];
            }
            for (j = q + 1; j <= r; j++) {
                array[r + q + 1 - j] = a[j];
            }
            i = l;
            j = r;
            for (int k = l; k <= r; k++) {
                if (array[i] <= array[j]) {
                    a[k] = array[i];
                    i++;
                } else {
                    a[k] = array[j];
                    j--;
                }
                panel.setArray(a);
            }
        }

        public void sort(ArrayPanel panel) {
            if (output != null) {
                output.println("Vor MergeSort: " + Arrays.toString(a));
            }

            MergeSort ms = new MergeSort(a);
            a = ms.sort(panel,0, a.length - 1);

            if (output != null) {
                output.println("Nach MergeSort: " + Arrays.toString(a));
            }
        }
    }