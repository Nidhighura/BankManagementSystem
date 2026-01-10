
package bank.managment.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;


public class CheckBalance extends JFrame implements ActionListener {
    
    JButton back;
    String pinno;
    CheckBalance( String pin){
        this.pinno=pin;
        
        ImageIcon img=new ImageIcon (ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image=new ImageIcon(i);
        JLabel backgroundImg=new JLabel(image);
        backgroundImg.setBounds(0, 0, 900,900);
        add(backgroundImg);
        
        back=new JButton("Back");
        back.setBounds(355 , 520, 150, 30);
        back.addActionListener(this);
        backgroundImg.add(back);
        
        conn c=new conn();
        int balance=0;
            try{
                ResultSet r=c.s.executeQuery("select * from bank where pin='"+pinno+"'");
                
                while(r.next()){
                    if(r.getString("type").equals("Deposite"))
                        balance+=Integer.parseInt(r.getString("amount"));
                    else 
                        balance-=Integer.parseInt(r.getString("amount"));
                }
            }catch(NumberFormatException | SQLException e){
                        System.out.println(e);
            }
            JLabel text=new JLabel("Your Current Balance is Rs "+balance);
            text.setBounds(250,280,500,35);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("System",Font.BOLD,16));
            backgroundImg.add(text);
        
        setUndecorated(true);
        setSize(900,900);
        setLocation(300,0);
    }
    
    public static void main(String []args){
       new CheckBalance("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new Transactions(pinno).setVisible(true);
        }
    }
    
}
