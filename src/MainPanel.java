import javax.swing.*;

public class MainPanel extends JFrame {
    private JButton customerButton;
    private JButton employeeButton;
    private JPanel mainPanel;

    public MainPanel() {
        setFrameConfig();
        removeBtnDefaultStyle(customerButton);
        removeBtnDefaultStyle(employeeButton);
    }

    private void setFrameConfig() {
        setTitle("DeliverIT: Logistics");
        setSize(500, 200);
        setIconImage(new ImageIcon("assets/truck.png").getImage());
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void removeBtnDefaultStyle(JButton btn) {
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainPanel::new);
    }
}
