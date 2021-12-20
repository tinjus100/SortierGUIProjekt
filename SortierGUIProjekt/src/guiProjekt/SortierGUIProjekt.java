package guiProjekt;

import sortieren.BubbleSort;
import sortieren.InsertionSort;
import sortieren.SelectionSort;
import util.ArrayGenerator;
import util.Util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

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
    private JPanel pStart;
    private JPanel pChangeArray;
    private JPanel pDefault;
    private JPanel pRandom;
    private JPanel pCustom;
    private JButton bStart;
    private JButton bStandard;
    private JButton bApplyArray;
    private JButton bGenerateArray;
    private JTextArea taOutput;
    private JTextField tfMax;
    private JTextField tfLength;
    private JTextField tfCreateArray;
    private JCheckBox cbDuplications;
    private int[] randomArray;
    private int randomLength;
    private int randomMax;
    private String eingabe;
    private SortierAusgabe ausgabe;


    public SortierGUIProjekt() {
        array = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array1 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array2 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array3 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array4 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array5 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};

        ausgabe = new SortierAusgabe(taOutput);
        eingabe = "0,0,0";

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
                pArray.setArray(array);
                pArray1.setArray(array1);
                pArray2.setArray(array2);
                pArray3.setArray(array3);
                pArray4.setArray(array4);
                pArray5.setArray(array5);
            }
        });

        tfLength.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfLength.getText().equals("Länge des Arrays")) {
                    tfLength.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfLength.getText().equals("")) {
                    tfLength.setText("Länge des Arrays");
                }
            }
        });

        tfMax.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfMax.getText().equals("Maximaler Wert")) {
                    tfMax.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfMax.getText().equals("")) {
                    tfMax.setText("Maximaler Wert");
                }
            }
        });

        bGenerateArray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Util.istStringEineZahl(tfLength.getText()) && Util.istStringEineZahl(tfMax.getText())) {
                    randomLength = Integer.parseInt(tfLength.getText());
                    randomMax = Integer.parseInt(tfMax.getText());

                    array = new int[randomLength];
                    array1 = new int[randomLength];
                    array2 = new int[randomLength];
                    array3 = new int[randomLength];
                    array4 = new int[randomLength];
                    array5 = new int[randomLength];
                    randomArray = ArrayGenerator.randomNumbers(randomLength, randomMax);
                    System.arraycopy(randomArray, 0, array, 0, randomLength);
                    System.arraycopy(randomArray, 0, array1, 0, randomLength);
                    System.arraycopy(randomArray, 0, array2, 0, randomLength);
                    System.arraycopy(randomArray, 0, array3, 0, randomLength);
                    System.arraycopy(randomArray, 0, array4, 0, randomLength);
                    System.arraycopy(randomArray, 0, array5, 0, randomLength);
                    pArray.setArray(array);
                    pArray1.setArray(array1);
                    pArray2.setArray(array2);
                    pArray3.setArray(array3);
                    pArray4.setArray(array4);
                    pArray5.setArray(array5);
                } else {
                    ausgabe.println("Bitte gib die Länge und den maximalen Wert des Zufallarrays an.");
                }
            }
        });

        tfCreateArray.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfCreateArray.getText().equals("Das zu erstellende Array")) {
                    tfCreateArray.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfCreateArray.getText().equals("")) {
                    tfCreateArray.setText("Das zu erstellende Array");
                }
            }
        });

        bApplyArray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputString = tfCreateArray.getText();
                inputString = inputString.replace(",", "");

                if (Util.istStringEineZahl(inputString)) {
                    eingabe = tfCreateArray.getText();
                } else {
                    ausgabe.println("Bitte gib das zu erstellende Array korrekt ein. Bsp.: 2,5,32,1,3,6,5,3");
                }

                if (!eingabe.equals("") && ( eingabe.charAt(0) == ',' || eingabe.charAt(eingabe.length() - 1) == ',') ) {
                    ausgabe.println("Bitte gib das zu erstellende Array korrekt ein. Bsp.: 2,5,32,1,3,6,5,3");
                } else if (eingabe.equals("")) {
                    ausgabe.println("Bitte gib das zu erstellende Array korrekt ein. Bsp.: 2,5,32,1,3,6,5,3");
                } else {

                    String[] split = eingabe.split(",");
                    int laenge = split.length;
                    array = new int[laenge];
                    array1 = new int[laenge];
                    array2 = new int[laenge];
                    array3 = new int[laenge];
                    array4 = new int[laenge];
                    array5 = new int[laenge];

                    for (int i = 0; i < laenge; i++) {
                        array[i] = Integer.parseInt(split[i]);
                        array1[i] = Integer.parseInt(split[i]);
                        array2[i] = Integer.parseInt(split[i]);
                        array3[i] = Integer.parseInt(split[i]);
                        array4[i] = Integer.parseInt(split[i]);
                        array5[i] = Integer.parseInt(split[i]);
                    }

                    pArray.setArray(array);
                    pArray1.setArray(array1);
                    pArray2.setArray(array2);
                    pArray3.setArray(array3);
                    pArray4.setArray(array4);
                    pArray5.setArray(array5);
                }
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
