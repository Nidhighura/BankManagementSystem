
package bank.managment.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.*;


public class Deposite extends JFrame implements ActionListener{
    JButton deposite,back;
    JTextField amount;
    String pinNo;
    Deposite(String pinNo){
        this.pinNo=pinNo;
         ImageIcon img=new ImageIcon (ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image=new ImageIcon(i);
        JLabel backgroundImg=new JLabel(image);
        backgroundImg.setBounds(0, 0, 900,900);
        add(backgroundImg);
        
        JLabel text=new JLabel("Enter the Amount you want to deposite");
        text.setBounds(200,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        backgroundImg.add(text);
        
        amount=new JTextField();
        amount.setBounds(200, 345, 300, 30);
        amount.setFont(new Font("System",Font.BOLD,16));
        amount.addActionListener(this);
        backgroundImg.add(amount);
        
        deposite=new JButton("Deposite");
        deposite.setBounds(355, 485, 150, 30);
        deposite.addActionListener(this);
        backgroundImg.add(deposite);
        
        
        back=new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        backgroundImg.add(back);
        
        
        
        
        
         setUndecorated(true);
        setSize(900,900);
        setLocation(300,0);
    }
    
    public static void main(String []args){
        new Deposite("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new Transactions(pinNo).setVisible(true);
        }
        else if(e.getSource()==deposite){
            String depositemoney=amount.getText();
            Date d=new Date();
            if(depositemoney.equals("")){
                JOptionPane.showMessageDialog(this, "Please Enter the Amount of Money You want to Deposite");
            }
            else{
                conn c=new conn();
                String query="insert into bank values('"+pinNo+"','"+d+"','Deposite','"+depositemoney+"')";
                try{
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Rs'"+depositemoney+"' Deposited Successfully");
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

