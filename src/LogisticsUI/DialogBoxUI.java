package LogisticsUI;

import javax.swing.JOptionPane;
public class DialogBoxUI {
    public DialogBoxUI(String message, int flagOptionPane) {
        JOptionPane.showMessageDialog(null, 
            message, 
            (flagOptionPane == JOptionPane.ERROR_MESSAGE) ? "Error!" : "Information Message!", 
            flagOptionPane
        );
    }
}
