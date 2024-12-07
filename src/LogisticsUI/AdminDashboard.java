/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LogisticsUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import datautils.io.*;
import ClassTemplates.*;
import javax.swing.ImageIcon;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Lenovo
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
        loadWarehouseData();
        loadVehicleData();
        setIconImage(new ImageIcon("src/assets/truck.png").getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        greeting = new javax.swing.JLabel();
        signout = new javax.swing.JButton();
        warehouseMngmnt = new javax.swing.JButton();
        generateReports = new javax.swing.JButton();
        vehicleMngmnt1 = new javax.swing.JButton();
        dashboard = new javax.swing.JPanel();
        warehouseCard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pkgCapacityInput = new javax.swing.JTextField();
        locationInput = new javax.swing.JTextField();
        vehicleCapacityInput = new javax.swing.JTextField();
        addWarehouseBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        warehouseTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        removeWarehouseBtn = new javax.swing.JButton();
        vehicleCard = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        warehouseIDInput = new javax.swing.JTextField();
        addVehicleBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vehicleTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        driverInput = new javax.swing.JTextField();
        plateInput = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        packageCapacityInput = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        typeInput = new javax.swing.JComboBox<>();
        removeVehicleBtn = new javax.swing.JButton();
        reportCard = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        filePathInput = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        generateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        sidebar.setBackground(new java.awt.Color(70, 92, 239));

        greeting.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        greeting.setForeground(new java.awt.Color(255, 255, 255));
        greeting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greeting.setText("<html><span style='font-family:Inter; font-weight:bold;'>Hello</span>, <span style='font-family:Inter;'>Admin</span></html>");

        signout.setBackground(new java.awt.Color(0, 0, 204));
        signout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signout.setForeground(new java.awt.Color(255, 255, 255));
        signout.setText("Logout");
        signout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutActionPerformed(evt);
            }
        });

        warehouseMngmnt.setBackground(new java.awt.Color(70, 92, 239));
        warehouseMngmnt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        warehouseMngmnt.setForeground(new java.awt.Color(255, 255, 255));
        warehouseMngmnt.setText("<html> <div style='text-align: center;'>Warehouse<br>Management</div></html>");
        warehouseMngmnt.setBorder(null);
        warehouseMngmnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseMngmntActionPerformed(evt);
            }
        });

        generateReports.setBackground(new java.awt.Color(70, 92, 239));
        generateReports.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        generateReports.setForeground(new java.awt.Color(255, 255, 255));
        generateReports.setText("Generate Reports\n");
        generateReports.setBorder(null);
        generateReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportsActionPerformed(evt);
            }
        });

        vehicleMngmnt1.setBackground(new java.awt.Color(70, 92, 239));
        vehicleMngmnt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vehicleMngmnt1.setForeground(new java.awt.Color(255, 255, 255));
        vehicleMngmnt1.setText("<html> <div style='text-align: center;'>Vehicle<br>Management</div></html>");
        vehicleMngmnt1.setBorder(null);
        vehicleMngmnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleMngmnt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(greeting, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(signout, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(warehouseMngmnt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateReports, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleMngmnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(greeting, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(warehouseMngmnt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vehicleMngmnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(generateReports, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(signout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel1.add(sidebar);
        sidebar.setBounds(0, 0, 201, 500);

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setName("dashboard"); // NOI18N
        dashboard.setPreferredSize(new java.awt.Dimension(600, 500));
        dashboard.setLayout(new java.awt.CardLayout());

        warehouseCard.setBackground(new java.awt.Color(255, 255, 255));
        warehouseCard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        warehouseCard.setName("warehouseCard"); // NOI18N
        warehouseCard.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Remove Warehouse");
        warehouseCard.add(jLabel1);
        jLabel1.setBounds(56, 231, 249, 46);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Add Warehouse");
        warehouseCard.add(jLabel2);
        jLabel2.setBounds(56, 41, 249, 46);

        pkgCapacityInput.setBackground(new java.awt.Color(204, 204, 204));
        pkgCapacityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkgCapacityInputActionPerformed(evt);
            }
        });
        warehouseCard.add(pkgCapacityInput);
        pkgCapacityInput.setBounds(56, 168, 258, 34);

        locationInput.setBackground(new java.awt.Color(204, 204, 204));
        locationInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        locationInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationInputActionPerformed(evt);
            }
        });
        warehouseCard.add(locationInput);
        locationInput.setBounds(56, 101, 258, 34);

        vehicleCapacityInput.setBackground(new java.awt.Color(204, 204, 204));
        vehicleCapacityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleCapacityInputActionPerformed(evt);
            }
        });
        warehouseCard.add(vehicleCapacityInput);
        vehicleCapacityInput.setBounds(326, 101, 230, 34);

        addWarehouseBtn.setBackground(new java.awt.Color(73, 204, 112));
        addWarehouseBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addWarehouseBtn.setForeground(new java.awt.Color(255, 255, 255));
        addWarehouseBtn.setText("Add");
        addWarehouseBtn.setBorder(null);
        addWarehouseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWarehouseBtnActionPerformed(evt);
            }
        });
        warehouseCard.add(addWarehouseBtn);
        addWarehouseBtn.setBounds(370, 170, 155, 34);

        warehouseTable.setBackground(new java.awt.Color(255, 255, 255));
        warehouseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Warehouse ID", "Location", "Package Capacity", "Vehicle Capacity"
            }
        ));
        jScrollPane1.setViewportView(warehouseTable);

        warehouseCard.add(jScrollPane1);
        jScrollPane1.setBounds(60, 280, 500, 190);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Vehicle Capacity");
        warehouseCard.add(jLabel3);
        jLabel3.setBounds(330, 80, 110, 16);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Location");
        warehouseCard.add(jLabel4);
        jLabel4.setBounds(60, 80, 110, 20);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Package Capacity");
        warehouseCard.add(jLabel5);
        jLabel5.setBounds(60, 150, 110, 16);

        removeWarehouseBtn.setBackground(new java.awt.Color(255, 102, 102));
        removeWarehouseBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removeWarehouseBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeWarehouseBtn.setText("Remove");
        removeWarehouseBtn.setBorder(null);
        removeWarehouseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeWarehouseBtnActionPerformed(evt);
            }
        });
        warehouseCard.add(removeWarehouseBtn);
        removeWarehouseBtn.setBounds(440, 240, 120, 30);

        dashboard.add(warehouseCard, "card2");

        vehicleCard.setBackground(new java.awt.Color(255, 255, 255));
        vehicleCard.setName("vehicleCard"); // NOI18N
        vehicleCard.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Remove Vehicle");
        vehicleCard.add(jLabel6);
        jLabel6.setBounds(56, 231, 249, 46);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Add Vehicle");
        vehicleCard.add(jLabel7);
        jLabel7.setBounds(56, 41, 249, 46);

        warehouseIDInput.setBackground(new java.awt.Color(204, 204, 204));
        vehicleCard.add(warehouseIDInput);
        warehouseIDInput.setBounds(66, 168, 140, 34);

        addVehicleBtn.setBackground(new java.awt.Color(73, 204, 112));
        addVehicleBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addVehicleBtn.setForeground(new java.awt.Color(255, 255, 255));
        addVehicleBtn.setText("Add");
        addVehicleBtn.setBorder(null);
        addVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleBtnActionPerformed(evt);
            }
        });
        vehicleCard.add(addVehicleBtn);
        addVehicleBtn.setBounds(410, 170, 155, 34);

        vehicleTable.setBackground(new java.awt.Color(255, 255, 255));
        vehicleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Warehouse ID", "Type", "Plate Number", "Driver", "Maximum Capacity", "Current Capacity", "Maximum Shipments", "Current Shipments", "Available"
            }
        ));
        jScrollPane2.setViewportView(vehicleTable);

        vehicleCard.add(jScrollPane2);
        jScrollPane2.setBounds(30, 280, 560, 190);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Type");
        vehicleCard.add(jLabel9);
        jLabel9.setBounds(60, 80, 110, 20);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Warehouse ID");
        vehicleCard.add(jLabel10);
        jLabel10.setBounds(60, 150, 110, 16);

        driverInput.setBackground(new java.awt.Color(204, 204, 204));
        vehicleCard.add(driverInput);
        driverInput.setBounds(230, 170, 150, 34);

        plateInput.setBackground(new java.awt.Color(204, 204, 204));
        plateInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        vehicleCard.add(plateInput);
        plateInput.setBounds(230, 100, 150, 34);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("License Plate");
        vehicleCard.add(jLabel11);
        jLabel11.setBounds(230, 80, 110, 20);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Driver Name");
        vehicleCard.add(jLabel12);
        jLabel12.setBounds(230, 150, 110, 16);

        packageCapacityInput.setBackground(new java.awt.Color(204, 204, 204));
        packageCapacityInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        vehicleCard.add(packageCapacityInput);
        packageCapacityInput.setBounds(410, 100, 150, 34);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Package Capacity");
        vehicleCard.add(jLabel13);
        jLabel13.setBounds(410, 80, 110, 20);

        typeInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truck", "Van" }));
        vehicleCard.add(typeInput);
        typeInput.setBounds(60, 100, 150, 30);

        removeVehicleBtn.setBackground(new java.awt.Color(255, 102, 102));
        removeVehicleBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removeVehicleBtn.setForeground(new java.awt.Color(255, 255, 255));
        removeVehicleBtn.setText("Remove");
        removeVehicleBtn.setBorder(null);
        removeVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeVehicleBtnActionPerformed(evt);
            }
        });
        vehicleCard.add(removeVehicleBtn);
        removeVehicleBtn.setBounds(440, 240, 120, 30);

        dashboard.add(vehicleCard, "card3");

        reportCard.setBackground(new java.awt.Color(255, 255, 255));
        reportCard.setName("reportCard"); // NOI18N
        reportCard.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Generate Reports");
        reportCard.add(jLabel8);
        jLabel8.setBounds(50, 120, 310, 60);

        filePathInput.setBackground(new java.awt.Color(204, 204, 204));
        reportCard.add(filePathInput);
        filePathInput.setBounds(50, 200, 340, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Report File Path");
        reportCard.add(jLabel14);
        jLabel14.setBounds(50, 180, 140, 20);

        generateBtn.setBackground(new java.awt.Color(73, 204, 112));
        generateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        generateBtn.setForeground(new java.awt.Color(255, 255, 255));
        generateBtn.setText("Generate");
        generateBtn.setBorder(null);
        generateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtnActionPerformed(evt);
            }
        });
        reportCard.add(generateBtn);
        generateBtn.setBounds(50, 260, 130, 30);

        dashboard.add(reportCard, "card4");

        jPanel1.add(dashboard);
        dashboard.setBounds(200, 0, 610, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutActionPerformed
        JOptionPane.showMessageDialog(this, "Thanks for using the system!", "Sign-out", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_signoutActionPerformed

    private void warehouseMngmntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouseMngmntActionPerformed
        dashboard.removeAll();
        dashboard.add(warehouseCard);
        dashboard.repaint();
        dashboard.revalidate();
    }//GEN-LAST:event_warehouseMngmntActionPerformed

    private void generateReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportsActionPerformed
        dashboard.removeAll();
        dashboard.add(reportCard);
        dashboard.repaint();
        dashboard.revalidate();
    }//GEN-LAST:event_generateReportsActionPerformed

    private void vehicleMngmnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleMngmnt1ActionPerformed
        dashboard.removeAll();
        dashboard.add(vehicleCard);
        dashboard.repaint();
        dashboard.revalidate();
    }//GEN-LAST:event_vehicleMngmnt1ActionPerformed

    private void locationInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationInputActionPerformed

    private void addWarehouseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWarehouseBtnActionPerformed
        String location = locationInput.getText(), packageCapacity = pkgCapacityInput.getText(), vehicleCapacity = vehicleCapacityInput.getText();
        
        if (!DataIOParser.validateInt(packageCapacity)) {
            new DialogBoxUI("Package Capacity must be a nunber", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!DataIOParser.validateInt(vehicleCapacity)) {
            new DialogBoxUI("Vehicle Capacity must be a nunber", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int packageCapacityInt = Integer.parseInt(packageCapacity), vehicleCapacityInt = Integer.parseInt(vehicleCapacity);
        
        Warehouse warehouse = new Warehouse(CSVParser.getLatestID("src/CSVFiles/warehouses.csv") + 1, location, packageCapacityInt, vehicleCapacityInt);
        CSVParser.saveEntry(warehouse.toCSVFormat(), "src/CSVFiles/warehouses.csv");
        new DialogBoxUI("Warehouse Added Successfully", JOptionPane.INFORMATION_MESSAGE);
        loadWarehouseData();
        resetWarehouseFields();
    }//GEN-LAST:event_addWarehouseBtnActionPerformed

    private void generateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtnActionPerformed
        String filepath = filePathInput.getText();
        generateReports(filepath);
    }//GEN-LAST:event_generateBtnActionPerformed

    private void pkgCapacityInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkgCapacityInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pkgCapacityInputActionPerformed

    private void vehicleCapacityInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleCapacityInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleCapacityInputActionPerformed

    private void removeWarehouseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeWarehouseBtnActionPerformed
        String csvFilePath = "src/CSVFiles/warehouses.csv";
        int selectedRow = warehouseTable.getSelectedRow();
        
        if (selectedRow == -1) {
            new DialogBoxUI("Please select a warehouse to delete", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String warehouseId = (String) warehouseTable.getValueAt(selectedRow, 0);
        
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this warehouse?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            String[][] warehouseData = CSVParser.loadCSVData(csvFilePath);
            Warehouse[] warehouses = Warehouse.toWarehouse(warehouseData);
            boolean removed = false;
            
            for (int i = 0; i < warehouseData.length; i++) {
                if (warehouseData[i][0].equals(warehouseId)) {
                    warehouseData[i] = null;
                    removed = true;
                    break;
                }
            }

            if (removed) {
                String[][] updatedData = new String[warehouseData.length - 1][];
                int index = 0;
                for (String[] warehouse : warehouseData) {
                    if (warehouse != null) {
                        updatedData[index++] = warehouse;
                    }
                }
                CSVParser.writeToCSV(updatedData, warehouses[0].getWarehouseHeader(), false, csvFilePath);
            }
            new DialogBoxUI("Warehouse Removed Successfully", JOptionPane.INFORMATION_MESSAGE);
        }
        loadWarehouseData();
    }//GEN-LAST:event_removeWarehouseBtnActionPerformed

    private void addVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleBtnActionPerformed
        String type = (String) typeInput.getSelectedItem(), plateNumber = plateInput.getText(), packageCapacity = packageCapacityInput.getText(), driver = driverInput.getText(), whId = warehouseIDInput.getText();
        int currentShipmentCount = 0;
        boolean isAvailable = true;
        
        if (!DataIOParser.validateInt(packageCapacity)) {
            new DialogBoxUI("Package Capacity must be a nunber", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!DataIOParser.validateInt(whId)) {
            new DialogBoxUI("Wharehouse ID must be a nunber", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Vehicle vehicle;
        
        int packageCapacityInt = Integer.parseInt(packageCapacity), whIdInt = Integer.parseInt(whId);
        
        if (type.equalsIgnoreCase("van")) {
            String capacityKg = JOptionPane.showInputDialog(this, "Enter maximum capacity (KG):", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
            if (!DataIOParser.validateDouble(capacityKg)) {
                new DialogBoxUI("Capacity must be a nunber", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double capacityKgDouble = Double.parseDouble(capacityKg);
            double currentCapacity = 0;
            
            vehicle = new Vehicle(CSVParser.getLatestID("src/CSVFiles/vehicles.csv") + 1, whIdInt, type, plateNumber, driver, capacityKgDouble, currentCapacity, packageCapacityInt, currentShipmentCount, isAvailable);
        } else {
            String maxWarehouseRoutes = JOptionPane.showInputDialog(this, "Enter maximum warehouse routes:", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
            if (!DataIOParser.validateInt(maxWarehouseRoutes)) {
                new DialogBoxUI("Warehouse Routes must be a nunber", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int maxWarehouseRoutesInt = Integer.parseInt(maxWarehouseRoutes);
            vehicle = new Truck(CSVParser.getLatestID("src/CSVFiles/vehicles.csv") + 1, whIdInt, plateNumber, driver, packageCapacityInt, currentShipmentCount, isAvailable, maxWarehouseRoutesInt);
        }
        CSVParser.saveEntry(vehicle.toCSVFormat(), "src/CSVFiles/vehicles.csv");
        new DialogBoxUI("Vehicle Added Successfully", JOptionPane.INFORMATION_MESSAGE);
        resetVehicleFields();
    }//GEN-LAST:event_addVehicleBtnActionPerformed

    private void removeVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeVehicleBtnActionPerformed
        String csvFilePath = "src/CSVFiles/vehicles.csv";
        int selectedRow = vehicleTable.getSelectedRow();
        
        if (selectedRow == -1) {
            new DialogBoxUI("Please select a vehicle to delete", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String vehicleId = (String) vehicleTable.getValueAt(selectedRow, 0);
        
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this vehicle?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            String[][] vehicleData = CSVParser.loadCSVData(csvFilePath);
            Vehicle[] vehicles = Vehicle.toVehicle(vehicleData);
            boolean removed = false;
            
            for (int i = 0; i < vehicleData.length; i++) {
                if (vehicleData[i][0].equals(vehicleId)) {
                    vehicleData[i] = null;
                    removed = true;
                    break;
                }
            }

            if (removed) {
                String[][] updatedData = new String[vehicleData.length - 1][];
                int index = 0;
                for (String[] vehicle : vehicleData) {
                    if (vehicle != null) {
                        updatedData[index++] = vehicle;
                    }
                }
                CSVParser.writeToCSV(updatedData, vehicles[0].getVehicleHeader(), false, csvFilePath);
            }
            new DialogBoxUI("Vehicle Removed Successfully", JOptionPane.INFORMATION_MESSAGE);
        }
        loadVehicleData();
    }//GEN-LAST:event_removeVehicleBtnActionPerformed

    private void resetWarehouseFields() {
        locationInput.setText("");
        pkgCapacityInput.setText("");
        vehicleCapacityInput.setText("");
    }
    
    private void resetVehicleFields() {
        typeInput.setSelectedItem("Truck");
        plateInput.setText("");
        packageCapacityInput.setText("");
        driverInput.setText("");
        warehouseIDInput.setText("");
    }
    
    
    private void loadWarehouseData() {
        String csvFilePath = "src/CSVFiles/warehouses.csv";
        DefaultTableModel model = (DefaultTableModel) warehouseTable.getModel();
        model.setRowCount(0);
        String[][] warehouses = CSVParser.loadCSVData(csvFilePath);
        
        for (String[] warehouse : warehouses) {
            model.addRow(warehouse);
        }
    }
    
    private void loadVehicleData() {
        String csvFilePath = "src/CSVFiles/vehicles.csv";
        DefaultTableModel model = (DefaultTableModel) vehicleTable.getModel();
        model.setRowCount(0);
        String[][] vehicles = CSVParser.loadCSVData(csvFilePath);
        
        for (String[] vehicle : vehicles) {
            model.addRow(vehicle);
        }
    }
    
    private void generateReports(String fileReportLocation) {
        StringBuilder report = new StringBuilder();
        report.append("DeliverIT System Report\n");
        report.append("========================\n\n");

        report.append("Warehouses:\n");
        String[][] warehousesData = CSVParser.loadCSVData("src/CSVFiles/warehouses.csv");
        for (String[] warehouse : warehousesData) {
            report.append(String.format("ID: %s, Location: %s, Max Shipment/s: %s, Max Vehicles: %s\n",
                    warehouse[0], warehouse[1], warehouse[2], warehouse[3]));
        }
        report.append("\n");

        report.append("Packages:\n");
        String[][] packagesData = CSVParser.loadCSVData("src/CSVFiles/packages.csv");
        for (String[] pkg : packagesData) {
            report.append(String.format("ID: %s, Customer ID: %s, Receiver Address: %s, Created: %s, Weight: %s kg, Dimensions: %s x %s x %s cm\n",
                    pkg[0], pkg[1], pkg[2], pkg[3], pkg[4], pkg[5], pkg[6], pkg[7]));
        }
        report.append("\n");

        report.append("Vehicles:\n");
        String[][] vehiclesData = CSVParser.loadCSVData("src/CSVFiles/vehicles.csv");
        for (String[] vehicle : vehiclesData) {
            report.append(String.format("ID: %s, Warehouse ID: %s, Type: %s, License Plate: %s, Driver: %s, Max Capacity: %s KG, Current Capacity: %s KG, Max Shipments: %s, Current Shipments: %s, Available: %s\n",
                    vehicle[0], vehicle[1], vehicle[2], vehicle[3], vehicle[4], vehicle[5], vehicle[6], vehicle[7], vehicle[8], vehicle[9]));
        }
        report.append("\n");

        report.append("Shipments:\n");
        String[][] shipmentsData = CSVParser.loadCSVData("src/CSVFiles/shipments.csv");
        for (String[] shipment : shipmentsData) {
            report.append(String.format("ID: %s, Package ID: %s, Vehicle ID: %s, Warehouse ID: %s, Destination: %s, Cost: %s, Confirmed: %s, Status: %s, Ship Date: %s, ETA: %s\n",
                    shipment[0], shipment[1], shipment[2], shipment[3], shipment[4], shipment[5], shipment[6], shipment[7], shipment[8], shipment[9]));
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("src/CSVFiles/" + fileReportLocation))) {
            writer.write(report.toString());
            new DialogBoxUI("Report generated successfully: src/CSVFiles/" + fileReportLocation, JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            new DialogBoxUI("Error generating report: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVehicleBtn;
    private javax.swing.JButton addWarehouseBtn;
    private javax.swing.JPanel dashboard;
    private javax.swing.JTextField driverInput;
    private javax.swing.JTextField filePathInput;
    private javax.swing.JButton generateBtn;
    private javax.swing.JButton generateReports;
    private javax.swing.JLabel greeting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField locationInput;
    private javax.swing.JTextField packageCapacityInput;
    private javax.swing.JTextField pkgCapacityInput;
    private javax.swing.JTextField plateInput;
    private javax.swing.JButton removeVehicleBtn;
    private javax.swing.JButton removeWarehouseBtn;
    private javax.swing.JPanel reportCard;
    private javax.swing.JPanel sidebar;
    private javax.swing.JButton signout;
    private javax.swing.JComboBox<String> typeInput;
    private javax.swing.JTextField vehicleCapacityInput;
    private javax.swing.JPanel vehicleCard;
    private javax.swing.JButton vehicleMngmnt1;
    private javax.swing.JTable vehicleTable;
    private javax.swing.JPanel warehouseCard;
    private javax.swing.JTextField warehouseIDInput;
    private javax.swing.JButton warehouseMngmnt;
    private javax.swing.JTable warehouseTable;
    // End of variables declaration//GEN-END:variables
}