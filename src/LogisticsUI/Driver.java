/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LogisticsUI;

import datautils.io.CSVParser;
import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import ClassTemplates.Shipment;
import ClassTemplates.Vehicle;
/**
 *
 * @author User
 */
public class Driver extends javax.swing.JFrame {
    
    private final java.awt.Color defaultButtonColor = java.awt.Color.decode("#465CEF");
    private final java.awt.Color activeButtonColor = java.awt.Color.decode("#509BE5");
    private String driverName;
    private Vehicle currentVehicle;
    private boolean isVehicleAssigned = false;
    /**
     * Creates new form Driver
     */
    public Driver() {
        initComponents();
        askForDriverName();
    }

    private void askForDriverName() {
        while (true) {
            driverName = JOptionPane.showInputDialog(this, "Enter your name:", "Driver Name", JOptionPane.QUESTION_MESSAGE);
            if (driverName != null && !driverName.trim().isEmpty()) {
                break; 
            } else {
                JOptionPane.showMessageDialog(this, "Name cannot be empty. Please enter a valid name.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        assignVehicleToDriver();
    }

    private void assignVehicleToDriver() {
        String[][] vehicleData = CSVParser.loadCSVData("src/CSVFiles/vehicles.csv");
        if (vehicleData == null || vehicleData.length == 0) {
            JOptionPane.showMessageDialog(this, "No vehicle data loaded.", "Data Load Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Vehicle vh[] = Vehicle.toVehicle(vehicleData);
        for (Vehicle vehicle : vh) {
            if (driverName.equalsIgnoreCase(vehicle.getDriver())) {
                // Assign the vehicle to the driver
                vehicle.setDriver(driverName);
                currentVehicle = vehicle;
                JOptionPane.showMessageDialog(this, "Vehicle assigned successfully!", "Vehicle Assignment", JOptionPane.INFORMATION_MESSAGE);
                isVehicleAssigned = true;
                break;
            }
        }
        if (!isVehicleAssigned) {
            // No vehicle available to assign
            JOptionPane.showMessageDialog(this, "No available vehicle found. Please Re-Assign Vehicle Manually.", "Vehicle Assignment Error", JOptionPane.ERROR_MESSAGE);
        }
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
        DeliverPackageBtn = new javax.swing.JButton();
        AssignVehicleBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        EmptyPanel = new javax.swing.JPanel();
        AssignVehiclesPanel = new javax.swing.JPanel();
        NestedPanel = new javax.swing.JPanel();
        HeaderLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AvailableVehiclesTable = new javax.swing.JTable();
        ConfirmBtn = new javax.swing.JButton();
        DeliverPackagePanel = new javax.swing.JPanel();
        NestedPanel1 = new javax.swing.JPanel();
        HeaderLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShipmentListTable = new javax.swing.JTable();
        ConfirmBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        NullPanel.setBackground(new java.awt.Color(240, 245, 255));
        NullPanel.setLayout(null);

        SidebarPanel.setBackground(new java.awt.Color(70, 92, 239));
        SidebarPanel.setMaximumSize(new java.awt.Dimension(200, 500));
        SidebarPanel.setMinimumSize(new java.awt.Dimension(200, 500));
        SidebarPanel.setPreferredSize(new java.awt.Dimension(200, 500));

        UserGreetingsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UserGreetingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserGreetingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserGreetingsLabel.setText("<html><span style='font-family:Inter; font-weight:bold;'>Hello, </span><span style='font-family:Inter; font-weight:50;'>Driver</span></html>");

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

        DeliverPackageBtn.setBackground(new java.awt.Color(70, 92, 239));
        DeliverPackageBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DeliverPackageBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeliverPackageBtn.setText("<html><body style=\"font-family: Inter; font-weight: 10; text-align: center;\">Deliver<br>Package</body></html>");
        DeliverPackageBtn.setBorderPainted(false);
        DeliverPackageBtn.setContentAreaFilled(false);
        DeliverPackageBtn.setFocusPainted(false);
        DeliverPackageBtn.setFocusable(false);
        DeliverPackageBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DeliverPackageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliverPackageBtnActionPerformed(evt);
            }
        });

        AssignVehicleBtn.setBackground(new java.awt.Color(70, 92, 239));
        AssignVehicleBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        AssignVehicleBtn.setForeground(new java.awt.Color(255, 255, 255));
        AssignVehicleBtn.setText("<html><body style=\"font-family: Inter; font-weight: 10; text-align: center;\">Re-assign<br>Vehicle</body></html>");
        AssignVehicleBtn.setBorderPainted(false);
        AssignVehicleBtn.setContentAreaFilled(false);
        AssignVehicleBtn.setFocusPainted(false);
        AssignVehicleBtn.setFocusable(false);
        AssignVehicleBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AssignVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignVehicleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidebarPanelLayout = new javax.swing.GroupLayout(SidebarPanel);
        SidebarPanel.setLayout(SidebarPanelLayout);
        SidebarPanelLayout.setHorizontalGroup(
            SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(UserGreetingsLabel)
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGroup(SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AssignVehicleBtn)
                    .addComponent(DeliverPackageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SidebarPanelLayout.setVerticalGroup(
            SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(UserGreetingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(AssignVehicleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(DeliverPackageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        NullPanel.add(SidebarPanel);
        SidebarPanel.setBounds(0, 0, 200, 500);

        MainPanel.setBackground(new java.awt.Color(240, 245, 255));
        MainPanel.setLayout(new java.awt.CardLayout());

        EmptyPanel.setBackground(new java.awt.Color(240, 245, 255));
        EmptyPanel.setLayout(new java.awt.CardLayout());
        MainPanel.add(EmptyPanel, "card2");

        AssignVehiclesPanel.setBackground(new java.awt.Color(240, 245, 255));
        AssignVehiclesPanel.setLayout(new java.awt.CardLayout());

        NestedPanel.setBackground(new java.awt.Color(255, 255, 255));

        HeaderLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(0, 0, 0));
        HeaderLabel.setText("<html><span style='font-family: Inter; font-weight: bold;'>Available Vehicle(s)</span></html>");

        AvailableVehiclesTable.setBackground(new java.awt.Color(255, 255, 255));
        AvailableVehiclesTable.setForeground(new java.awt.Color(0, 0, 0));
        AvailableVehiclesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle ID", "Type", "Warehouse ID", "License Plate", "Current Shipments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        AvailableVehiclesTable.setCellSelectionEnabled(true);
        AvailableVehiclesTable.setFocusable(false);
        AvailableVehiclesTable.setGridColor(new java.awt.Color(255, 255, 255));
        AvailableVehiclesTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        AvailableVehiclesTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        AvailableVehiclesTable.setShowGrid(true);
        AvailableVehiclesTable.getTableHeader().setResizingAllowed(false);
        AvailableVehiclesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(AvailableVehiclesTable);

        ConfirmBtn.setBackground(new java.awt.Color(73, 204, 112));
        ConfirmBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBtn.setText("<html>\n  <body style=\"font-family: Inter; font-weight: bold; text-align: center;\">\n    Confirm\n  </body>\n</html>\n");
        ConfirmBtn.setBorderPainted(false);
        ConfirmBtn.setFocusPainted(false);
        ConfirmBtn.setFocusable(false);
        ConfirmBtn.setRequestFocusEnabled(false);
        ConfirmBtn.setRolloverEnabled(false);
        ConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtnActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        AssignVehiclesPanel.add(NestedPanel, "card2");

        MainPanel.add(AssignVehiclesPanel, "AssignVehiclesPanel");

        DeliverPackagePanel.setBackground(new java.awt.Color(240, 245, 255));
        DeliverPackagePanel.setLayout(new java.awt.CardLayout());

        NestedPanel1.setBackground(new java.awt.Color(255, 255, 255));

        HeaderLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HeaderLabel1.setForeground(new java.awt.Color(0, 0, 0));
        HeaderLabel1.setText("<html><span style='font-family: Inter; font-weight: bold;'>Shipment(s) Stored in Vehicle</span></html>");

        ShipmentListTable.setBackground(new java.awt.Color(255, 255, 255));
        ShipmentListTable.setForeground(new java.awt.Color(0, 0, 0));
        ShipmentListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ShipmentListTable.setCellSelectionEnabled(true);
        ShipmentListTable.setFocusable(false);
        ShipmentListTable.setGridColor(new java.awt.Color(255, 255, 255));
        ShipmentListTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        ShipmentListTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ShipmentListTable.setShowGrid(false);
        ShipmentListTable.getTableHeader().setResizingAllowed(false);
        ShipmentListTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ShipmentListTable);

        ConfirmBtn2.setBackground(new java.awt.Color(73, 204, 112));
        ConfirmBtn2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConfirmBtn2.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBtn2.setText("<html>\n  <body style=\"font-family: Inter; font-weight: bold; text-align: center;\">\n    Confirm\n  </body>\n</html>\n");
        ConfirmBtn2.setBorderPainted(false);
        ConfirmBtn2.setFocusPainted(false);
        ConfirmBtn2.setFocusable(false);
        ConfirmBtn2.setRequestFocusEnabled(false);
        ConfirmBtn2.setRolloverEnabled(false);
        ConfirmBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NestedPanel1Layout = new javax.swing.GroupLayout(NestedPanel1);
        NestedPanel1.setLayout(NestedPanel1Layout);
        NestedPanel1Layout.setHorizontalGroup(
            NestedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NestedPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(NestedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfirmBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NestedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        NestedPanel1Layout.setVerticalGroup(
            NestedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NestedPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(HeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        DeliverPackagePanel.add(NestedPanel1, "card2");

        MainPanel.add(DeliverPackagePanel, "DeliverPackagePanel");

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

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LogoutActionPerformed

    private void resetButtonColors() {
        AssignVehicleBtn.setOpaque(false);
        AssignVehicleBtn.setBackground(defaultButtonColor);
        DeliverPackageBtn.setOpaque(false);
        DeliverPackageBtn.setBackground(defaultButtonColor);
    }
    
    private void DeliverPackageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliverPackageBtnActionPerformed
        // TODO add your handling code here:
        resetButtonColors();
        DeliverPackageBtn.setOpaque(true);
        DeliverPackageBtn.setBackground(activeButtonColor);
        if (!isVehicleAssigned) {
            showMessage("Please assign a vehicle first.", "Vehicle Assignment", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    
        showPanel("DeliverPackagePanel");
        loadShipmentData();
    }//GEN-LAST:event_DeliverPackageBtnActionPerformed

    private void loadShipmentData() {
        ClassTemplates.Package[] packages = loadPackages();
        Shipment[] shipments = loadShipments(packages);
    
        if (shipments == null) {
            return;
        }
    
        populateShipmentTable(shipments);
    }

    private void AssignVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignVehicleBtnActionPerformed
        // TODO add your handling code here:
        resetButtonColors();
        AssignVehicleBtn.setOpaque(true);
        AssignVehicleBtn.setBackground(activeButtonColor);
        CardLayout card = (CardLayout) MainPanel.getLayout();
        card.show(MainPanel, "AssignVehiclesPanel");
        
        loadVehicleData();
    }//GEN-LAST:event_AssignVehicleBtnActionPerformed

    private void ConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtnActionPerformed
        int selectedRow = AvailableVehiclesTable.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Please select a vehicle to assign the driver.",
                "No Selection",
                javax.swing.JOptionPane.WARNING_MESSAGE
            );
            return;
        }
    
        // Get selected vehicle details
        int vehicleID = Integer.parseInt(AvailableVehiclesTable.getValueAt(selectedRow, 0).toString());
    
        // Load vehicle data and convert to Vehicle objects
        String[][] vehicleData = CSVParser.loadCSVData("src/CSVFiles/vehicles.csv");
        if (vehicleData == null || vehicleData.length == 0) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "No vehicle data found.",
                "Data Load Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        Vehicle[] vehicles = Vehicle.toVehicle(vehicleData);
    
        Vehicle previousAssignedVehicle = null;
    
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getDriver().equalsIgnoreCase(driverName)) {
                previousAssignedVehicle = vehicle;
            }
            if (vehicle.getVehicleID() == vehicleID) {
                currentVehicle = vehicle;
                isVehicleAssigned = true;
            }
        }
    
        if (currentVehicle == null) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Selected vehicle not found in the data.",
                "Data Error",
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
            return;
        }
    
        currentVehicle.setDriver(driverName);
    
        CSVParser.updateCSV(
            "src/CSVFiles/vehicles.csv",
            currentVehicle.getVehicleID(),
            driverName,
            4, 
            vehicles[0].getVehicleHeader() 
        );
    
        if (previousAssignedVehicle != null) {
            previousAssignedVehicle.setDriver("NA"); // Unassign driver
            CSVParser.updateCSV(
                "src/CSVFiles/vehicles.csv",
                previousAssignedVehicle.getVehicleID(),
                "NA",
                4, 
                vehicles[0].getVehicleHeader() 
            );
        }
        
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Driver " + driverName + " successfully assigned to Vehicle ID " + vehicleID + ".",
            "Assignment Successful",
            javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    
        loadVehicleData();
    }//GEN-LAST:event_ConfirmBtnActionPerformed

    private void ConfirmBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtn2ActionPerformed
        ClassTemplates.Package[] packages = loadPackages();
        Shipment[] shipments = loadShipments(packages);
        
        if (shipments == null) {
            return;
        }
        
        int selectedRow = ShipmentListTable.getSelectedRow();
        if (selectedRow == -1) {
            showMessage("Please select a shipment to confirm.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }
    
        int shipmentId = Integer.parseInt(ShipmentListTable.getValueAt(selectedRow, 1).toString());
        Shipment selectedShipment = findShipmentById(shipments, shipmentId);
    
        if (selectedShipment != null) {
            handleShipmentConfirmation(selectedShipment);
        } else {
            showMessage("Shipment not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConfirmBtn2ActionPerformed
    
    private void loadVehicleData() {
        String[][] vehicleData = CSVParser.loadCSVData("src/CSVFiles/vehicles.csv");
        if (vehicleData == null || vehicleData.length == 0) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "No data loaded from the CSV file.",
                "Data Load Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        Vehicle[] vehicles = Vehicle.toVehicle(vehicleData);
    
        DefaultTableModel model = (DefaultTableModel) AvailableVehiclesTable.getModel();
        model.setRowCount(0);

        for (Vehicle vehicle : vehicles) {
            try {
                if ((vehicle.getDriver().equalsIgnoreCase("NA") || vehicle.getDriver().trim().isEmpty() || vehicle.getDriver().equalsIgnoreCase("null"))
                    && vehicle.isAvailable()
                    && vehicle.getType().equalsIgnoreCase("Van")) {

                    model.addRow(new Object[]{
                        vehicle.getVehicleID(), 
                        vehicle.getType(),   
                        vehicle.getWarehouseId(), 
                        vehicle.getLicensePlate(), 
                        vehicle.getCurrentShipmentCount() 
                    });
                } 
            } catch (Exception e) {
                System.out.println("Error with vehicle: " + vehicle);
                javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Error processing vehicle: " + vehicle,
                    "Vehicle Data Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE
                );
            }
        }
    
        AvailableVehiclesTable.revalidate();
        AvailableVehiclesTable.repaint();
    }

    private ClassTemplates.Package[] loadPackages() {
        String[][] packageData = CSVParser.loadCSVData("src/CSVFiles/packages.csv");
        if (packageData == null || packageData.length == 0) {
            showMessage("No package data loaded from the CSV file.", "Data Load Error", JOptionPane.WARNING_MESSAGE);
            return new ClassTemplates.Package[0];
        }
    
        ClassTemplates.Package[] packages = new ClassTemplates.Package[packageData.length];
        for (int i = 0; i < packageData.length; i++) {
            packages[i] = ClassTemplates.Package.toPackage(packageData, i, null);
        }
        return packages;
    }

    private Shipment[] loadShipments(ClassTemplates.Package[] packages) {
        String[][] shipmentData = CSVParser.loadCSVData("src/CSVFiles/shipments.csv");
        if (shipmentData == null || shipmentData.length == 0) {
            showMessage("No shipment data loaded from the CSV file.", "Data Load Error", JOptionPane.WARNING_MESSAGE);
            return null;
        }
    
        Shipment[] shipments = new Shipment[shipmentData.length];
        for (int i = 0; i < shipmentData.length; i++) {
            int pkgId = Integer.parseInt(shipmentData[i][1]);
            ClassTemplates.Package correspondingPackage = findPackageById(packages, pkgId);
            shipments[i] = Shipment.toShipment(shipmentData, i, correspondingPackage);
        }
        return shipments;
    }
    
    private ClassTemplates.Package findPackageById(ClassTemplates.Package[] packages, int pkgId) {
        for (ClassTemplates.Package pkg : packages) {
            if (pkg.getId() == pkgId) {
                return pkg;
            }
        }
        return null;
    }
    
    private Shipment findShipmentById(Shipment[] shipments, int shipmentId) {
        for (Shipment shipment : shipments) {
            if (shipment.getShipmentID() == shipmentId) {
                return shipment;
            }
        }
        return null;
    }
    
    private void handleShipmentConfirmation(Shipment selectedShipment) {
        int confirm = JOptionPane.showConfirmDialog(
            null, 
            "Confirm shipment ID " + selectedShipment.getShipmentID() + "?", 
            "Confirm Shipment", 
            JOptionPane.YES_NO_OPTION
        );
    
        if (confirm == JOptionPane.YES_OPTION) {
            selectedShipment.setStatus("Delivered");
            selectedShipment.setVehicleId(0);
            currentVehicle.removeShipment(selectedShipment);
    
            updateCSVFiles(selectedShipment);
    
            showMessage("Shipment ID " + selectedShipment.getShipmentID() + " confirmed successfully.", "Confirmation Successful", JOptionPane.INFORMATION_MESSAGE);
            loadShipmentData();
        }
    }

    private void updateCSVFiles(Shipment shipment) {
        CSVParser.updateCSV("src/CSVFiles/shipments.csv", shipment.getShipmentID(), shipment.getStatus(), 7, shipment.getShipmentHeader());
        CSVParser.updateCSV("src/CSVFiles/shipments.csv", shipment.getShipmentID(), String.valueOf(shipment.getVehicleId()), 2, shipment.getShipmentHeader());
    
        CSVParser.updateCSV("src/CSVFiles/vehicles.csv", currentVehicle.getVehicleID(), String.valueOf(currentVehicle.getCurrentShipmentCount()), 8, currentVehicle.getVehicleHeader());
        CSVParser.updateCSV("src/CSVFiles/vehicles.csv", currentVehicle.getVehicleID(), String.format("%d", (int) currentVehicle.getCurrentCapacityKG()), 6, currentVehicle.getVehicleHeader());
    }

    private void populateShipmentTable(Shipment[] shipments) {
        DefaultTableModel model = (DefaultTableModel) ShipmentListTable.getModel();
        model.setRowCount(0);
    
        ArrayList<Shipment> pendingShipments = new ArrayList<>();
        int counter = 0;
    
        for (Shipment shipment : shipments) {
            if (shipment != null && shipment.getStatus().equalsIgnoreCase("Pending") && shipment.getVehicleId() == currentVehicle.getVehicleID()) {
                model.addRow(new Object[]{counter, shipment.getShipmentID(), shipment.getStatus()});
                pendingShipments.add(shipment);
                counter++;
            }
        }
    
        currentVehicle.setShipments(pendingShipments.toArray(new Shipment[0]));
        ShipmentListTable.revalidate();
        ShipmentListTable.repaint();
    }

    private void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(this, message, title, messageType);
    }

    private void showPanel(String panelName) {
        CardLayout card = (CardLayout) MainPanel.getLayout();
        card.show(MainPanel, panelName);
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
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignVehicleBtn;
    private javax.swing.JPanel AssignVehiclesPanel;
    private javax.swing.JTable AvailableVehiclesTable;
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JButton ConfirmBtn2;
    private javax.swing.JButton DeliverPackageBtn;
    private javax.swing.JPanel DeliverPackagePanel;
    private javax.swing.JPanel EmptyPanel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel HeaderLabel1;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel NestedPanel;
    private javax.swing.JPanel NestedPanel1;
    private javax.swing.JPanel NullPanel;
    private javax.swing.JTable ShipmentListTable;
    private javax.swing.JPanel SidebarPanel;
    private javax.swing.JLabel UserGreetingsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
