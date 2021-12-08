package guiProjekt;

import javax.swing.*;

public class SortierAusgabeProjekt {
        private JTextArea textArea;
        private String out;

        public SortierAusgabeProjekt(JTextArea textArea) {
            this.textArea = textArea;
            out = "Neue SortierAusgabe \n";
            this.textArea.setText(out);
        }

        public void println(String s) {
            out += s + "\n";
            this.textArea.setText(out);
        }

}

