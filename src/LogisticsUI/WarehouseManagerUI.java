package LogisticsUI;

import datautils.io.*;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import ClassTemplates.Shipment;
import ClassTemplates.Vehicle;
import ClassTemplates.Warehouse;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class WarehouseManagerUI extends javax.swing.JFrame {
    
    private final java.awt.Color defaultButtonColor = java.awt.Color.decode("#465CEF");
    private final java.awt.Color activeButtonColor = java.awt.Color.decode("#509BE5");
    private Warehouse currentWarehouse;

    public WarehouseManagerUI() {
        initComponents();
        assignWarehouseWithDialog();
        setIconImage(new ImageIcon("src/assets/truck.png").getImage());
        setResizable(false);
    }

    private void assignWarehouseWithDialog() {
        String[][] warehouseData = CSVParser.loadCSVData("src/CSVFiles/warehouses.csv");
        Warehouse[] availableWarehouses = Warehouse.toWarehouse(warehouseData);
    
        String[] warehouseOptions = new String[availableWarehouses.length + 1];
        warehouseOptions[0] = "Select a warehouse"; 
        for (int i = 0; i < availableWarehouses.length; i++) {
            warehouseOptions[i + 1] = String.format("ID: %d - %s Hub", 
                availableWarehouses[i].getWarehouseID(), availableWarehouses[i].getLocation());
        }

        String selectedWarehouse = null;
        while (selectedWarehouse == null || selectedWarehouse.equals("Select a warehouse")) {
            selectedWarehouse = (String) JOptionPane.showInputDialog(
                null,
                "Select a warehouse to manage:",
                "Assign Warehouse",
                JOptionPane.QUESTION_MESSAGE,
                null,
                warehouseOptions,
                warehouseOptions[0]
            );
    
            if (selectedWarehouse == null) {
                JOptionPane.showMessageDialog(null, 
                    "Error: You must select a warehouse to proceed.", 
                    "Selection Required", 
                    JOptionPane.ERROR_MESSAGE);
            } else if (selectedWarehouse.equals("Select a warehouse")) {
                JOptionPane.showMessageDialog(null, 
                    "Error: Please select a valid warehouse.", 
                    "Invalid Selection", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    
        int selectedIndex = java.util.Arrays.asList(warehouseOptions).indexOf(selectedWarehouse) - 1;
        this.currentWarehouse = availableWarehouses[selectedIndex];
        JOptionPane.showMessageDialog(null, 
            "Assigned to warehouse at " + currentWarehouse.getLocation(), 
            "Success", 
            JOptionPane.INFORMATION_MESSAGE);
    
        loadAndAssignResources();
    }
    
    private void loadAndAssignResources() {
        Vehicle[] vehicles = loadVehicles();
        Shipment[] shipments = loadShipments();

        ArrayList<Vehicle> whVehicle = new ArrayList<>();
        for (Vehicle vehicle : vehicles) { 
            if (vehicle.getWarehouseId() == currentWarehouse.getWarehouseID()) {
                whVehicle.add(vehicle);
            }
        }
        
        ArrayList<Shipment> whShipments = new ArrayList<>();
        for (Shipment shipment : shipments) { 
            if (shipment.getWarehouseId() == currentWarehouse.getWarehouseID()) {
                whShipments.add(shipment);
            }
        }

        for (int i = 0; i < whShipments.size(); i++) {
            boolean shipmentExists = false;

            for (int j = 0; j < currentWarehouse.getShipments().length; j++) {
                // Safety net: Skip if the shipment at index j is null
                if (currentWarehouse.getShipments()[j] == null) {
                    continue;  
                }
        
                if (currentWarehouse.getShipments()[j].getShipmentID() == whShipments.get(i).getShipmentID()) {
                    shipmentExists = true;
                    break;  
                }
            }
    
            if (!shipmentExists) {
                currentWarehouse.addShipment(whShipments.get(i));
            }
        }
        
        for (int i = 0; i < whVehicle.size(); i++) {
            boolean vehicleExists = false;

            for (int j = 0; j < currentWarehouse.getVehicles().length; j++) {
                // Safety net: Skip if the shipment at index j is null
                if (currentWarehouse.getVehicles()[j] == null) {
                    continue;  
                }
        
                if (currentWarehouse.getVehicles()[j].getVehicleID() == whVehicle.get(i).getVehicleID()) {
                    vehicleExists = true;
                    break;  
                }
            }
    
            if (!vehicleExists ) {
                currentWarehouse.addVehicle(whVehicle.get(i));
            }
        }
    }
    
    private void resetButtonColors() {
        DropOffBtn.setOpaque(false);
        DropOffBtn.setBackground(defaultButtonColor);
        LoadPackagesBtn.setOpaque(false);
        LoadPackagesBtn.setBackground(defaultButtonColor);
        ManageVehiclesBtn.setOpaque(false);
        ManageVehiclesBtn.setBackground(defaultButtonColor);
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
        DropOffBtn = new javax.swing.JButton();
        LoadPackagesBtn = new javax.swing.JButton();
        ManageVehiclesBtn = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        EmptyPanel = new javax.swing.JPanel();
        LoadPackagesPanel = new javax.swing.JPanel();
        NestedPanel = new javax.swing.JPanel();
        HeaderLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VehiclesForLoadingTable = new javax.swing.JTable();
        ConfirmForLoadPackagesBtn = new javax.swing.JButton();
        DestinationTxtField = new javax.swing.JTextField();
        DestinationLabel = new javax.swing.JLabel();
        VehicleTypeLabel = new javax.swing.JLabel();
        VehicleTypeComboBox = new javax.swing.JComboBox<>();
        DropOffPanel = new javax.swing.JPanel();
        NestedPanel1 = new javax.swing.JPanel();
        HeaderLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        VehiclesForDropOffTable = new javax.swing.JTable();
        ConfirmForDropOffBtn = new javax.swing.JButton();
        ManageVehiclesPanel = new javax.swing.JPanel();
        NestedPanel3 = new javax.swing.JPanel();
        HeaderLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        VehicleActionTable = new javax.swing.JTable();
        ConfirmForManageVehiclesBtn = new javax.swing.JButton();
        VehicleActionLabel = new javax.swing.JLabel();
        VehicleActionComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeliverIT | Dashboard");
        setPreferredSize(new java.awt.Dimension(800, 500));

        NullPanel.setBackground(new java.awt.Color(240, 245, 255));

        SidebarPanel.setBackground(new java.awt.Color(70, 92, 239));
        SidebarPanel.setMaximumSize(new java.awt.Dimension(200, 500));
        SidebarPanel.setMinimumSize(new java.awt.Dimension(200, 500));

        UserGreetingsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UserGreetingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserGreetingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserGreetingsLabel.setText("<html><span style='font-family:Inter; font-weight:bold;'>Hello, </span><span style='font-family:Inter; font-weight:50;'>Manager</span></html>");

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

        DropOffBtn.setBackground(new java.awt.Color(70, 92, 239));
        DropOffBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        DropOffBtn.setForeground(new java.awt.Color(255, 255, 255));
        DropOffBtn.setText("<html><body style=\"font-family: Inter; font-weight: 10; text-align: center;\">Drop-Off<br>Vehicle Load</body></html>");
        DropOffBtn.setBorderPainted(false);
        DropOffBtn.setContentAreaFilled(false);
        DropOffBtn.setFocusPainted(false);
        DropOffBtn.setFocusable(false);
        DropOffBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DropOffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropOffBtnActionPerformed(evt);
            }
        });

        LoadPackagesBtn.setBackground(new java.awt.Color(70, 92, 239));
        LoadPackagesBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LoadPackagesBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoadPackagesBtn.setText("<html><body style=\"font-family: Inter; font-weight: 10; text-align: center;\">Load Packages<br>by Destination</body></html>");
        LoadPackagesBtn.setBorderPainted(false);
        LoadPackagesBtn.setContentAreaFilled(false);
        LoadPackagesBtn.setFocusPainted(false);
        LoadPackagesBtn.setFocusable(false);
        LoadPackagesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoadPackagesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadPackagesBtnActionPerformed(evt);
            }
        });

        ManageVehiclesBtn.setBackground(new java.awt.Color(70, 92, 239));
        ManageVehiclesBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ManageVehiclesBtn.setForeground(new java.awt.Color(255, 255, 255));
        ManageVehiclesBtn.setText("<html><body style=\"font-family: Inter; font-weight: 10; text-align: center;\">Manage<br>Vehicles</body></html>");
        ManageVehiclesBtn.setBorderPainted(false);
        ManageVehiclesBtn.setContentAreaFilled(false);
        ManageVehiclesBtn.setFocusPainted(false);
        ManageVehiclesBtn.setFocusable(false);
        ManageVehiclesBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ManageVehiclesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageVehiclesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidebarPanelLayout = new javax.swing.GroupLayout(SidebarPanel);
        SidebarPanel.setLayout(SidebarPanelLayout);
        SidebarPanelLayout.setHorizontalGroup(
            SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserGreetingsLabel)
            .addComponent(LoadPackagesBtn)
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(DropOffBtn)
            .addComponent(ManageVehiclesBtn)
        );
        SidebarPanelLayout.setVerticalGroup(
            SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(UserGreetingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(LoadPackagesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DropOffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageVehiclesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainPanel.setBackground(new java.awt.Color(240, 245, 255));
        MainPanel.setLayout(new java.awt.CardLayout());

        EmptyPanel.setBackground(new java.awt.Color(240, 245, 255));
        EmptyPanel.setLayout(new java.awt.CardLayout());
        MainPanel.add(EmptyPanel, "card2");

        LoadPackagesPanel.setBackground(new java.awt.Color(240, 245, 255));
        LoadPackagesPanel.setLayout(new java.awt.CardLayout());

        NestedPanel.setBackground(new java.awt.Color(255, 255, 255));

        HeaderLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HeaderLabel.setText("<html><span style='font-family: Inter; font-weight: bold;'>Load Packages to Vehicle</span></html>");

        VehiclesForLoadingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        VehiclesForLoadingTable.setCellSelectionEnabled(true);
        VehiclesForLoadingTable.setFocusable(false);
        VehiclesForLoadingTable.setGridColor(new java.awt.Color(255, 255, 255));
        VehiclesForLoadingTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        VehiclesForLoadingTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        VehiclesForLoadingTable.setShowGrid(true);
        VehiclesForLoadingTable.getTableHeader().setResizingAllowed(false);
        VehiclesForLoadingTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(VehiclesForLoadingTable);

        ConfirmForLoadPackagesBtn.setBackground(new java.awt.Color(73, 204, 112));
        ConfirmForLoadPackagesBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConfirmForLoadPackagesBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmForLoadPackagesBtn.setText("<html>\n  <body style=\"font-family: Inter; font-weight: bold; text-align: center;\">\n    Confirm\n  </body>\n</html>\n");
        ConfirmForLoadPackagesBtn.setBorderPainted(false);
        ConfirmForLoadPackagesBtn.setFocusPainted(false);
        ConfirmForLoadPackagesBtn.setFocusable(false);
        ConfirmForLoadPackagesBtn.setRequestFocusEnabled(false);
        ConfirmForLoadPackagesBtn.setRolloverEnabled(false);
        ConfirmForLoadPackagesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmForLoadPackagesBtnActionPerformed(evt);
            }
        });

        DestinationTxtField.setCaretColor(new java.awt.Color(255, 255, 255));
        DestinationTxtField.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        DestinationTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DestinationTxtFieldKeyReleased(evt);
            }
        });

        DestinationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DestinationLabel.setText("<html><body style=\"font-family: Inter; font-weight: 10; text-align: center;\">Sort by Destination</body></html>");

        VehicleTypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VehicleTypeLabel.setText("<html><body style=\"font-family: Inter; font-weight: 10; text-align: center;\">Vehicle Type</body></html>");

        VehicleTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Van", "Truck" }));
        VehicleTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehicleTypeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NestedPanelLayout = new javax.swing.GroupLayout(NestedPanel);
        NestedPanel.setLayout(NestedPanelLayout);
        NestedPanelLayout.setHorizontalGroup(
            NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NestedPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfirmForLoadPackagesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NestedPanelLayout.createSequentialGroup()
                                .addGroup(NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DestinationTxtField)
                                    .addComponent(DestinationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(VehicleTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(VehicleTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        NestedPanelLayout.setVerticalGroup(
            NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NestedPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(HeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DestinationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VehicleTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NestedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DestinationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VehicleTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmForLoadPackagesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        LoadPackagesPanel.add(NestedPanel, "card2");

        MainPanel.add(LoadPackagesPanel, "LoadPackagesPanel");

        DropOffPanel.setBackground(new java.awt.Color(240, 245, 255));
        DropOffPanel.setLayout(new java.awt.CardLayout());

        NestedPanel1.setBackground(new java.awt.Color(255, 255, 255));

        HeaderLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HeaderLabel1.setText("<html><span style='font-family: Inter; font-weight: bold;'>Available Vehicles for Drop-Off</span></html>");

        VehiclesForDropOffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Type", "Warehouse ID", "License Plate", "Current Shipments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        VehiclesForDropOffTable.setCellSelectionEnabled(true);
        VehiclesForDropOffTable.setFocusable(false);
        VehiclesForDropOffTable.setGridColor(new java.awt.Color(255, 255, 255));
        VehiclesForDropOffTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        VehiclesForDropOffTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        VehiclesForDropOffTable.setShowGrid(false);
        VehiclesForDropOffTable.getTableHeader().setResizingAllowed(false);
        VehiclesForDropOffTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(VehiclesForDropOffTable);

        ConfirmForDropOffBtn.setBackground(new java.awt.Color(73, 204, 112));
        ConfirmForDropOffBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConfirmForDropOffBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmForDropOffBtn.setText("<html>\n  <body style=\"font-family: Inter; font-weight: bold; text-align: center;\">\n    Confirm\n  </body>\n</html>\n");
        ConfirmForDropOffBtn.setBorderPainted(false);
        ConfirmForDropOffBtn.setFocusPainted(false);
        ConfirmForDropOffBtn.setFocusable(false);
        ConfirmForDropOffBtn.setRequestFocusEnabled(false);
        ConfirmForDropOffBtn.setRolloverEnabled(false);
        ConfirmForDropOffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmForDropOffBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NestedPanel1Layout = new javax.swing.GroupLayout(NestedPanel1);
        NestedPanel1.setLayout(NestedPanel1Layout);
        NestedPanel1Layout.setHorizontalGroup(
            NestedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NestedPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(NestedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfirmForDropOffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(ConfirmForDropOffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        DropOffPanel.add(NestedPanel1, "card2");

        MainPanel.add(DropOffPanel, "DropOffPanel");

        ManageVehiclesPanel.setBackground(new java.awt.Color(240, 245, 255));
        ManageVehiclesPanel.setLayout(new java.awt.CardLayout());

        NestedPanel3.setBackground(new java.awt.Color(255, 255, 255));

        HeaderLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HeaderLabel3.setText("<html><span style='font-family: Inter; font-weight: bold;'>Load Packages to Vehicle</span></html>");

        VehicleActionTable.setModel(new javax.swing.table.DefaultTableModel(
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
        VehicleActionTable.setCellSelectionEnabled(true);
        VehicleActionTable.setFocusable(false);
        VehicleActionTable.setGridColor(new java.awt.Color(255, 255, 255));
        VehicleActionTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        VehicleActionTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        VehicleActionTable.setShowGrid(true);
        VehicleActionTable.getTableHeader().setResizingAllowed(false);
        VehicleActionTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(VehicleActionTable);

        ConfirmForManageVehiclesBtn.setBackground(new java.awt.Color(73, 204, 112));
        ConfirmForManageVehiclesBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConfirmForManageVehiclesBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmForManageVehiclesBtn.setText("<html>\n  <body style=\"font-family: Inter; font-weight: bold; text-align: center;\">\n    Confirm\n  </body>\n</html>\n");
        ConfirmForManageVehiclesBtn.setBorderPainted(false);
        ConfirmForManageVehiclesBtn.setFocusPainted(false);
        ConfirmForManageVehiclesBtn.setFocusable(false);
        ConfirmForManageVehiclesBtn.setRequestFocusEnabled(false);
        ConfirmForManageVehiclesBtn.setRolloverEnabled(false);
        ConfirmForManageVehiclesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmForManageVehiclesBtnActionPerformed(evt);
            }
        });

        VehicleActionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VehicleActionLabel.setText("<html><body style=\"font-family: Inter; font-weight: 10; text-align: center;\">Select Vehicle Action</body></html>");

        VehicleActionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehicle Arriving", "Vehicle Leaving" }));
        VehicleActionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehicleActionComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NestedPanel3Layout = new javax.swing.GroupLayout(NestedPanel3);
        NestedPanel3.setLayout(NestedPanel3Layout);
        NestedPanel3Layout.setHorizontalGroup(
            NestedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NestedPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(NestedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfirmForManageVehiclesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NestedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HeaderLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(VehicleActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(VehicleActionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        NestedPanel3Layout.setVerticalGroup(
            NestedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NestedPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(HeaderLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(VehicleActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VehicleActionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmForManageVehiclesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        ManageVehiclesPanel.add(NestedPanel3, "card2");

        MainPanel.add(ManageVehiclesPanel, "ManageVehiclesPanel");

        javax.swing.GroupLayout NullPanelLayout = new javax.swing.GroupLayout(NullPanel);
        NullPanel.setLayout(NullPanelLayout);
        NullPanelLayout.setHorizontalGroup(
            NullPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NullPanelLayout.createSequentialGroup()
                .addComponent(SidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NullPanelLayout.setVerticalGroup(
            NullPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NullPanelLayout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(SidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        System.exit(0);
    }//GEN-LAST:event_LogoutActionPerformed

    private void DropOffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropOffBtnActionPerformed
        resetButtonColors();
        DropOffBtn.setOpaque(true);
        DropOffBtn.setBackground(activeButtonColor);
        CardLayout card = (CardLayout) MainPanel.getLayout();
        card.show(MainPanel, "DropOffPanel");

        populateVehiclesForDropOffTable();
    }//GEN-LAST:event_DropOffBtnActionPerformed

    private void LoadPackagesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadPackagesBtnActionPerformed
        resetButtonColors();
        LoadPackagesBtn.setOpaque(true);
        LoadPackagesBtn.setBackground(activeButtonColor);
        CardLayout card = (CardLayout) MainPanel.getLayout();
        card.show(MainPanel, "LoadPackagesPanel");
    }//GEN-LAST:event_LoadPackagesBtnActionPerformed

    private void ConfirmForLoadPackagesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmForLoadPackagesBtnActionPerformed
    int selectedRow = VehiclesForLoadingTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a vehicle from the table.", "Selection Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int vehicleID = (int) VehiclesForLoadingTable.getValueAt(selectedRow, 0);
    Vehicle selectedVehicle = null;

    for (Vehicle vehicle : filterAvailableVehicles(currentWarehouse.getVehicles(), (String) VehicleTypeComboBox.getSelectedItem(), true)) {
        if (vehicle.getVehicleID() == vehicleID) {
            selectedVehicle = vehicle;
            break;
        }
    }

    if (selectedVehicle == null) {
        JOptionPane.showMessageDialog(this, "Error loading the selected vehicle. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String destination = DestinationTxtField.getText().trim();
    ArrayList<Shipment> loadToVehicleShipments = filterShipmentsForLoading(currentWarehouse.getShipments(), destination);

    if (loadToVehicleShipments.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No shipments available for the selected destination.", "No Shipments Found", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    loadToVehicle(loadToVehicleShipments, selectedVehicle);
    selectedVehicle.setAvailability(false);
    updateShipmentAndVehicleCSV(loadToVehicleShipments.toArray(new Shipment[0]), selectedVehicle);

    JOptionPane.showMessageDialog(this, "Shipments successfully loaded to vehicle ID: " + selectedVehicle.getVehicleID(), "Success", JOptionPane.INFORMATION_MESSAGE);

    populateVehiclesForLoadingTable();
    }//GEN-LAST:event_ConfirmForLoadPackagesBtnActionPerformed

    private void ConfirmForDropOffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmForDropOffBtnActionPerformed
        int selectedRow = VehiclesForDropOffTable.getSelectedRow();
        Shipment shipments[] = loadShipments();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a vehicle for drop-off.", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int vehicleID = (int) VehiclesForDropOffTable.getValueAt(selectedRow, 0);
        Vehicle selectedVehicle = null;

        for (Vehicle vehicle : currentWarehouse.getVehicles()) {
            if (vehicle != null && vehicle.getVehicleID() == vehicleID) {
                selectedVehicle = vehicle;
                break;
            }
        }

        if (selectedVehicle == null) {
            JOptionPane.showMessageDialog(this, "Error retrieving the selected vehicle. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        assignShipmentsToVehicle(shipments, selectedVehicle);

        Shipment[] droppedOffShipments = dropOffShipments(selectedVehicle);
        updateShipmentAndVehicleCSV(droppedOffShipments, selectedVehicle);
        JOptionPane.showMessageDialog(this, "Drop-off completed for Vehicle ID: " + selectedVehicle.getVehicleID(),
                "Success", JOptionPane.INFORMATION_MESSAGE);
        
        populateVehiclesForDropOffTable();
    }//GEN-LAST:event_ConfirmForDropOffBtnActionPerformed

    private void ManageVehiclesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageVehiclesBtnActionPerformed
        resetButtonColors();
        ManageVehiclesBtn.setOpaque(true);
        ManageVehiclesBtn.setBackground(activeButtonColor);
        CardLayout card = (CardLayout) MainPanel.getLayout();
        card.show(MainPanel, "ManageVehiclesPanel");
    }//GEN-LAST:event_ManageVehiclesBtnActionPerformed

    private void ConfirmForManageVehiclesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmForManageVehiclesBtnActionPerformed
        int selectedRow = VehicleActionTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "No vehicle selected. Please select a vehicle from the table.");
            return;
        }
    
        DefaultTableModel model = (DefaultTableModel) VehicleActionTable.getModel();
        String selectedAction = (String) VehicleActionComboBox.getSelectedItem();
        if (selectedAction == null) {
            JOptionPane.showMessageDialog(this, "No action selected. Please choose an action from the dropdown.");
            return;
        }
    
        int vehicleId = (int) model.getValueAt(selectedRow, 0);
        String licensePlate = (String) model.getValueAt(selectedRow, 3);
        int currentWarehouseId = (int) model.getValueAt(selectedRow, 2);
    
        switch (selectedAction) {
            case "Vehicle Arriving":
                handleArrivalConfirmation(vehicleId, licensePlate, currentWarehouseId);
                break;
            case "Vehicle Leaving":
                handleLeavingConfirmation(vehicleId, licensePlate, currentWarehouseId);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid action selected.");
        }

        refreshVehicleActionTable(selectedAction);
    }//GEN-LAST:event_ConfirmForManageVehiclesBtnActionPerformed

    private void DestinationTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DestinationTxtFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            populateVehiclesForLoadingTable();
            validateInputs();
        }
    }//GEN-LAST:event_DestinationTxtFieldKeyReleased

    private void VehicleTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehicleTypeComboBoxActionPerformed
        populateVehiclesForLoadingTable();
        validateInputs();
    }//GEN-LAST:event_VehicleTypeComboBoxActionPerformed

    private void VehicleActionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehicleActionComboBoxActionPerformed
        String selectedAction = (String) VehicleActionComboBox.getSelectedItem();
    
        if (selectedAction == null) {
            return;
        }
        
        switch (selectedAction) {
            case "Vehicle Arriving":
                handleVehicleArrival();
                break;
            case "Vehicle Leaving":
                handleVehicleLeaving();
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid action selected.");
        }
    }//GEN-LAST:event_VehicleActionComboBoxActionPerformed

    private void refreshVehicleActionTable(String selectedAction) {
        ArrayList<Vehicle> vehiclesToShow = new ArrayList<>();
        Vehicle[] allVehicles = loadVehicles();
    
        if ("Vehicle Arriving".equals(selectedAction)) {
            for (Vehicle vehicle : allVehicles) {
                if (!vehicle.isAvailable() && vehicle.getWarehouseId() == 0) {
                    vehiclesToShow.add(vehicle);
                }
            }
        } else if ("Vehicle Leaving".equals(selectedAction)) {
            for (Vehicle vehicle : allVehicles) {
                if (vehicle.getWarehouseId() == currentWarehouse.getWarehouseID()) {
                    vehiclesToShow.add(vehicle);
                }
            }
        }
    
        populateVehicleActionTable(vehiclesToShow);
    }

    private void handleArrivalConfirmation(int vehicleId, String licensePlate, int currentWarehouseId) {
        if (currentWarehouseId != 0) {
            JOptionPane.showMessageDialog(this, "Vehicle is already in a warehouse. Cannot mark as arriving.");
            return;
        }
    
        for (Vehicle vehicle : loadVehicles()) {
            if (vehicle.getVehicleID() == vehicleId) {
                vehicle.setWarehouseId(currentWarehouse.getWarehouseID());
                vehicle.setAvailability(true); 
                CSVParser.updateCSV("src/CSVFiles/vehicles.csv", vehicleId, String.valueOf(currentWarehouse.getWarehouseID()), 1, vehicle.getVehicleHeader());
                JOptionPane.showMessageDialog(this, "Vehicle " + licensePlate + " has been marked as arrived.");
                break;
            }
        }
    }
    
    private void handleLeavingConfirmation(int vehicleId, String licensePlate, int currentWarehouseId) {
        if (currentWarehouseId != currentWarehouse.getWarehouseID()) {
            JOptionPane.showMessageDialog(this, "Vehicle is not in the current warehouse. Cannot mark as leaving.");
            return;
        }
    
        for (Vehicle vehicle : loadVehicles()) {
            if (vehicle.getVehicleID() == vehicleId) {
                vehicle.setWarehouseId(0); 
                vehicle.setAvailability(false); 
                CSVParser.updateCSV("src/CSVFiles/vehicles.csv", vehicleId, String.valueOf(0), 1, vehicle.getVehicleHeader());
                CSVParser.updateCSV("src/CSVFiles/vehicles.csv", vehicleId, String.valueOf(false), 9, vehicle.getVehicleHeader());
                JOptionPane.showMessageDialog(this, "Vehicle " + licensePlate + " has been marked as leaving.");
                break;
            }
        }
    }
    
    private void handleVehicleArrival() {
        ArrayList<Vehicle> arrivingVehicles = new ArrayList<>();
        Vehicle[] vehicles = loadVehicles();
    
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isAvailable() && vehicle.getWarehouseId() == 0) {
                arrivingVehicles.add(vehicle);
            }
        }
    
        if (arrivingVehicles.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No vehicles arriving.");
        } else {
            populateVehicleActionTable(arrivingVehicles);
            JOptionPane.showMessageDialog(this, "Select a vehicle from the table for arrival.");
        }
    }

    private void handleVehicleLeaving() {
        ArrayList<Vehicle> leavingVehicles = new ArrayList<>();
        Vehicle[] vehicles = loadVehicles();
    
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getWarehouseId() == currentWarehouse.getWarehouseID()) {
                leavingVehicles.add(vehicle);
            }
        }
    
        if (leavingVehicles.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No vehicles ready to leave.");
        } else {
            populateVehicleActionTable(leavingVehicles);
            JOptionPane.showMessageDialog(this, "Select a vehicle from the table for departure.");
        }
    }

    private void populateVehicleActionTable(ArrayList<Vehicle> vehicles) {
        DefaultTableModel model = (DefaultTableModel) VehicleActionTable.getModel();
        model.setRowCount(0); // Clear existing rows
    
        if (model.getColumnCount() == 0) {
            model.addColumn("Vehicle ID");
            model.addColumn("Type");
            model.addColumn("Warehouse ID");
            model.addColumn("License Plate");
            model.addColumn("Current Shipments");
        }
    
        for (Vehicle vehicle : vehicles) {
            model.addRow(new Object[]{
                vehicle.getVehicleID(),
                vehicle.getType(),
                vehicle.getWarehouseId(),
                vehicle.getLicensePlate(),
                vehicle.getCurrentShipmentCount()
            });
        }
    }
    
    private void populateVehiclesForDropOffTable() {
        loadAndAssignResources();
        DefaultTableModel model = (DefaultTableModel) VehiclesForDropOffTable.getModel();
        model.setRowCount(0); // Clear the table
    
        ArrayList<Vehicle> availableVehicles = filterAvailableVehicles(currentWarehouse.getVehicles(), "truck", false);
    
        for (Vehicle vehicle : availableVehicles) {
            model.addRow(new Object[]{
                vehicle.getVehicleID(),
                vehicle.getType(),
                vehicle.getWarehouseId(),
                vehicle.getLicensePlate(),
                vehicle.getCurrentShipmentCount()
            });
        }
    }

    private void populateVehiclesForLoadingTable() {
        loadAndAssignResources();
        DefaultTableModel model = (DefaultTableModel) VehiclesForLoadingTable.getModel();
        model.setRowCount(0); // Clear the table
    
        String vehicleType = (String) VehicleTypeComboBox.getSelectedItem();
        ArrayList<Vehicle> availableVehicles = filterAvailableVehicles(currentWarehouse.getVehicles(), vehicleType, true);
    
        for (Vehicle vehicle : availableVehicles) {
            model.addRow(new Object[]{
                vehicle.getVehicleID(),
                vehicle.getType(),
                vehicle.getWarehouseId(),
                vehicle.getLicensePlate(),
                vehicle.getCurrentShipmentCount()
            });
        }
    }
    
    private void validateInputs() {
        ConfirmForLoadPackagesBtn.setEnabled(true);
    }
    
    private Shipment[] loadShipments() {
        String[][] packageData = CSVParser.loadCSVData("src/CSVFiles/packages.csv");
        ClassTemplates.Package[] packages = new ClassTemplates.Package[packageData.length];
        for (int i = 0; i < packageData.length; i++) {
            packages[i] = ClassTemplates.Package.toPackage(packageData, i, null); // Pass null for the items
        }

        String[][] shipmentData = CSVParser.loadCSVData("src/CSVFiles/shipments.csv");
        Shipment[] shipments = new Shipment[shipmentData.length];
            
        for (int i = 0; i < shipmentData.length; i++) {
            int pkgId = Integer.parseInt(shipmentData[i][1]);  // Get the pkgID from shipment data
            
            // Find the corresponding package by ID
            ClassTemplates.Package correspondingPackage = null;
            for (ClassTemplates.Package pkg : packages) {
                if (pkg.getId() == pkgId) {
                    correspondingPackage = pkg;
                    break;  
                }
            }
                
            // Pass the corresponding package to the Shipment constructor
            shipments[i] = Shipment.toShipment(shipmentData, i, correspondingPackage);
        }
        
        return shipments;
    }

    private Vehicle[] loadVehicles() {
        String[][] vehicleData = CSVParser.loadCSVData("src/CSVFiles/vehicles.csv");
        return Vehicle.toVehicle(vehicleData);
    }

    private ArrayList<Shipment> filterShipmentsForLoading(Shipment[] shipments, String destination) {
        ArrayList<Shipment> filteredShipments = new ArrayList<>();
        for (Shipment shipment : shipments) {
            if (shipment != null && shipment.getWarehouseId() == currentWarehouse.getWarehouseID()
                    && shipment.getStatus().equalsIgnoreCase("Pending")
                    && shipment.getDestination().toLowerCase().contains(destination.toLowerCase())) {
                filteredShipments.add(shipment);
            }
        }
        return filteredShipments;
    }

    private ArrayList<Vehicle> filterAvailableVehicles(Vehicle[] vehicles, String vehicleType, boolean flag) {
        ArrayList<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null && (vehicle.getWarehouseId() == currentWarehouse.getWarehouseID()) && (vehicle.isAvailable() == flag)
                    && vehicle.getType().equalsIgnoreCase(vehicleType)) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    private void loadToVehicle(ArrayList<Shipment> shipments, Vehicle vehicle) {
        for (Shipment s : shipments) {
            if (vehicle.addShipment(s)) {
                s.setWarehouseId(0); // Indicating its not on the warehouse anymore
                currentWarehouse.removeShipment(s);
                s.setVehicleId(vehicle.getVehicleID());
            } else {
                System.out.println("Cannot add Shipment ID: " + s.getShipmentID() + " to vehicle due to exceeding capacity and/or weight limit.");
            }
        }
    }

    private Shipment[] dropOffShipments(Vehicle vehicle) {
        Shipment[] droppedOffShipments = new Shipment[vehicle.getShipments().length];
        int index = 0;
        for (Shipment shipment : vehicle.getShipments()) {
            shipment.setVehicleId(0); 
            shipment.setWarehouseId(currentWarehouse.getWarehouseID()); 
            vehicle.removeShipment(shipment);
            currentWarehouse.addShipment(shipment);
            droppedOffShipments[index] = shipment;
            index++;
        }
        vehicle.setAvailability(true); 
        return droppedOffShipments;
    }

    private void assignShipmentsToVehicle(Shipment[] shipments, Vehicle vehicle) {
        ArrayList<Shipment> vehicleShipments = new ArrayList<>();
        for (Shipment shipment : shipments) {
            if (shipment.getVehicleId() == vehicle.getVehicleID())
            vehicleShipments.add(shipment);
        }
        vehicle.setShipments(vehicleShipments.toArray(new Shipment[0]));
    }

    private void updateShipmentAndVehicleCSV(Shipment[] shipments, Vehicle vehicle) {
        for (Shipment s : shipments) {
            CSVParser.updateCSV("src/CSVFiles/shipments.csv", s.getShipmentID(), String.valueOf(s.getVehicleId()), 2, s.getShipmentHeader()); 
            CSVParser.updateCSV("src/CSVFiles/shipments.csv", s.getShipmentID(), String.valueOf(s.getWarehouseId()), 3, s.getShipmentHeader()); 
        }

        CSVParser.updateCSV("src/CSVFiles/vehicles.csv",vehicle.getVehicleID(), String.format("%d", (int)vehicle.getCurrentCapacityKG()), 6, vehicle.getVehicleHeader()); 
        CSVParser.updateCSV("src/CSVFiles/vehicles.csv", vehicle.getVehicleID(), String.valueOf(vehicle.getCurrentShipmentCount()), 8, vehicle.getVehicleHeader()); 
        CSVParser.updateCSV("src/CSVFiles/vehicles.csv", vehicle.getVehicleID(), String.valueOf(vehicle.isAvailable()), 9,vehicle.getVehicleHeader());
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
            java.util.logging.Logger.getLogger(WarehouseManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarehouseManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarehouseManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarehouseManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarehouseManagerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmForDropOffBtn;
    private javax.swing.JButton ConfirmForLoadPackagesBtn;
    private javax.swing.JButton ConfirmForManageVehiclesBtn;
    private javax.swing.JLabel DestinationLabel;
    private javax.swing.JTextField DestinationTxtField;
    private javax.swing.JButton DropOffBtn;
    private javax.swing.JPanel DropOffPanel;
    private javax.swing.JPanel EmptyPanel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel HeaderLabel1;
    private javax.swing.JLabel HeaderLabel3;
    private javax.swing.JButton LoadPackagesBtn;
    private javax.swing.JPanel LoadPackagesPanel;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton ManageVehiclesBtn;
    private javax.swing.JPanel ManageVehiclesPanel;
    private javax.swing.JPanel NestedPanel;
    private javax.swing.JPanel NestedPanel1;
    private javax.swing.JPanel NestedPanel3;
    private javax.swing.JPanel NullPanel;
    private javax.swing.JPanel SidebarPanel;
    private javax.swing.JLabel UserGreetingsLabel;
    private javax.swing.JComboBox<String> VehicleActionComboBox;
    private javax.swing.JLabel VehicleActionLabel;
    private javax.swing.JTable VehicleActionTable;
    private javax.swing.JComboBox<String> VehicleTypeComboBox;
    private javax.swing.JLabel VehicleTypeLabel;
    private javax.swing.JTable VehiclesForDropOffTable;
    private javax.swing.JTable VehiclesForLoadingTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
