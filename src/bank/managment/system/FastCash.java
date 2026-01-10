
package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    
    JButton Fastcash1,back,Fastcash2,Fastcash3,Fastcash4,Fastcash5,Fastcash6;
    String pinno;
    FastCash(String pinno){
        this.pinno=pinno;
        setLayout(null);
        
        ImageIcon img=new ImageIcon (ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image=new ImageIcon(i);
        JLabel backgroundImg=new JLabel(image);
        backgroundImg.setBounds(0, 0, 900,900);
        add(backgroundImg);
        
        JLabel text=new JLabel("Please Enter Withdrawl Amount");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        backgroundImg.add(text);
        
         Fastcash1=new JButton("Rs 100");
        Fastcash1.setBounds(170, 415, 150, 30);
        Fastcash1.addActionListener(this);
        backgroundImg.add(Fastcash1);
        
         Fastcash2=new JButton("Rs 500");
        Fastcash2.setBounds(355 , 415, 150, 30);
         Fastcash2.addActionListener(this);
        backgroundImg.add(Fastcash2);
        
          Fastcash3=new JButton("Rs 1000");
        Fastcash3.setBounds(170, 450, 150, 30);
         Fastcash3.addActionListener(this);
        backgroundImg.add(Fastcash3);
        
         Fastcash4=new JButton("Rs 2000");
        Fastcash4.setBounds(355 , 450, 150, 30);
         Fastcash4.addActionListener(this);
        backgroundImg.add(Fastcash4);
        
          Fastcash5=new JButton("Rs 5000");
        Fastcash5.setBounds(170, 485, 150, 30);
         Fastcash5.addActionListener(this);
        backgroundImg.add(Fastcash5);
        
         Fastcash6=new JButton("Rs 10000");
        Fastcash6.setBounds(355 , 485, 150, 30);
         Fastcash6.addActionListener(this);
        backgroundImg.add(Fastcash6);
        
         back=new JButton("Back");
        back.setBounds(355 , 520, 150, 30);
         back.addActionListener(this);
        backgroundImg.add(back);
        
        
        
        
        setUndecorated(true);
        setSize(900,900);
        setLocation(300,0);
        
    }
    
    public static void main(String args[]){
        new FastCash("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new Transactions(pinno).setVisible(true);
        }
        else {
            String amount =((JButton)e.getSource()).getText().substring(3);
            conn c=new conn();
            try{
                ResultSet r=c.s.executeQuery("select * from bank where pin='"+pinno+"'");
                int balance=0;
                while(r.next()){
                    if(r.getString("type").equals("Deposite"))
                        balance+=Integer.parseInt(r.getString("amount"));
                    else 
                        balance-=Integer.parseInt(r.getString("amount"));
                }
                if(e.getSource()!=back && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date d=new Date();
                String query="insert into bank values('"+pinno+"','"+d+"','withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null, "Rs'"+amount+"' Debited Successfully");
                 setVisible(false);
                new Transactions(pinno).setVisible(true);
            }catch(SQLException ae){
                System.out.println(ae);
            }
            
        }
    }
    
}
