package LogisticsUI;

import java.awt.Component;
import javax.swing.JOptionPane;

public class DialogBoxUI {
    public DialogBoxUI(Component reference, String message, int flagOptionPane) {
        JOptionPane.showMessageDialog(reference, 
            message, 
            (flagOptionPane == JOptionPane.ERROR_MESSAGE) ? "Error!" : "Information Message!", 
            flagOptionPane
        );
    }
}
