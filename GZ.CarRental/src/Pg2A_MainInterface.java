
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author garet
 */
public class Pg2A_MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form Pg2A_MainInterface
     * @throws java.io.IOException
     */
    public Pg2A_MainInterface() throws IOException {
        initComponents();
        DefaultTableModel tCarDetail = (DefaultTableModel) carDetailsTable.getModel();
        DefaultTableModel tCustomerCarDetail = (DefaultTableModel) customerCarDetailsTable.getModel();
        DefaultTableModel tCustomerAccountDetail = (DefaultTableModel) customerAccountDetailsTable.getModel();
        
        for (String[] readCarDataFile : carDetails.addCarDataFile()) {
            tCarDetail.addRow(readCarDataFile);
        }
        for (String[] readCustomerCarDataFile : UserAccount.addCustomerCarDataFile()){
            tCustomerCarDetail.addRow(readCustomerCarDataFile);
        }
        for (String[] readCustomerAccountDataFile : DataIO.addCustomerAccountDataFile()){
            tCustomerAccountDetail.addRow(readCustomerAccountDataFile);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        WinLbl1 = new javax.swing.JLabel();
        mCarBtn = new javax.swing.JButton();
        mAccBtn = new javax.swing.JButton();
        mBookBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carDetailsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        carComboBox = new javax.swing.JComboBox<>();
        accountComboBox = new javax.swing.JComboBox<>();
        bookingComboBox = new javax.swing.JComboBox<>();
        fileBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerCarDetailsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerAccountDetailsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GZ.Car Rental System_Admin Interface");
        setBackground(new java.awt.Color(183, 175, 163));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(232, 208, 169));
        jPanel1.setToolTipText("");
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel4.setBackground(new java.awt.Color(183, 175, 163));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 100));

        WinLbl1.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        WinLbl1.setForeground(new java.awt.Color(245, 250, 250));
        WinLbl1.setText("GZ. Car Rental System");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(WinLbl1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(WinLbl1)
                .addGap(28, 28, 28))
        );

        mCarBtn.setText("Manage Cars");
        mCarBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mCarBtn.setPreferredSize(new java.awt.Dimension(80, 35));
        mCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCarBtnActionPerformed(evt);
            }
        });

        mAccBtn.setText("Manage Account");
        mAccBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mAccBtn.setPreferredSize(new java.awt.Dimension(80, 35));
        mAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAccBtnActionPerformed(evt);
            }
        });

        mBookBtn.setText("Manage Booking");
        mBookBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mBookBtn.setPreferredSize(new java.awt.Dimension(80, 35));
        mBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBookBtnActionPerformed(evt);
            }
        });

        quitBtn.setText("Quit");
        quitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quitBtn.setPreferredSize(new java.awt.Dimension(80, 35));
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });

        carDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Code", "Brand", "Type", "Rent / Day (RM)", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carDetailsTable.setColumnSelectionAllowed(true);
        carDetailsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(carDetailsTable);
        carDetailsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (carDetailsTable.getColumnModel().getColumnCount() > 0) {
            carDetailsTable.getColumnModel().getColumn(0).setHeaderValue("Car Code");
            carDetailsTable.getColumnModel().getColumn(1).setHeaderValue("Brand");
            carDetailsTable.getColumnModel().getColumn(2).setHeaderValue("Type");
            carDetailsTable.getColumnModel().getColumn(3).setHeaderValue("Rent / Day (RM)");
            carDetailsTable.getColumnModel().getColumn(4).setHeaderValue("Availability");
        }

        jLabel1.setText("Car Details");

        carComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Delete", "Add" }));
        carComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carComboBoxActionPerformed(evt);
            }
        });

        accountComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Delete", "Add" }));

        bookingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approve", "Cancel", "Print" }));
        bookingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingComboBoxActionPerformed(evt);
            }
        });

        fileBtn.setText("Initalize Files");
        fileBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fileBtn.setPreferredSize(new java.awt.Dimension(80, 35));
        fileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileBtnActionPerformed(evt);
            }
        });

        customerCarDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Car Code", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerCarDetailsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(customerCarDetailsTable);
        customerCarDetailsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (customerCarDetailsTable.getColumnModel().getColumnCount() > 0) {
            customerCarDetailsTable.getColumnModel().getColumn(1).setHeaderValue("Car Code");
        }

        jLabel2.setText("Customer Car Details");

        customerAccountDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerAccountDetailsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(customerAccountDetailsTable);
        customerAccountDetailsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel3.setText("Customer Account Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(290, 290, 290))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(139, 321, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(250, 250, 250))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(fileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBookBtnActionPerformed
        // TODO add your handling code here:
//        if ()
    }//GEN-LAST:event_mBookBtnActionPerformed

    private void mCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCarBtnActionPerformed
        // TODO add your handling code here:
        if (carComboBox.getSelectedItem() == "Add"){
            try {
                DefaultTableModel tCarDetail = (DefaultTableModel) carDetailsTable.getModel();
                String uInput = JOptionPane.showInputDialog("Enter car details(format -> carCode:carBraned:carType:rentPerDay:carAvailability): ");
                String[] uInputValues = uInput.split(":");
                if (uInputValues.length != 5){
                    System.out.println("Input Format is incorrect");
                }
                if (!carDetails.validateCarDataFile(uInputValues[0])){
                    tCarDetail.addRow(uInputValues);
                }
                float uValue = Float.parseFloat(uInputValues[3]);
                carDetails.writeCarDataFile(uInputValues[0], uInputValues[1], uInputValues[2], uValue, uInputValues[4]);
            } catch (IOException ex) {
                Logger.getLogger(Pg2A_MainInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (carComboBox.getSelectedItem() == "Delete"){
            try {
                DefaultTableModel tCarDetail = (DefaultTableModel) carDetailsTable.getModel();
                String uInput = JOptionPane.showInputDialog("Car Code to Remove");
                for (int i = 0; i < tCarDetail.getRowCount(); i++){
                    Object carDetailRowValue = tCarDetail.getValueAt(i, 0);
                    if (carDetailRowValue.equals(uInput)){
                        tCarDetail.removeRow(i);
                        JOptionPane.showMessageDialog(null, "Car Successfully Removed");
                        break;
                    }
                }
                carDetails.overWriteCarDataFile(uInput);
            } catch (IOException ex) {
                Logger.getLogger(Pg2A_MainInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mCarBtnActionPerformed

    private void mAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAccBtnActionPerformed
        // TODO add your handling code here:
        if (accountComboBox.getSelectedItem() == "Delete"){
            try {
                DefaultTableModel tCustomerAccountDetail = (DefaultTableModel) customerAccountDetailsTable.getModel();
                String uInput = JOptionPane.showInputDialog("Username to Remove");
                for (int i = 0; i < tCustomerAccountDetail.getRowCount(); i++){
                    Object customerAccountDetailRowValue = tCustomerAccountDetail.getValueAt(i, 0);
                    if (customerAccountDetailRowValue.equals(uInput)){
                        tCustomerAccountDetail.removeRow(i);
                        JOptionPane.showMessageDialog(null, "Account Successfully Removed");
                        break;
                    }
                }
                DataIO.overWriteCustomerAccountDataFile(uInput);
            } catch (IOException ex) {
                Logger.getLogger(Pg2A_MainInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (accountComboBox.getSelectedItem() == "Add"){
            
        }
    }//GEN-LAST:event_mAccBtnActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Thank You For Using Our Service");
        this.dispose();
    }//GEN-LAST:event_quitBtnActionPerformed

    private void fileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileBtnActionPerformed
        try {
            // TODO add your handling code here:
            DataIO.createFile();
        } catch (IOException ex) {
            System.out.println("File exists");
            Logger.getLogger(Pg2A_MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fileBtnActionPerformed

    private void carComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carComboBoxActionPerformed

    private void bookingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Pg2A_MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pg2A_MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pg2A_MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pg2A_MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Pg2A_MainInterface().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Pg2A_MainInterface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WinLbl1;
    private javax.swing.JComboBox<String> accountComboBox;
    private javax.swing.JComboBox<String> bookingComboBox;
    private javax.swing.JComboBox<String> carComboBox;
    private javax.swing.JTable carDetailsTable;
    private javax.swing.JTable customerAccountDetailsTable;
    private javax.swing.JTable customerCarDetailsTable;
    private javax.swing.JButton fileBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mAccBtn;
    private javax.swing.JButton mBookBtn;
    private javax.swing.JButton mCarBtn;
    private javax.swing.JButton quitBtn;
    // End of variables declaration//GEN-END:variables
}
