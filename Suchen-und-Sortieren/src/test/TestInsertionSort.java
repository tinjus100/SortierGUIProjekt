package test;

import sortieren.InsertionSort;
import util.ArrayGenerator;

import java.util.Arrays;

public class TestInsertionSort {
    public static void main(String[] args) {
        // Statisches Array
        int[] zahlen = {2,7,6,5,4,1,3,8};
        InsertionSort sorter = new InsertionSort(zahlen);

        System.out.println("Unsortiert: " + Arrays.toString(zahlen) );
        sorter.sortieren();
        System.out.println("Sortiert: " + Arrays.toString(zahlen) );

    }
}
