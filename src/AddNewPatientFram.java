
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class AddNewPatientFram extends javax.swing.JFrame {

    /**
     * Creates new form AddNewPatientFram
     */
    DBConnnector dbConnector=new DBConnnector();
    public AddNewPatientFram() {
        dbConnector.dbConnectNow();
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

        jPanel1 = new javax.swing.JPanel();
        AppointmentLabel = new javax.swing.JLabel();
        AppointmentPersonNameLabel = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        AppointmentPersonNumberLabel = new javax.swing.JLabel();
        AppointmentPersonNumberTextField = new javax.swing.JTextField();
        AppointmentPersonAgeLabel = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        AppointmentPersonpaymentAmountLabel = new javax.swing.JLabel();
        amountTF = new javax.swing.JTextField();
        sentButton = new javax.swing.JButton();
        AppointmentPersonBackPersonButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        AppointmentLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AppointmentLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppointmentLabel.setText("Add New Patient");

        AppointmentPersonNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AppointmentPersonNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppointmentPersonNameLabel.setText("Name: ");

        AppointmentPersonNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AppointmentPersonNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppointmentPersonNumberLabel.setText("Number:");

        AppointmentPersonAgeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AppointmentPersonAgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppointmentPersonAgeLabel.setText("Age: ");

        AppointmentPersonpaymentAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        AppointmentPersonpaymentAmountLabel.setText("Payment Amount: ");

        sentButton.setText("Sent");
        sentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentButtonActionPerformed(evt);
            }
        });

        AppointmentPersonBackPersonButton.setText("Back");
        AppointmentPersonBackPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentPersonBackPersonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(sentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AppointmentPersonBackPersonButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(AppointmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AppointmentPersonpaymentAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(AppointmentPersonNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(AppointmentPersonNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AppointmentPersonAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(70, 70, 70)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AppointmentPersonNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppointmentLabel)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppointmentPersonNameLabel)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppointmentPersonNumberLabel)
                    .addComponent(AppointmentPersonNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppointmentPersonAgeLabel)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppointmentPersonpaymentAmountLabel)
                    .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sentButton)
                    .addComponent(AppointmentPersonBackPersonButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentButtonActionPerformed
        // TODO add your handling code here:
        String name="",age="",amount="",number="";

        try {
            name=nameTF.getText();

            if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter Your Name");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something woring with your name");
        }

        try {
            number=AppointmentPersonNumberTextField.getText();

            if(number.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter Your Number");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something woring with your number");
        }

        try {
            age=ageTF.getText();

            if(age.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter Your Ager");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something woring with your age");
        }

        try {
            amount=amountTF.getText();

            if(amount.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter Your Amount");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something woring with your amount");
        }

        if(!(name.isEmpty() || number.isEmpty() || age.isEmpty() || amount.isEmpty())){
             try {
                   PreparedStatement pst;
                   pst = dbConnector.con.
                           prepareStatement("insert into Patients(fullname,phoneno,email,password)values(?,?,?,?)");
                   pst.setString(1, name);
                   pst.setString(2, number);
                   pst.setString(3, age);
                   pst.setString(4, amount);
                   pst.executeUpdate();

                   nameTF.setText("");
                   AppointmentPersonNumberTextField.setText("");
                   ageTF.setText("");
                   amountTF.setText("");
               }

                catch (SQLException throwables) {
                   throwables.printStackTrace();
               }
            JOptionPane.showMessageDialog(this, "Added New Patient");
        }
    }//GEN-LAST:event_sentButtonActionPerformed

    private void AppointmentPersonBackPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentPersonBackPersonButtonActionPerformed
        // TODO add your handling code here:
        HomeFrame homeFrame=new HomeFrame();
        homeFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_AppointmentPersonBackPersonButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewPatientFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewPatientFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewPatientFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewPatientFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewPatientFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppointmentLabel;
    private javax.swing.JLabel AppointmentPersonAgeLabel;
    private javax.swing.JButton AppointmentPersonBackPersonButton;
    private javax.swing.JLabel AppointmentPersonNameLabel;
    private javax.swing.JLabel AppointmentPersonNumberLabel;
    private javax.swing.JTextField AppointmentPersonNumberTextField;
    private javax.swing.JLabel AppointmentPersonpaymentAmountLabel;
    private javax.swing.JTextField ageTF;
    private javax.swing.JTextField amountTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton sentButton;
    // End of variables declaration//GEN-END:variables
}
