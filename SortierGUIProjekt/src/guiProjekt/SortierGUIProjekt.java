package guiProjekt;

import sortieren.*;
import util.ArrayGenerator;
import util.Util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SortierGUIProjekt extends JFrame {
    private ArrayPanel pArray, pArray1, pArray2, pArray3, pArray4, pArray5;
    private int[] array, array1, array2, array3, array4, array5;
    private JPanel pMain, pLeft, pRight, PTR, PMR, PBR, PTL, PML, PBL, pCenter, pStart, pChangeArray, pDefault, pRandom, pCustom;
    private JButton bBubbleSort, bInsertionSort, bSelectionSort, bMergeSort, bShakerSort, bSimpleSort, bHelp, bStart, bStandard, bApplyArray, bGenerateArray;
    private JTextArea taOutput;
    private JTextField tfMax, tfLength, tfCreateArray;
    private JCheckBox cbDuplicates;
    private JPanel pHelp;
    private JPanel pClear;
    private JButton bClear;
    private int[] randomArray;
    int randomLength, randomMax;
    private boolean noDuplicates = true;
    private String input;
    private SortierAusgabe output;


    public SortierGUIProjekt() {
        array = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array1 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array2 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array3 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array4 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        array5 = new int[]{3, 6, 12, 8, 3, 78, 3, 5};

        output = new SortierAusgabe(taOutput);
        input = "0,0,0";

        bHelp.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,
                    "Sortierverfahren:" +
                            "\n Du kannst entweder auf den Knopf unter einem beliebigen Sortierverfahren klicken oder diese über den zentralen Knopf gegeneinander antreten lassen." +
                            "\n (Beachte: Du musst das Array zwischendurch zurücksetzen.)" +
                            "\n\nArray generieren:" +
                            "\n Du kannst (unten) entweder ein Array eingeben oder ein zufälliges automatisch generieren lassen." +
                            "\n (Beachte: Du musst unter 'Das zu erstellende Array' die eingegebenen Zahlen mit Kommatas trennen und" +
                            "\n bei dem zufälligen Array mithilfe von 'Array-Länge' und 'Max. Wert', die Länge des Arrays und den maximalen Wert, " +
                            "\n den dieses annehmen soll, definieren. Außerdem kannst du noch bestimmen, ob in dem Array Dopplungen vorkommen sollen oder nicht.)",
                    "Anleitung",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        bBubbleSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        BubbleSort bsort = new BubbleSort(array, output);
                        bsort.sort(pArray);
                    }
                }.start();
            }
        });

        bSelectionSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        SelectionSort sesort = new SelectionSort(array1, output);
                        sesort.sort(pArray1);
                    }
                }.start();
            }
        });

        bInsertionSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        InsertionSort isort = new InsertionSort(array2, output);
                        isort.sort(pArray2);
                    }
                }.start();
            }
        });

        bMergeSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        MergeSort msort = new MergeSort(array3, output);
                        msort.sort(pArray3);
                    }
                }.start();
            }
        });

        bShakerSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        ShakerSort shsort = new ShakerSort(array4, output);
                        shsort.sort(pArray4);
                    }
                }.start();
            }
        });

        bSimpleSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(){

                    public void run(){
                        SimpleSort sisort = new SimpleSort(array5, output);
                        sisort.sort(pArray5);
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
                                BubbleSort bsort = new BubbleSort(array, output);
                                bsort.sort(pArray);
                            }
                        }.start();

                        new Thread(){

                            public void run(){
                                SelectionSort ssort = new SelectionSort(array1, output);
                                ssort.sort(pArray1);
                            }
                        }.start();

                        new Thread(){

                            public void run(){
                                InsertionSort isort = new InsertionSort(array2, output);
                                isort.sort(pArray2);
                            }
                        }.start();

                        new Thread(){

                            public void run(){
                                MergeSort msort = new MergeSort(array3, output);
                                msort.sort(pArray3);
                            }
                        }.start();

                        new Thread(){

                            public void run(){
                                ShakerSort shsort = new ShakerSort(array4, output);
                                shsort.sort(pArray4);
                            }
                        }.start();

                        new Thread(){

                            public void run(){
                                SimpleSort sisort = new SimpleSort(array5, output);
                                sisort.sort(pArray5);
                            }
                        }.start();

                    }
                }.start();
            }
        });

        bClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output = new SortierAusgabe(taOutput);
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
                if (tfLength.getText().equals("Array-Länge")) {
                    tfLength.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfLength.getText().equals("")) {
                    tfLength.setText("Array-Länge");
                }
            }
        });

        tfMax.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfMax.getText().equals("Max. Wert")) {
                    tfMax.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfMax.getText().equals("")) {
                    tfMax.setText("Max. Wert");
                }
            }
        });

        cbDuplicates.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                noDuplicates = !cbDuplicates.isSelected();
            }
        });

        bGenerateArray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Util.isStringANumber(tfLength.getText()) && Util.isStringANumber(tfMax.getText())) {
                    randomLength = Integer.parseInt(tfLength.getText());
                    randomMax = Integer.parseInt(tfMax.getText());

                    if (randomLength < 403 && randomLength != 0 && randomMax <= 12000000) {


                        if (noDuplicates && randomLength > randomMax) {
                            output.println("Damit es möglich ist, ein Zufallsarray ohne Dopplungen zu generieren, \n" +
                                    " darf die Länge des Arrays nicht größer sein als der maximale Wert.");
                        } else if (noDuplicates) {
                            array = new int[randomLength];
                            array1 = new int[randomLength];
                            array2 = new int[randomLength];
                            array3 = new int[randomLength];
                            array4 = new int[randomLength];
                            array5 = new int[randomLength];
                            randomArray = ArrayGenerator.noDuplicates(randomLength, randomMax);
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
                        }
                    } else if(randomMax <= 12000000 || randomLength == 0) {
                        output.println("Die Array-Länge darf nicht größer als 402 oder kleiner als 1 sein.");
                    } else if(randomLength < 403){
                        output.println("Der Max. Wert darf nicht größer als 12000000 sein.");
                    } else {
                        output.println("Die Array-Länge darf nicht größer als 402 oder kleiner als 1 sein und " +
                                "\n der Max. Wert darf nicht größer als 12000000 sein.");
                    }
                } else {
                    output.println("Bitte gib die Länge und den maximalen Wert des Zufallarrays an.");
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

                if (Util.isStringANumber(inputString)) {
                    input = tfCreateArray.getText();
                } else {
                    output.println("Bitte gib das zu erstellende Array korrekt ein. Bsp.: 2,5,32,1,3,6,5,3");
                }

                if (!input.equals("") && ( input.charAt(0) == ',' || input.charAt(input.length() - 1) == ',') ) {
                    output.println("Bitte gib das zu erstellende Array korrekt ein. Bsp.: 2,5,32,1,3,6,5,3");
                } else if (input.equals("")) {
                    output.println("Bitte gib das zu erstellende Array korrekt ein. Bsp.: 2,5,32,1,3,6,5,3");
                } else {

                    String[] split = input.split(",");
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
