/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LogisticsUI;

import javax.swing.ImageIcon;
import datautils.io.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ItemForm extends javax.swing.JFrame {


    public ItemForm() {
        initComponents();
        setIconImage(new ImageIcon("src/assets/truck.png").getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutPnl = new javax.swing.JPanel();
        itemHdr = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameFld = new javax.swing.JTextField();
        weightLbl = new javax.swing.JLabel();
        weightFld = new javax.swing.JTextField();
        lengthLbl = new javax.swing.JLabel();
        lengthFld = new javax.swing.JTextField();
        widthLbl = new javax.swing.JLabel();
        widthFld = new javax.swing.JTextField();
        heightLbl = new javax.swing.JLabel();
        heightFld = new javax.swing.JTextField();
        addItemBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DeliverIT | Add Item");
        setResizable(false);

        itemHdr.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        itemHdr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemHdr.setText("Add Item");
        itemHdr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        nameLbl.setText("Name");

        nameFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFldActionPerformed(evt);
            }
        });

        weightLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        weightLbl.setText("Weight (grams)");

        lengthLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        lengthLbl.setText("Length (cm)");

        widthLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        widthLbl.setText("Width (cm)");

        heightLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        heightLbl.setText("Height (cm)");

        heightFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightFldActionPerformed(evt);
            }
        });

        addItemBtn.setBackground(new java.awt.Color(73, 204, 112));
        addItemBtn.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        addItemBtn.setForeground(new java.awt.Color(255, 255, 255));
        addItemBtn.setText("Add");
        addItemBtn.setToolTipText("");
        addItemBtn.setBorderPainted(false);
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layoutPnlLayout = new javax.swing.GroupLayout(layoutPnl);
        layoutPnl.setLayout(layoutPnlLayout);
        layoutPnlLayout.setHorizontalGroup(
            layoutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layoutPnlLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layoutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameFld)
                    .addComponent(weightFld, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(weightLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lengthLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lengthFld, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(widthLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(widthFld, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(heightLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(heightFld, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
            .addGroup(layoutPnlLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(addItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layoutPnlLayout.setVerticalGroup(
            layoutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutPnlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(itemHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(weightLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lengthLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lengthFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(widthLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(widthFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(heightLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addItemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFldActionPerformed

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        // Extract user inputs
        String name = nameFld.getText(), 
               weight = weightFld.getText(),
               height = heightFld.getText(),
               length = lengthFld.getText(),
               width = widthFld.getText();
        // Check empty fields
        if(DataIOParser.areEmptyFields(new String[] {name, weight, height, length, width})) {
            new DialogBoxUI(this, "Field/s are empty. Please double check your entries.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Check valid numeric inputs
        if(DataIOParser.areValidMeasures(new String[] {weight, height, length, width})) {
            new DialogBoxUI(this, "Invalid Input/s. Ensure numeric fields have numeric entries.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Add entries to the table - all entries are valid
        CustomerDashboard.addItemToTbl(new Object[] {
            name, 
            weight, 
            length, 
            width, 
            height
        });
        
        resetFields();
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void resetFields() {
        JTextField[] fields = {nameFld, weightFld, heightFld, lengthFld, widthFld};
        for(JTextField f : fields) {
            f.setText("");
        }
    }
    
    private void heightFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightFldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemForm();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBtn;
    private javax.swing.JTextField heightFld;
    private javax.swing.JLabel heightLbl;
    private javax.swing.JLabel itemHdr;
    private javax.swing.JPanel layoutPnl;
    private javax.swing.JTextField lengthFld;
    private javax.swing.JLabel lengthLbl;
    private javax.swing.JTextField nameFld;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField weightFld;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JTextField widthFld;
    private javax.swing.JLabel widthLbl;
    // End of variables declaration//GEN-END:variables
}
