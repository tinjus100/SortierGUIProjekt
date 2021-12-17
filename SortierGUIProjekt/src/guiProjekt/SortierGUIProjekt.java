package guiProjekt;

import sortieren.BubbleSort;
import sortieren.InsertionSort;
import sortieren.SelectionSort;
import util.ArrayGenerator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortierGUIProjekt extends JFrame {
    private JPanel pMain;

    private JPanel pLeft;
    private JPanel PTL;
    private JPanel PML;
    private JPanel PBL;
    private JButton bBubbleSort;
    private JButton bSelectionSort;
    private JButton bInsertionSort;
    private ArrayPanel pArray;
    private ArrayPanel pArray1;
    private ArrayPanel pArray2;
    private int[] array;
    private int[] array1;
    private int[] array2;

    private JPanel pRight;
    private JPanel PTR;
    private JPanel PMR;
    private JPanel PBR;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private ArrayPanel pArray3;
    private ArrayPanel pArray4;
    private ArrayPanel pArray5;
    private int[] array3;
    private int[] array4;
    private int[] array5;

    private JPanel pCenter;
    private JButton bStart;
    private JButton bStandard;
    private JButton bGeneriereArray;
    private JTextArea taOutput;
    private SortierAusgabe ausgabe;

    public SortierGUIProjekt() {
        array = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array1 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array2 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array3 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array4 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array5 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};

        ausgabe = new SortierAusgabe(taOutput);

        bBubbleSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        BubbleSort bsort = new BubbleSort(array, ausgabe);
                        bsort.sortieren(pArray);
                    }
                }.start();
            }
        });

        bSelectionSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        SelectionSort ssort = new SelectionSort(array1, ausgabe);
                        ssort.sortieren(pArray1);
                    }
                }.start();
            }
        });

        bInsertionSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        InsertionSort isort = new InsertionSort(array2, ausgabe);
                        isort.sortieren(pArray2);
                    }
                }.start();
            }
        });

        bStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        new Thread(){

                            public void run(){
                                BubbleSort bsort = new BubbleSort(array, ausgabe);
                                bsort.sortieren(pArray);
                            }
                        }.start();

                        new Thread(){

                            public void run(){
                                SelectionSort ssort = new SelectionSort(array1, ausgabe);
                                ssort.sortieren(pArray1);
                            }
                        }.start();

                        new Thread(){

                            public void run(){
                                InsertionSort isort = new InsertionSort(array2, ausgabe);
                                isort.sortieren(pArray2);
                            }
                        }.start();
                    }
                }.start();
            }
        });

        bStandard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
                array1 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
                array2 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
                array3 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
                array4 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
                array5 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
            }
        });

        bGeneriereArray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] randomArray = ArrayGenerator.randomNumbers(8,100);
                array = randomArray;
                array1 = randomArray;
                array2 = randomArray;
                array3 = randomArray;
                array4 = randomArray;
                array5 = randomArray;
            }
        });

        pArray = new ArrayPanel(array);
        PTL.add(pArray);
        pArray1 = new ArrayPanel(array1);
        PML.add(pArray1);
        pArray2 = new ArrayPanel(array2);
        PBL.add(pArray2);
        pArray3 = new ArrayPanel(array3);
        PTR.add(pArray3);
        pArray4 = new ArrayPanel(array4);
        PMR.add(pArray4);
        pArray5 = new ArrayPanel(array5);
        PBR.add(pArray5);

        add(pMain);
        setSize(1200, 800);
        setTitle("SortierGUI-Projekt von Romy und Justin");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SortierGUIProjekt();
    }

}
