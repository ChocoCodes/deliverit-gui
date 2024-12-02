package LogisticsUI;

import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class Logistics extends javax.swing.JFrame {
    public Logistics() {
        initComponents();
        setIconImage(new ImageIcon("src/assets/truck.png").getImage());
        setLocationRelativeTo(null);
        setResizable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomePanel = new javax.swing.JPanel();
        creatorLabel = new javax.swing.JLabel();
        sectionLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        tagline = new javax.swing.JLabel();
        loginFormPanel = new javax.swing.JPanel();
        loginHeader = new javax.swing.JLabel();
        prompt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeliverIT: Logistics");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        welcomePanel.setBackground(new java.awt.Color(70, 92, 239));
        welcomePanel.setPreferredSize(new java.awt.Dimension(400, 550));

        creatorLabel.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        creatorLabel.setForeground(new java.awt.Color(255, 255, 255));
        creatorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creatorLabel.setText("Octavio | Javellana | Tamayo");

        sectionLabel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        sectionLabel.setForeground(new java.awt.Color(255, 255, 255));
        sectionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sectionLabel.setText("CS-2A");

        welcomeLabel.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("WELCOME TO");

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/deliverit.png"))); // NOI18N

        tagline.setFont(new java.awt.Font("Inter", 2, 18)); // NOI18N
        tagline.setForeground(new java.awt.Color(255, 255, 255));
        tagline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tagline.setText("We'll get it there.");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(creatorLabel)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoLabel))
                .addGap(56, 56, 56))
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(tagline, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(welcomeLabel)
                .addGap(74, 74, 74)
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tagline)
                .addGap(142, 142, 142)
                .addComponent(creatorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sectionLabel)
                .addGap(181, 181, 181))
        );

        getContentPane().add(welcomePanel);
        welcomePanel.setBounds(0, 0, 400, 500);

        loginFormPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginFormPanel.setMinimumSize(new java.awt.Dimension(400, 550));
        loginFormPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        loginHeader.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        loginHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginHeader.setText("LOG IN");

        prompt.setText("Please enter your details below.");

        javax.swing.GroupLayout loginFormPanelLayout = new javax.swing.GroupLayout(loginFormPanel);
        loginFormPanel.setLayout(loginFormPanelLayout);
        loginFormPanelLayout.setHorizontalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(prompt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        loginFormPanelLayout.setVerticalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(loginHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prompt)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        getContentPane().add(loginFormPanel);
        loginFormPanel.setBounds(400, 0, 400, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Logistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creatorLabel;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JLabel loginHeader;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel prompt;
    private javax.swing.JLabel sectionLabel;
    private javax.swing.JLabel tagline;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
