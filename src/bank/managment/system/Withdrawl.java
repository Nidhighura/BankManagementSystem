
package bank.managment.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.*;


public class Withdrawl extends JFrame implements ActionListener{
    JButton withdrawl,back;
    JTextField amount;
    String pinNo;
    Withdrawl(String pinNo){
        this.pinNo=pinNo;
         ImageIcon img=new ImageIcon (ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image=new ImageIcon(i);
        JLabel backgroundImg=new JLabel(image);
        backgroundImg.setBounds(0, 0, 900,900);
        add(backgroundImg);
        
        JLabel text=new JLabel("Enter the Amount you want to Withdrawl");
        text.setBounds(200,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        backgroundImg.add(text);
        
        amount=new JTextField();
        amount.setBounds(200, 345, 300, 30);
        amount.setFont(new Font("System",Font.BOLD,16));
        amount.addActionListener(this);
        backgroundImg.add(amount);
        
        withdrawl=new JButton("Withdraw");
        withdrawl.setBounds(355, 485, 150, 30);
        withdrawl.addActionListener(this);
        backgroundImg.add(withdrawl);
        
        
        back=new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        backgroundImg.add(back);
        
        
        
        
        
         setUndecorated(true);
        setSize(900,900);
        setLocation(300,0);
    }
    
    public static void main(String []args){
        new Withdrawl("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new Transactions(pinNo).setVisible(true);
        }
        else if(e.getSource()==withdrawl){
            String pass=JOptionPane.showInputDialog(this,"Please Enter Your Pin","Check PIN Number",JOptionPane.QUESTION_MESSAGE);
            if(!pass.equals(pinNo)){
               JOptionPane.showMessageDialog(this, "Incorrect Pin Number "); 
               return;
            }
            String withdrawlmoney=amount.getText();
            Date d=new Date();
            if(withdrawlmoney.equals("")){
                JOptionPane.showMessageDialog(this, "Please Enter the Amount of Money You want to Withdrawl");
            }
            else{
                conn c=new conn();
                String query="insert into bank values('"+pinNo+"','"+d+"','Withdrawl','"+withdrawlmoney+"')";
                try{
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Rs'"+withdrawlmoney+"' Withdrawl Successfully");
                setVisible(false);
                new Transactions(pinNo).setVisible(true);
                }
                catch(HeadlessException | SQLException ae){
                    System.out.println(ae);
                }
            }
            
        }
        
    }
    
}

