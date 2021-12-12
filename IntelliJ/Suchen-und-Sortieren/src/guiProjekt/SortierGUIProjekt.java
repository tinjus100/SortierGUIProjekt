package guiProjekt;

import sortieren.BubbleSort;
import sortieren.InsertionSort;
import sortieren.SelectionSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortierGUIProjekt extends JFrame {
    private JPanel pMain;
    private JButton bStart;
    private JPanel pLeft;
    private JPanel pRight;
    private JPanel pCenter;
    private JTextArea taOutput;
    private JPanel PLT;
    private JPanel PLM;
    private JPanel PLB;
    private JPanel PRT;
    private JPanel PRM;
    private JPanel PRB;
    private JButton bBubbleSort;
    private JButton bSelectionSort;
    private JButton bInsertionSort;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private ArrayPanelProjekt pArray;
    private ArrayPanelProjekt pArray2;
    private ArrayPanelProjekt pArray3;
    private ArrayPanelProjekt pArray4;
    private ArrayPanelProjekt pArray5;
    private ArrayPanelProjekt pArray6;
    private SortierAusgabeProjekt ausgabe;
    private int[] array;

    public SortierGUIProjekt() {
        array = new int[]{3, 6, 12, 8, 3, 78, 3, 5};
        ausgabe = new SortierAusgabeProjekt(taOutput);

        bStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleSort bsort = new BubbleSort(array, ausgabe);
                bsort.sortieren();
                pArray.setArray(bsort.a);

                SelectionSort ssort = new SelectionSort(array, ausgabe);
                ssort.sortieren();
                pArray2.setArray(ssort.a);

                InsertionSort isort = new InsertionSort(array, ausgabe);
                isort.sortieren();
                pArray3.setArray(isort.a);
            }
        });

        bBubbleSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BubbleSort bsort = new BubbleSort(array, ausgabe);
                bsort.sortieren();
                pArray.setArray(bsort.a);
            }
        });

        bSelectionSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectionSort ssort = new SelectionSort(array, ausgabe);
                ssort.sortieren();
                pArray2.setArray(ssort.a);
            }
        });

        bInsertionSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InsertionSort isort = new InsertionSort(array, ausgabe);
                isort.sortieren();
                pArray3.setArray(isort.a);
            }
        });

        pArray = new ArrayPanelProjekt();
        PLT.add(pArray);
        pArray2 = new ArrayPanelProjekt();
        PLM.add(pArray2);
        pArray3 = new ArrayPanelProjekt();
        PLB.add(pArray3);
        pArray4 = new ArrayPanelProjekt();
        PRT.add(pArray4);
        pArray5 = new ArrayPanelProjekt();
        PRM.add(pArray5);
        pArray6 = new ArrayPanelProjekt();
        PRB.add(pArray6);

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
