package guiProjekt;

import javax.swing.*;

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
        setSize(800, 600);
        setTitle("SortierGUI-Projekt von Romy und Justin");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SortierGUIProjekt();
    }

}
