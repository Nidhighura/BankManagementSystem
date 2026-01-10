
package bank.managment.system;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;

public class SignUp3 extends javax.swing.JFrame {
    String formno;
    public SignUp3(String formno) {
        initComponents();
        this.formno=formno;
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        atm = new javax.swing.JCheckBox();
        internet = new javax.swing.JCheckBox();
        mobilebank = new javax.swing.JCheckBox();
        cheque = new javax.swing.JCheckBox();
        email = new javax.swing.JCheckBox();
        estatement = new javax.swing.JCheckBox();
        correctdetails = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        saving = new javax.swing.JRadioButton();
        Fdeposite = new javax.swing.JRadioButton();
        current = new javax.swing.JRadioButton();
        Rdeposite = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setName("jLabel1"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Page:3 Addition Information ");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setText("Account Type");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Card Number");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel5.setText("Your 16 Digit Card Number");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setText("PIN");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setText("Your 4 Digit Passward");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setText("Services Required");
        jLabel8.setName("jLabel8"); // NOI18N

        atm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        atm.setText("ATM CARD");
        atm.setName("atm"); // NOI18N

        internet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        internet.setText("Internet Banking");
        internet.setName("internet"); // NOI18N

        mobilebank.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mobilebank.setText("Mobile Banking");
        mobilebank.setName("mobilebank"); // NOI18N

        cheque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cheque.setText("Cheque Book");
        cheque.setName("cheque"); // NOI18N

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setText("EMAIL & SMS Alerts");
        email.setName("email"); // NOI18N

        estatement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estatement.setText("E-Statement");
        estatement.setName("estatement"); // NOI18N

        correctdetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        correctdetails.setText("I hereby declares that the above entered details are correct to the best of my knowledge");
        correctdetails.setName("correctdetails"); // NOI18N

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setName("btnSubmit"); // NOI18N
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        buttonGroup1.add(saving);
        saving.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        saving.setText("Saving Account");
        saving.setName("saving"); // NOI18N

        buttonGroup1.add(Fdeposite);
        Fdeposite.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Fdeposite.setText("Fixed Deposite Account");
        Fdeposite.setName("Fdeposite"); // NOI18N

        buttonGroup1.add(current);
        current.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        current.setText("Current Account");
        current.setName("current"); // NOI18N

        buttonGroup1.add(Rdeposite);
        Rdeposite.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Rdeposite.setText("Recurring Deposite Account");
        Rdeposite.setName("Rdeposite"); // NOI18N
        Rdeposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdepositeActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextField1.setText("XXXX-XXXX-XXXX-4136");
        jTextField1.setName("jTextField1"); // NOI18N

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextField2.setText("XXXX");
        jTextField2.setName("jTextField2"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(atm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(saving, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(current))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(internet, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(estatement)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Rdeposite)
                                            .addComponent(Fdeposite)))))
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mobilebank)
                            .addComponent(cheque)
                            .addComponent(correctdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saving)
                            .addComponent(Fdeposite))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(current)
                    .addComponent(Rdeposite))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atm)
                    .addComponent(internet))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobilebank)
                    .addComponent(email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cheque)
                    .addComponent(estatement))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(correctdetails)
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel)
                            .addComponent(btnSubmit))
                        .addGap(19, 19, 19))))
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

    private void RdepositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdepositeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdepositeActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String acctype=null;
        if(saving.isSelected())acctype="Saving Account";
        else if(Fdeposite.isSelected())acctype="Fixed Deposite Account";
        else if(current.isSelected())acctype="Current Account";
        else if(Rdeposite.isSelected())acctype="Recurring Deposite Account";
        
        Random rdm=new Random();
        String cardno="5631"+String.format("%012d", rdm.nextLong(1000000000000L));
        String pin=String.format("%04d", rdm.nextLong(10000L));
        
        String service="";
        if(atm.isSelected())service=service+" ATM Card";
        else if(internet.isSelected())service=service+" Internet Banking";
        else if(mobilebank.isSelected())service=service+" Mobile Banking";
        else if(email.isSelected())service=service+" Email & SMS Alert";
        else if(cheque.isSelected())service=service+" Cheque Book";
        else if(estatement.isSelected())service=service+" E-Statement";
        
        try{
            
            if(acctype==null || service.equals("")){
                JOptionPane.showMessageDialog(this, "Fill ALL Details");
            }
            
            conn c=new conn();
            String query1="insert into signup3 values('"+formno+"','"+acctype+"','"+cardno+"','"+pin+"','"+service+"')";
            String query2="insert into login values ('"+formno+"','"+cardno+"','"+pin+"')";
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            JOptionPane.showMessageDialog(this, "Card Number: "+cardno+"\nPIN Number: "+pin);
            setVisible(false);
            new Deposite(pin).setVisible(true);
            
        }catch(HeadlessException | SQLException e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
            new Login().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

   
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
            java.util.logging.Logger.getLogger(SignUp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignUp3("").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Fdeposite;
    private javax.swing.JRadioButton Rdeposite;
    private javax.swing.JCheckBox atm;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cheque;
    private javax.swing.JCheckBox correctdetails;
    private javax.swing.JRadioButton current;
    private javax.swing.JCheckBox email;
    private javax.swing.JCheckBox estatement;
    private javax.swing.JCheckBox internet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox mobilebank;
    private javax.swing.JRadioButton saving;
    // End of variables declaration//GEN-END:variables
}
