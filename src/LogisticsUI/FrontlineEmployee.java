/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LogisticsUI;
import java.awt.CardLayout;

/**
 *
 * @author User
 */
public class FrontlineEmployee extends javax.swing.JFrame {

    /**
     * Creates new form FrontlineEmployee
     */
    public FrontlineEmployee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NullPanel = new javax.swing.JPanel();
        SidebarPanel = new javax.swing.JPanel();
        UserGreetingsLabel = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        ProcessShipmentBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        EmptyPanel = new javax.swing.JPanel();
        ProcessShipmentPanel = new javax.swing.JPanel();
        NestedPanel = new javax.swing.JPanel();
        HeaderLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PaidShipmentsTable = new javax.swing.JTable();
        ConfirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 800, 500));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        NullPanel.setBackground(new java.awt.Color(240, 245, 255));
        NullPanel.setLayout(null);

        SidebarPanel.setBackground(new java.awt.Color(70, 92, 239));

        UserGreetingsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UserGreetingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserGreetingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserGreetingsLabel.setText("<html><span style='font-family:Inter; font-weight:bold;'>Hello, </span><span style='font-family:Inter; font-weight:50;'>Employee</span></html>");

        Logout.setBackground(new java.awt.Color(80, 155, 229));
        Logout.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("<html>   <body style=\"font-family: Inter; font-weight: 600; text-align: center;\">     Logout   </body> </html> ");
        Logout.setBorderPainted(false);
        Logout.setFocusPainted(false);
        Logout.setFocusable(false);
        Logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logout.setRequestFocusEnabled(false);
        Logout.setRolloverEnabled(false);
        Logout.setVerifyInputWhenFocusTarget(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        ProcessShipmentBtn.setBackground(new java.awt.Color(70, 92, 239));
        ProcessShipmentBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ProcessShipmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        ProcessShipmentBtn.setText("<html><body style=\"font-family: Inter; font-weight: 10; text-align: center;\">Process Shipment</body></html>");
        ProcessShipmentBtn.setBorderPainted(false);
        ProcessShipmentBtn.setContentAreaFilled(false);
        ProcessShipmentBtn.setFocusPainted(false);
        ProcessShipmentBtn.setFocusable(false);
        ProcessShipmentBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProcessShipmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessShipmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidebarPanelLayout = new javax.swing.GroupLayout(SidebarPanel);
        SidebarPanel.setLayout(SidebarPanelLayout);
        SidebarPanelLayout.setHorizontalGroup(
            SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(UserGreetingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(ProcessShipmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SidebarPanelLayout.setVerticalGroup(
            SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(UserGreetingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(ProcessShipmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        NullPanel.add(SidebarPanel);
        SidebarPanel.setBounds(0, 0, 200, 500);

        MainPanel.setBackground(new java.awt.Color(240, 245, 255));
        MainPanel.setLayout(new java.awt.CardLayout());

        EmptyPanel.setBackground(new java.awt.Color(240, 245, 255));
        EmptyPanel.setLayout(new java.awt.CardLayout());
        MainPanel.add(EmptyPanel, "card2");

        ProcessShipmentPanel.setBackground(new java.awt.Color(240, 245, 255));
        ProcessShipmentPanel.setLayout(new java.awt.CardLayout());

        NestedPanel.setBackground(new java.awt.Color(255, 255, 255));

        HeaderLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(0, 0, 0));
        HeaderLabel.setText("<html><span style='font-family: Inter; font-weight: bold;'>Unprocessed Paid Shipment(s)</span></html>");

        PaidShipmentsTable.setBackground(new java.awt.Color(255, 255, 255));
        PaidShipmentsTable.setForeground(new java.awt.Color(0, 0, 0));
        PaidShipmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shipment No.", "ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PaidShipmentsTable.setCellSelectionEnabled(true);
        PaidShipmentsTable.setFocusable(false);
        PaidShipmentsTable.setGridColor(new java.awt.Color(255, 255, 255));
        PaidShipmentsTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        PaidShipmentsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        PaidShipmentsTable.setShowGrid(false);
        PaidShipmentsTable.getTableHeader().setResizingAllowed(false);
        PaidShipmentsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(PaidShipmentsTable);
        PaidShipmentsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        ConfirmBtn.setBackground(new java.awt.Color(73, 204, 112));
        ConfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBtn.setText("<html>\n  <body style=\"font-family: Inter; font-weight: bold; text-align: center;\">\n    Confirm\n  </body>\n</html>\n");
        ConfirmBtn.setBorderPainted(false);
        ConfirmBtn.setFocusPainted(false);
        ConfirmBtn.setFocusable(false);
        ConfirmBtn.setRequestFocusEnabled(false);
        ConfirmBtn.setRolloverEnabled(false);

        javax.swing.GroupLayout NestedPanelLayout = new javax.swing.GroupLayout(NestedPanel);
        NestedPanel.setLayout(NestedPanelLayout);
        NestedPanelLayout.setHorizontalGroup(
            NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NestedPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        NestedPanelLayout.setVerticalGroup(
            NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NestedPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(HeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        ProcessShipmentPanel.add(NestedPanel, "card2");

        MainPanel.add(ProcessShipmentPanel, "card3");

        NullPanel.add(MainPanel);
        MainPanel.setBounds(200, 0, 600, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NullPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NullPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProcessShipmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessShipmentBtnActionPerformed
        // TODO add your handling code here:
        ProcessShipmentBtn.setOpaque(true);
        ProcessShipmentBtn.setBackground(java.awt.Color.decode("#509BE5"));
        CardLayout card = (CardLayout)MainPanel.getLayout();
        card.show(MainPanel, "card3");
    }//GEN-LAST:event_ProcessShipmentBtnActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LogoutActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrontlineEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontlineEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontlineEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontlineEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontlineEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JPanel EmptyPanel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel NestedPanel;
    private javax.swing.JPanel NullPanel;
    private javax.swing.JTable PaidShipmentsTable;
    private javax.swing.JButton ProcessShipmentBtn;
    private javax.swing.JPanel ProcessShipmentPanel;
    private javax.swing.JPanel SidebarPanel;
    private javax.swing.JLabel UserGreetingsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
