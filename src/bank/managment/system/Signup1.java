
package bank.managment.system;

import java.awt.*;

import java.util.*;
import javax.swing.*;


import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;



public class Signup1 extends javax.swing.JFrame {
JDateChooser dateChooser;
long random;
Random rdm;
    public Signup1() {
        initComponents();
        setLocationRelativeTo(null);
       
        
        rdm=new Random();
        random=Math.abs((rdm.nextLong() % 9000L)+1000L);
        
        JLabel formno=new JLabel("Application Form NO: "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,35));
        formno.setBounds(200, 40, 600, 40);
        Mypanel.add(formno);
        
        ImageIcon img=new ImageIcon (ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i=img.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image=new ImageIcon(i);
        JLabel lblImg=new JLabel(image);
        lblImg.setBounds(70, 10, 100,100);
        Mypanel.add(lblImg);
        
        JLabel perinfo=new JLabel("Page1: Personal Details");
        perinfo.setFont(new Font("Raleway",Font.BOLD,22));
        perinfo.setBounds(310, 80, 400, 35);
        Mypanel.add(perinfo);
        
         dateChooser=new JDateChooser();
        dateChooser.setForeground(Color.BLACK);
         dateChooser.setBounds(280,265,400,30);
        
        Mypanel.add(dateChooser);
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        Mypanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        Female = new javax.swing.JRadioButton();
        Male = new javax.swing.JRadioButton();
        Other = new javax.swing.JRadioButton();
        Married = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        Unmarried = new javax.swing.JRadioButton();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtPinCode = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mypanel.setBackground(new java.awt.Color(255, 255, 255));
        Mypanel.setName("Mypanel"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name:");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Father's Name:");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date of Birth:");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Gender:");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email Address:");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Marital Status:");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Address:");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("City:");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Pin Code:");
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("State:");
        jLabel10.setName("jLabel10"); // NOI18N

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtname.setName("txtname"); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtFname.setName("txtFname"); // NOI18N
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        buttonGroup3.add(Female);
        Female.setText("Female");
        Female.setName("Female"); // NOI18N
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        buttonGroup3.add(Male);
        Male.setText("Male");
        Male.setName("Male"); // NOI18N
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        buttonGroup3.add(Other);
        Other.setText("Other");
        Other.setName("Other"); // NOI18N
        Other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherActionPerformed(evt);
            }
        });

        buttonGroup4.add(Married);
        Married.setText("Married");
        Married.setName("Married"); // NOI18N
        Married.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarriedActionPerformed(evt);
            }
        });

        txtEmail.setName("txtEmail"); // NOI18N

        buttonGroup4.add(Unmarried);
        Unmarried.setText("Unmarried");
        Unmarried.setName("Unmarried"); // NOI18N
        Unmarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnmarriedActionPerformed(evt);
            }
        });

        txtAddress.setName("txtAddress"); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtCity.setName("txtCity"); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtPinCode.setName("txtPinCode"); // NOI18N
        txtPinCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinCodeActionPerformed(evt);
            }
        });

        txtState.setName("txtState"); // NOI18N
        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.setName("btnNext"); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MypanelLayout = new javax.swing.GroupLayout(Mypanel);
        Mypanel.setLayout(MypanelLayout);
        MypanelLayout.setHorizontalGroup(
            MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MypanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(81, 81, 81)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFname)
                    .addComponent(txtEmail)
                    .addComponent(txtCity)
                    .addComponent(txtState)
                    .addComponent(txtPinCode)
                    .addComponent(txtAddress)
                    .addGroup(MypanelLayout.createSequentialGroup()
                        .addComponent(Married, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(Unmarried, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MypanelLayout.createSequentialGroup()
                        .addComponent(Male, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Female, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(Other, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtname))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MypanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MypanelLayout.setVerticalGroup(
            MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MypanelLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Male)
                    .addComponent(Female)
                    .addComponent(Other))
                .addGap(18, 18, 18)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Married)
                    .addComponent(Unmarried))
                .addGap(29, 29, 29)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnNext)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Mypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

    private void OtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OtherActionPerformed

    private void MarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarriedActionPerformed
      
    }//GEN-LAST:event_MarriedActionPerformed

    private void UnmarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnmarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnmarriedActionPerformed
    // TODO add your handling code here:
    // TODO add your handling code here:


    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        String formno=" "+random;
        String name=txtname.getText();
        String Fname=txtFname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String email=txtEmail.getText();
        String pin=txtPinCode.getText();
        String state=txtState.getText();
        String city=txtCity.getText();
        String address=txtAddress.getText();
        String gender=null;
        
        if(Male.isSelected()) gender="Male";
        else if(Female.isSelected()) gender="Female";
        else if(Other.isSelected()) gender="Other";
        
        String married_status=null;
        if(Married.isSelected()) married_status="Married";
        else if(Unmarried.isSelected()) married_status="Unmarried";
        
            
        
      
        try{
        if(name.equals("") || Fname.equals("") || dob.equals("") || email.equals("") || pin.equals("") || state.equals("") || city.equals("") || address.equals("") || gender==null ||  married_status==null ){
               JOptionPane.showMessageDialog(this, "Fill All Details");
        }
        else{
            conn c=new conn();
            String query="insert into signup values('"+formno+"','"+name+"','"+Fname+"','"+dob+"','"+email+"','"+gender+"','"+married_status+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
           

            c.s.executeUpdate(query);
            setVisible(false);
            new Signup2(formno).setVisible(true);
            
        }
       }catch(HeadlessException | SQLException e){
           System.out.println(e);
       }
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtPinCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinCodeActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed
    
  
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
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Signup1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JRadioButton Married;
    private javax.swing.JPanel Mypanel;
    private javax.swing.JRadioButton Other;
    private javax.swing.JRadioButton Unmarried;
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtPinCode;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
