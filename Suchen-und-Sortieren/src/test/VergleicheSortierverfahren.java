package test;

import sortieren.BubbleSort;
import sortieren.SelectionSort;
import sortieren.InsertionSort;

import java.util.Arrays;

public class VergleicheSortierverfahren {
    public static void main(String[] args) {
        int[] zahlen = {2,7,6,5,4,1,3,8};

        System.out.println("Unsortiert: " + Arrays.toString(zahlen) );

        System.out.println();

        BubbleSort sorter  = new BubbleSort(zahlen);
        sorter.sortieren();
        System.out.println("Mit BubbleSort sortiert: " + Arrays.toString(zahlen) );
        //System.out.println("Vergleiche: " + sorter.vergleiche);
        //System.out.println("Vertauschungen: " + sorter.vertauschungen);
        //System.out.println("Verlaufszeit des Sortierverfahrens: " + (sorter.timeEnd - sorter.timeStart) + " Nanosek.");


        System.out.println();

        int[] zahlen2 = {2,7,6,5,4,1,3,8};
        SelectionSort sorter2 = new SelectionSort(zahlen2);
        sorter2.sortieren();
        System.out.println("Mit SelectionSort sortiert: " + Arrays.toString(zahlen2) );
        //System.out.println("Vergleiche: " + sorter2.vergleiche);
        //System.out.println("Vertauschungen: " + sorter2.vertauschungen);
        //System.out.println("Verlaufszeit des Sortierverfahrens: " + (sorter2.timeEnd - sorter2.timeStart) + " Nanosek.");


        System.out.println();

        int[] zahlen3 = {2,7,6,5,4,1,3,8};
        InsertionSort sorter3 = new InsertionSort(zahlen3);
        sorter3.sortieren();
        System.out.println("Mit InsertionSort sortiert: " + Arrays.toString(zahlen3) );
        //System.out.println("Vergleiche: " + sorter3.vergleiche);
        //System.out.println("Vertauschungen: " + sorter3.vertauschungen);
        //System.out.println("Verlaufszeit des Sortierverfahrens: " + (sorter3.timeEnd - sorter3.timeStart) + " Nanosek.");

    }
}
