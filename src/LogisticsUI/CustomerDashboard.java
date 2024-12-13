package LogisticsUI;

import ClassTemplates.*;
import ClassTemplates.Package;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import datautils.io.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JPanel;

public class CustomerDashboard extends javax.swing.JFrame {
    private static DefaultTableModel itemTblModel = new DefaultTableModel(new String[] {"Name", "Weight(grams)", "Height(cm)", "Width(cm)", "Length(cm)"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) { return false; }
    };
    private Customer customerLoggedIn;
    private Shipment[] customerShipments;
    
    public CustomerDashboard(Customer customerLoggedIn) {
        this.customerLoggedIn = customerLoggedIn;
        this.customerShipments = CSVParser.searchShipments(customerLoggedIn.getCustomerID());
        initComponents();
        // Pre-set the table models for item table
        itemTbl.setModel(itemTblModel);
        setTableModel(new String[]{"Shipment ID", "Destination", "Status", "Ship Take-Off", "ETA Delivery"}, shipmentHistTbl);
        populateShipmentTbl();
        setIconImage(new ImageIcon("src/assets/truck.png").getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    private void populateShipmentTbl() {
        DefaultTableModel currTblModel = (DefaultTableModel) shipmentHistTbl.getModel();
        // No shipments found for the customer
        if(this.customerShipments.length == 0) {
            new DialogBoxUI(this, "You don't have any shipments. Send a package first.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        currTblModel.setRowCount(0);
        // Populate Shipment Table
        for(Shipment shipment : customerShipments) {
            currTblModel.addRow(
                new Object[] {
                    shipment.getShipmentID(),
                    shipment.getDestination(),
                    shipment.getStatus(),
                    DataIOParser.dateToString(shipment.getShipTakeOff()),
                    DataIOParser.dateToString(shipment.getEtaDelivery())
                }
            );
        }
    }
    
    private void setTableModel(String[] columnHeaders, JTable tbl) {
        DefaultTableModel model = new DefaultTableModel(columnHeaders, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        tbl.setModel(model);     
    }
    
    public static void addItemToTbl(Object[] item) {
        itemTblModel.addRow(item);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        layoutPanel = new javax.swing.JPanel();
        sideBarLayout = new javax.swing.JPanel();
        helloHeader = new javax.swing.JLabel();
        customerLoggedInName = new javax.swing.JLabel();
        sendPkgBtn = new javax.swing.JButton();
        acctBtn = new javax.swing.JButton();
        shipmentBtn = new javax.swing.JButton();
        signOutBtn1 = new javax.swing.JButton();
        parentCardPanel = new javax.swing.JPanel();
        shipmentsPanel = new javax.swing.JPanel();
        shipHdr = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shipmentHistTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        sendPackagePanel = new javax.swing.JPanel();
        pkgHdr = new javax.swing.JLabel();
        itemTblScroll = new javax.swing.JScrollPane();
        itemTbl = new javax.swing.JTable();
        rAddrFld = new javax.swing.JTextField();
        rAddHdr = new javax.swing.JLabel();
        processPkgBtn = new javax.swing.JButton();
        addItemBtn = new javax.swing.JButton();
        accountsPanel = new javax.swing.JPanel();
        editPanelForm = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        nameFld = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        phoneFld = new javax.swing.JTextField();
        addrLbl = new javax.swing.JLabel();
        addrFld = new javax.swing.JTextField();
        nameEditBtn = new javax.swing.JToggleButton();
        phoneEditBtn = new javax.swing.JToggleButton();
        addrEditBtn = new javax.swing.JToggleButton();
        infoHdr = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DeliverIT | Customer Dashboard");
        setResizable(false);

        layoutPanel.setForeground(new java.awt.Color(70, 92, 239));
        layoutPanel.setLayout(null);

        sideBarLayout.setBackground(new java.awt.Color(70, 92, 239));
        sideBarLayout.setMinimumSize(new java.awt.Dimension(200, 500));
        sideBarLayout.setPreferredSize(new java.awt.Dimension(200, 500));

        helloHeader.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        helloHeader.setForeground(new java.awt.Color(255, 255, 255));
        helloHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helloHeader.setText("Hello");

        customerLoggedInName.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        customerLoggedInName.setForeground(new java.awt.Color(255, 255, 255));
        customerLoggedInName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerLoggedInName.setText("Customer!");

        sendPkgBtn.setBackground(new java.awt.Color(70, 92, 239));
        sendPkgBtn.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        sendPkgBtn.setForeground(new java.awt.Color(255, 255, 255));
        sendPkgBtn.setText("Send Package");
        sendPkgBtn.setBorder(null);
        sendPkgBtn.setFocusPainted(false);
        sendPkgBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sendPkgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPkgBtnActionPerformed(evt);
            }
        });

        acctBtn.setBackground(new java.awt.Color(70, 92, 239));
        acctBtn.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        acctBtn.setForeground(new java.awt.Color(255, 255, 255));
        acctBtn.setText("My Account");
        acctBtn.setBorder(null);
        acctBtn.setFocusPainted(false);
        acctBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        acctBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctBtnActionPerformed(evt);
            }
        });

        shipmentBtn.setBackground(new java.awt.Color(70, 92, 239));
        shipmentBtn.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        shipmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        shipmentBtn.setText("My Shipments");
        shipmentBtn.setBorder(null);
        shipmentBtn.setFocusPainted(false);
        shipmentBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        shipmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipmentBtnActionPerformed(evt);
            }
        });

        signOutBtn1.setBackground(new java.awt.Color(0, 0, 204));
        signOutBtn1.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        signOutBtn1.setForeground(new java.awt.Color(255, 255, 255));
        signOutBtn1.setText("Sign Out");
        signOutBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 0, 255), new java.awt.Color(102, 51, 255)));
        signOutBtn1.setFocusPainted(false);
        signOutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideBarLayoutLayout = new javax.swing.GroupLayout(sideBarLayout);
        sideBarLayout.setLayout(sideBarLayoutLayout);
        sideBarLayoutLayout.setHorizontalGroup(
            sideBarLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerLoggedInName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(acctBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(shipmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sendPkgBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(helloHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideBarLayoutLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(signOutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        sideBarLayoutLayout.setVerticalGroup(
            sideBarLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayoutLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(helloHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerLoggedInName)
                .addGap(50, 50, 50)
                .addComponent(sendPkgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acctBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shipmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(signOutBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        layoutPanel.add(sideBarLayout);
        sideBarLayout.setBounds(0, 0, 200, 500);

        parentCardPanel.setBackground(new java.awt.Color(255, 255, 255));
        parentCardPanel.setLayout(new java.awt.CardLayout());

        shipmentsPanel.setBackground(new java.awt.Color(240, 245, 255));

        shipHdr.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        shipHdr.setText("Shipment History");

        shipmentHistTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shipment ID", "Destination", "Status", "Take-Off Date", "ETA"
            }
        ));
        shipmentHistTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shipmentHistTbl.setGridColor(new java.awt.Color(255, 255, 255));
        shipmentHistTbl.setRequestFocusEnabled(false);
        shipmentHistTbl.setRowHeight(25);
        shipmentHistTbl.setRowSelectionAllowed(false);
        shipmentHistTbl.getTableHeader().setResizingAllowed(false);
        shipmentHistTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(shipmentHistTbl);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("*Take-Off and ETA Dates with 01-01-1970 are currently being processed.");

        javax.swing.GroupLayout shipmentsPanelLayout = new javax.swing.GroupLayout(shipmentsPanel);
        shipmentsPanel.setLayout(shipmentsPanelLayout);
        shipmentsPanelLayout.setHorizontalGroup(
            shipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipmentsPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(shipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shipHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        shipmentsPanelLayout.setVerticalGroup(
            shipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipmentsPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(shipHdr)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
        );

        parentCardPanel.add(shipmentsPanel, "card4");

        sendPackagePanel.setBackground(new java.awt.Color(240, 245, 255));

        pkgHdr.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        pkgHdr.setText("New Package");

        itemTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Weight (cm)", "Height (cm)", "Width (cm)", "Length (cm)"
            }
        ));
        itemTbl.setFocusable(false);
        itemTbl.setRowHeight(25);
        itemTbl.getTableHeader().setResizingAllowed(false);
        itemTbl.getTableHeader().setReorderingAllowed(false);
        itemTblScroll.setViewportView(itemTbl);

        rAddHdr.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        rAddHdr.setText("Receiver Address");

        processPkgBtn.setBackground(new java.awt.Color(70, 92, 239));
        processPkgBtn.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        processPkgBtn.setForeground(new java.awt.Color(255, 255, 255));
        processPkgBtn.setText("Send");
        processPkgBtn.setBorderPainted(false);
        processPkgBtn.setFocusPainted(false);
        processPkgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processPkgBtnActionPerformed(evt);
            }
        });

        addItemBtn.setBackground(new java.awt.Color(73, 204, 112));
        addItemBtn.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        addItemBtn.setForeground(new java.awt.Color(255, 255, 255));
        addItemBtn.setText("Add Item");
        addItemBtn.setBorderPainted(false);
        addItemBtn.setFocusPainted(false);
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sendPackagePanelLayout = new javax.swing.GroupLayout(sendPackagePanel);
        sendPackagePanel.setLayout(sendPackagePanelLayout);
        sendPackagePanelLayout.setHorizontalGroup(
            sendPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendPackagePanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(sendPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sendPackagePanelLayout.createSequentialGroup()
                        .addGroup(sendPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rAddHdr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(rAddrFld, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(processPkgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sendPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sendPackagePanelLayout.createSequentialGroup()
                            .addComponent(pkgHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(itemTblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        sendPackagePanelLayout.setVerticalGroup(
            sendPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendPackagePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(sendPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pkgHdr)
                    .addComponent(addItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(itemTblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rAddHdr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sendPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(processPkgBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(rAddrFld))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        parentCardPanel.add(sendPackagePanel, "card2");

        accountsPanel.setBackground(new java.awt.Color(240, 245, 255));

        editPanelForm.setBackground(new java.awt.Color(255, 255, 255));

        nameLbl.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        nameLbl.setText("Name");

        nameFld.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        nameFld.setEnabled(false);

        phoneLbl.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        phoneLbl.setText("Phone Number");

        phoneFld.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        phoneFld.setEnabled(false);

        addrLbl.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        addrLbl.setText("Address");

        addrFld.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        addrFld.setEnabled(false);

        nameEditBtn.setBackground(new java.awt.Color(73, 204, 112));
        nameEditBtn.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        nameEditBtn.setForeground(new java.awt.Color(255, 255, 255));
        nameEditBtn.setText("Edit");
        nameEditBtn.setBorderPainted(false);
        nameEditBtn.setFocusPainted(false);
        nameEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameEditBtnActionPerformed(evt);
            }
        });

        phoneEditBtn.setBackground(new java.awt.Color(73, 204, 112));
        phoneEditBtn.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        phoneEditBtn.setForeground(new java.awt.Color(255, 255, 255));
        phoneEditBtn.setText("Edit");
        phoneEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneEditBtnActionPerformed(evt);
            }
        });

        addrEditBtn.setBackground(new java.awt.Color(73, 204, 112));
        addrEditBtn.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        addrEditBtn.setForeground(new java.awt.Color(255, 255, 255));
        addrEditBtn.setText("Edit");
        addrEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrEditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editPanelFormLayout = new javax.swing.GroupLayout(editPanelForm);
        editPanelForm.setLayout(editPanelFormLayout);
        editPanelFormLayout.setHorizontalGroup(
            editPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelFormLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(editPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameFld)
                    .addComponent(phoneFld, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(addrFld, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addrLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(editPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(phoneEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addrEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPanelFormLayout.setVerticalGroup(
            editPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelFormLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(phoneLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneFld, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(addrLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addrEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addrFld, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        infoHdr.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        infoHdr.setText("My Information");

        saveBtn.setBackground(new java.awt.Color(70, 92, 239));
        saveBtn.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.setBorderPainted(false);
        saveBtn.setFocusPainted(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountsPanelLayout = new javax.swing.GroupLayout(accountsPanel);
        accountsPanel.setLayout(accountsPanelLayout);
        accountsPanelLayout.setHorizontalGroup(
            accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountsPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(editPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoHdr, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        accountsPanelLayout.setVerticalGroup(
            accountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountsPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(infoHdr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        parentCardPanel.add(accountsPanel, "card3");

        layoutPanel.add(parentCardPanel);
        parentCardPanel.setBounds(200, 0, 610, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendPkgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPkgBtnActionPerformed
        changePanel(sendPackagePanel);
    }//GEN-LAST:event_sendPkgBtnActionPerformed

    private void acctBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctBtnActionPerformed
        changePanel(accountsPanel);
        nameFld.setText(customerLoggedIn.getName());
        phoneFld.setText(customerLoggedIn.getContactInfo());
        addrFld.setText(customerLoggedIn.getAddress());
    }//GEN-LAST:event_acctBtnActionPerformed

    private void shipmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipmentBtnActionPerformed
        changePanel(shipmentsPanel);
        // Refresh the table to cater changes
        this.customerShipments = CSVParser.searchShipments(customerLoggedIn.getCustomerID());
        populateShipmentTbl();
    }//GEN-LAST:event_shipmentBtnActionPerformed

    private void changePanel(JPanel panel) {
        parentCardPanel.removeAll();
        parentCardPanel.add(panel);
        parentCardPanel.repaint();
        parentCardPanel.revalidate();
    }
    
    private void signOutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtn1ActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirm Sign-out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(option == JOptionPane.YES_OPTION) {
            new DialogBoxUI(this, "Thanks for using the system!", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_signOutBtn1ActionPerformed
    
    private void resetFields() {
        JTextField[] fields = {nameFld, phoneFld, addrFld};
        for(JTextField f : fields) {
            f.setText("");
        }
    }
    
    private void nameEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameEditBtnActionPerformed
        nameFld.setEnabled(nameEditBtn.isSelected() ? true : false);
    }//GEN-LAST:event_nameEditBtnActionPerformed

    private void phoneEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneEditBtnActionPerformed
        phoneFld.setEnabled(phoneEditBtn.isSelected() ? true : false);
    }//GEN-LAST:event_phoneEditBtnActionPerformed

    private void addrEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrEditBtnActionPerformed
        addrFld.setEnabled(addrEditBtn.isSelected() ? true : false);
    }//GEN-LAST:event_addrEditBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // Extract and validate text field inputs
        String name = nameFld.getText(), phone = phoneFld.getText(), addr = addrFld.getText();
        // Case 1 - empty fields
        if(DataIOParser.areEmptyFields(new String[] {name, phone, addr})) {
            new DialogBoxUI(this, "Field/s are empty. Please double check your entries.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Case 2 - duplicate names: name field is different than the customer name field
        if(!customerLoggedIn.getName().equals(name) && CSVParser.searchCustomer(name)) {
            new DialogBoxUI(this, "ATTEMPT ERROR 1: Customer name entered is already registered at our system.", JOptionPane.ERROR_MESSAGE);
            resetFields();
            return;
        }
        // Case 3 - duplicate phone numbers: phone field is different than the customer phone field
        if(!customerLoggedIn.getContactInfo().equals(phone) && CSVParser.searchCustomerContact(phone)) {
            new DialogBoxUI(this, "ATTEMPT ERROR 2: The phone number entered is already registered at our system.", JOptionPane.ERROR_MESSAGE);
            resetFields();
            return;
        }
        // Proceed with updating the customer object info
        customerLoggedIn.setName(name);
        customerLoggedIn.setContactInfo(phone);
        customerLoggedIn.setAddress(addr);
        // Save updated info in the Customer CSV
        CSVParser.updateCSV("src/CSVFiles/customers.csv", customerLoggedIn.getCustomerID(), customerLoggedIn, customerLoggedIn.getCustomerHeader());
        new DialogBoxUI(this, "Customer info saved successfully", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        new ItemForm();
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void processPkgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processPkgBtnActionPerformed
        String receiverAddr = rAddrFld.getText();
        // Case 1 - receiver address is empty
        if(DataIOParser.checkInput(receiverAddr)) {
            new DialogBoxUI(this, "Receiver Address is empty.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Case 2 - no item found in the table
        if(itemTbl.getRowCount() == 0) {
            new DialogBoxUI(this, "No items found in the package. Add items first.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Get table data
        String[][] itemDataRaw = extractItemTable();
        System.out.println(itemDataRaw[0].length); // DB
        Item[] items = Item.toItem(itemDataRaw);
        System.out.println(items.length); // DB
        Package pkg = new Package(CSVParser.getLatestID("src/CSVFiles/packages.csv") + 1, items, receiverAddr);
        Shipment shipment = new Shipment(CSVParser.getLatestID("src/CSVFiles/shipments.csv") + 1, receiverAddr, pkg);
        shipment.calcShipCost();
        // Show checkout form
        new ShipmentForm(customerLoggedIn, shipment);
        // TODO: Reset fields after transaction
        rAddrFld.setText("");
        DefaultTableModel model = (DefaultTableModel) itemTbl.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_processPkgBtnActionPerformed

    private String[][] extractItemTable() {
        DefaultTableModel model = (DefaultTableModel) itemTbl.getModel();
        int rows = model.getRowCount(), cols = model.getColumnCount();
        String[][] data = new String[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                data[i][j] = model.getValueAt(i, j).toString();
            }
        }
        return data;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountsPanel;
    private javax.swing.JButton acctBtn;
    private javax.swing.JButton addItemBtn;
    private javax.swing.JToggleButton addrEditBtn;
    private javax.swing.JTextField addrFld;
    private javax.swing.JLabel addrLbl;
    private javax.swing.JLabel customerLoggedInName;
    private javax.swing.JPanel editPanelForm;
    private javax.swing.JLabel helloHeader;
    private javax.swing.JLabel infoHdr;
    private static javax.swing.JTable itemTbl;
    private javax.swing.JScrollPane itemTblScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel layoutPanel;
    private javax.swing.JToggleButton nameEditBtn;
    private javax.swing.JTextField nameFld;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JPanel parentCardPanel;
    private javax.swing.JToggleButton phoneEditBtn;
    private javax.swing.JTextField phoneFld;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel pkgHdr;
    private javax.swing.JButton processPkgBtn;
    private javax.swing.JLabel rAddHdr;
    private javax.swing.JTextField rAddrFld;
    private javax.swing.JButton saveBtn;
    private javax.swing.JPanel sendPackagePanel;
    private javax.swing.JButton sendPkgBtn;
    private javax.swing.JLabel shipHdr;
    private javax.swing.JButton shipmentBtn;
    private javax.swing.JTable shipmentHistTbl;
    private javax.swing.JPanel shipmentsPanel;
    private javax.swing.JPanel sideBarLayout;
    private javax.swing.JButton signOutBtn1;
    // End of variables declaration//GEN-END:variables
}
