package LogisticsUI;

import ClassTemplates.Shipment;
import ClassTemplates.Package;
import ClassTemplates.Customer;
import ClassTemplates.Item;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import datautils.io.*;

public class ShipmentForm extends javax.swing.JFrame {
    private Customer customerLoggedIn;
    private Shipment customerShipment;

    public ShipmentForm(Customer customerLoggedIn, Shipment customerShipment) {
        this.customerLoggedIn = customerLoggedIn;
        this.customerShipment = customerShipment;
        initComponents();
        displayShipmentInfo();
        setIconImage(new ImageIcon("src/assets/truck.png").getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void displayShipmentInfo() {
        System.out.printf("Item Counts: %d\n", this.customerShipment.getPackage().getContents().length);
        JLabel[] labels = {sidInfo, destInfo, shipCostInfo, statusInfo, pkgIdInfo, itemCountInfo};
        String[] shipmentInfo = {
            String.valueOf(this.customerShipment.getShipmentID()),
            this.customerShipment.getDestination(),
            String.valueOf(this.customerShipment.getShipCost()),
            this.customerShipment.getStatus(),
            String.valueOf(this.customerShipment.getPackage().getId()),
            String.valueOf(this.customerShipment.getPackage().getContents().length)
        };

        for(int i = 0; i < labels.length; i++) {
            labels[i].setText(shipmentInfo[i]);
        }
        
        totalDsplay.setText(String.valueOf(this.customerShipment.getShipCost()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        shipmentFrmHdr = new javax.swing.JLabel();
        shipmentInfoPnl = new javax.swing.JPanel();
        sIDLbl = new javax.swing.JLabel();
        destLbl = new javax.swing.JLabel();
        shipCostLbl = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();
        pkgIdLbl = new javax.swing.JLabel();
        itemCountLbl = new javax.swing.JLabel();
        sidInfo = new javax.swing.JLabel();
        destInfo = new javax.swing.JLabel();
        shipCostInfo = new javax.swing.JLabel();
        statusInfo = new javax.swing.JLabel();
        pkgIdInfo = new javax.swing.JLabel();
        itemCountInfo = new javax.swing.JLabel();
        checkoutHdr = new javax.swing.JLabel();
        totalHdr = new javax.swing.JLabel();
        totalDsplay = new javax.swing.JTextField();
        cashHdr = new javax.swing.JLabel();
        cashFld = new javax.swing.JTextField();
        payBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DeliverIT | Confirm Shipment");

        jPanel1.setBackground(new java.awt.Color(240, 245, 255));

        shipmentFrmHdr.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        shipmentFrmHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shipmentFrmHdr.setText("Shipment Form");

        shipmentInfoPnl.setBackground(new java.awt.Color(255, 255, 255));

        sIDLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        sIDLbl.setText("Shipment ID:");

        destLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        destLbl.setText("Destination: ");

        shipCostLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        shipCostLbl.setText("Shipping Cost:");

        statusLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        statusLbl.setText("Status: ");

        pkgIdLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        pkgIdLbl.setText("Package ID: ");

        itemCountLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        itemCountLbl.setText("Item Counts: ");

        sidInfo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        destInfo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        shipCostInfo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        statusInfo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        pkgIdInfo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        itemCountInfo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        javax.swing.GroupLayout shipmentInfoPnlLayout = new javax.swing.GroupLayout(shipmentInfoPnl);
        shipmentInfoPnl.setLayout(shipmentInfoPnlLayout);
        shipmentInfoPnlLayout.setHorizontalGroup(
            shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipmentInfoPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sIDLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(destLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shipCostLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(statusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pkgIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemCountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sidInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(destInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shipCostInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pkgIdInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemCountInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        shipmentInfoPnlLayout.setVerticalGroup(
            shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipmentInfoPnlLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sIDLbl)
                    .addGroup(shipmentInfoPnlLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(sidInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destLbl)
                    .addComponent(destInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shipCostLbl)
                    .addComponent(shipCostInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLbl)
                    .addComponent(statusInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pkgIdLbl)
                    .addComponent(pkgIdInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shipmentInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemCountLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemCountInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        checkoutHdr.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        checkoutHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkoutHdr.setText("Checkout");

        totalHdr.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        totalHdr.setText("Total");

        totalDsplay.setEnabled(false);
        totalDsplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalDsplayActionPerformed(evt);
            }
        });

        cashHdr.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        cashHdr.setText("Cash");

        payBtn.setBackground(new java.awt.Color(73, 204, 112));
        payBtn.setFont(new java.awt.Font("Inter", 1, 22)); // NOI18N
        payBtn.setForeground(new java.awt.Color(255, 255, 255));
        payBtn.setText("Pay");
        payBtn.setBorder(null);
        payBtn.setBorderPainted(false);
        payBtn.setFocusPainted(false);
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shipmentFrmHdr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(checkoutHdr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(shipmentInfoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cashHdr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalHdr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalDsplay)
                            .addComponent(cashFld, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(shipmentFrmHdr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shipmentInfoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(checkoutHdr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalHdr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalDsplay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cashHdr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalDsplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalDsplayActionPerformed
    }//GEN-LAST:event_totalDsplayActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        String cashOnHand = cashFld.getText(), total = totalDsplay.getText();
        double totalAmt = Double.parseDouble(total), cash = Double.parseDouble(cashOnHand);
        // Case 1 - empty field
        if(DataIOParser.checkInput(cashOnHand)) {
            new DialogBoxUI(this, "Input is empty.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Case 2 - invalid type/format
        if(!DataIOParser.validateDouble(cashOnHand)) {
            new DialogBoxUI(this, "Invalid input!", JOptionPane.ERROR_MESSAGE);
            cashFld.setText("");
            return;
        }
        // Case 3 - not enough cash
        if(cash < totalAmt) {
            new DialogBoxUI(this, "Not enough cash.", JOptionPane.ERROR_MESSAGE);
            cashFld.setText("");
            return;
        }
        // Confirm payment
        double change = totalAmt - cash;
        String confirmMessage = String.format("Payment Successful. Change: %.2f", change);
        new DialogBoxUI(this, confirmMessage, JOptionPane.INFORMATION_MESSAGE);
        // change ship status -> pending from the original frame
        customerShipment.setStatus("Paid");
        Package pkg = customerShipment.getPackage();
        CSVParser.saveEntry(pkg.toCSVFormat(customerLoggedIn.getCustomerID()), "src/CSVFiles/packages.csv");
        Item[] items = pkg.getContents();
        for(Item item : items) {
            CSVParser.saveEntry(item.toCSVFormat(pkg.getId()), "src/CSVFiles/items.csv");
        }
        // save shipment to CSV if done
        CSVParser.saveEntry(customerShipment.toCSVFormat(), "src/CSVFiles/shipments.csv");
        new DialogBoxUI(this, "Shipment has been saved successfully.", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_payBtnActionPerformed


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
            java.util.logging.Logger.getLogger(ShipmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShipmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShipmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShipmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cashFld;
    private javax.swing.JLabel cashHdr;
    private javax.swing.JLabel checkoutHdr;
    private javax.swing.JLabel destInfo;
    private javax.swing.JLabel destLbl;
    private javax.swing.JLabel itemCountInfo;
    private javax.swing.JLabel itemCountLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payBtn;
    private javax.swing.JLabel pkgIdInfo;
    private javax.swing.JLabel pkgIdLbl;
    private javax.swing.JLabel sIDLbl;
    private javax.swing.JLabel shipCostInfo;
    private javax.swing.JLabel shipCostLbl;
    private javax.swing.JLabel shipmentFrmHdr;
    private javax.swing.JPanel shipmentInfoPnl;
    private javax.swing.JLabel sidInfo;
    private javax.swing.JLabel statusInfo;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JTextField totalDsplay;
    private javax.swing.JLabel totalHdr;
    // End of variables declaration//GEN-END:variables
}
