package LogisticsUI;

import javax.swing.ImageIcon;
import datautils.io.DataIOParser;
import datautils.io.CSVParser;
import javax.swing.JOptionPane;
import ClassTemplates.*;

public class Logistics extends javax.swing.JFrame {
    private String selectedUserRole;
    public Logistics() {
        initComponents();
        // Set default value to the first entry in the combobox
        selectedUserRole = interactionRole.getSelectedItem().toString(); 
        setIconImage(new ImageIcon("src/assets/truck.png").getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
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
        username = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        interactionRole = new javax.swing.JComboBox<>();
        loginBtn = new javax.swing.JButton();

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

        prompt.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        prompt.setText("Please enter your details below.");

        username.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        username.setText("Username");

        userfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        userfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfieldActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        password.setText("Password");

        role.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        role.setText("Role");

        passfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        passfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfieldActionPerformed(evt);
            }
        });

        interactionRole.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        interactionRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin", "Frontline", "Warehouse", "Driver" }));
        interactionRole.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        interactionRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interactionRoleActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(70, 92, 239));
        loginBtn.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginFormPanelLayout = new javax.swing.GroupLayout(loginFormPanel);
        loginFormPanel.setLayout(loginFormPanelLayout);
        loginFormPanelLayout.setHorizontalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addComponent(loginHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanelLayout.createSequentialGroup()
                        .addComponent(prompt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username)
                    .addComponent(userfield, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(password)
                    .addComponent(role)
                    .addComponent(passfield)
                    .addComponent(interactionRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginFormPanelLayout.setVerticalGroup(
            loginFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(loginHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prompt)
                .addGap(18, 18, 18)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(role)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(interactionRole, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        getContentPane().add(loginFormPanel);
        loginFormPanel.setBounds(400, 0, 400, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfieldActionPerformed

    }//GEN-LAST:event_userfieldActionPerformed

    private void passfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfieldActionPerformed

    }//GEN-LAST:event_passfieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // System.out.println(selectedUserRole);
        String username = userfield.getText(), password = new String(passfield.getPassword());
        if(DataIOParser.checkInput(username) || DataIOParser.checkInput(password)) { 
            new DialogBoxUI(this, "Invalid. Missing input in required field/s.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean success = validateLogin(username, password, selectedUserRole);
        if(selectedUserRole.equalsIgnoreCase("customer") && !success) {
            int registerOption = JOptionPane.showConfirmDialog(this, "User not found. Register as a new customer?", "Register", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(registerOption == JOptionPane.YES_OPTION) {
                this.dispose();
                new CustomerRegistration();
            }
        } else if(!success) {
            new DialogBoxUI(this, "Invalid Login Credentials.", JOptionPane.ERROR_MESSAGE);
            resetLoginFields();
            return;
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void interactionRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interactionRoleActionPerformed
        selectedUserRole = interactionRole.getSelectedItem().toString();
    }//GEN-LAST:event_interactionRoleActionPerformed

    private void resetLoginFields() {
        userfield.setText("");
        passfield.setText("");
    }
    
    private boolean validateLogin(String user, String pass, String role) {
        switch(role.toLowerCase()) {
            case "customer":
                Customer[] customers = Customer.toCustomer(CSVParser.loadCSVData("src/CSVFiles/customers.csv"));
                for(Customer customer: customers) {
                    if(customer.getName().equals(user) && customer.getContactInfo().equals(pass)) {
                        new DialogBoxUI(this, "Successfully Logged In!", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        new CustomerDashboard(customer);
                        return true;
                    }
                }
                return false;
            case "admin":
                Admin admin = new Admin(user);
                if(admin.login(pass)) {
                    new DialogBoxUI(this, "Successfully Logged In!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new AdminDashboard(admin);
                    return true;
                }
            case "frontline":
                if(new Employee(user).login(pass)) {
                    new DialogBoxUI(this, "Successfully Logged In!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new FrontlineEmployee();
                    return true;
                }
            case "warehouse": 
                if(new Employee(user).login(pass)) {
                    new DialogBoxUI(this, "Successfully Logged In!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new WarehouseManager();
                    return true;
                }
            case "driver":
                if(new Employee(user).login(pass)) {
                    new DialogBoxUI(this, "Successfully Logged In!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new Driver();
                    return true;
                }
            default: 
                return false; 
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logistics();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creatorLabel;
    private javax.swing.JComboBox<String> interactionRole;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JLabel loginHeader;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel password;
    private javax.swing.JLabel prompt;
    private javax.swing.JLabel role;
    private javax.swing.JLabel sectionLabel;
    private javax.swing.JLabel tagline;
    private javax.swing.JTextField userfield;
    private javax.swing.JLabel username;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
