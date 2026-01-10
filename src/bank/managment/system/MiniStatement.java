
package bank.managment.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class MiniStatement extends JFrame{
    String pin;
    MiniStatement(String pin){
        this.pin=pin;
        setTitle("Mini Statement");
        
        setLayout(null);
        
        JLabel mini=new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);
        
        JLabel bank=new JLabel("Indian Bank");
        bank .setBounds(150,20,100,20);
        add(bank);
        
        JLabel card=new JLabel();
        card .setBounds(20,80,300,20);
        add(card);
        
        JLabel balance=new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        
        conn c=new conn();
        try{
            ResultSet r=c.s.executeQuery("select * from login where pin='"+pin+"'");
            while(r.next()){
                card.setText("Card Number: "+r.getString("cardNo").substring(0,4)+"XXXXXXXX"+r.getString("cardNo").substring(12));
            }
            
        }
        catch(SQLException e){
            System.out.println(e);
        }
        int bal=0;
        try{
            ResultSet r=c.s.executeQuery("select * from bank where pin='"+pin+"'");
            while(r.next()){
                mini.setText(mini.getText()+"<html>"+r.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+r.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+r.getString("amount")+"<br><br><html>");
                if(r.getString("type").equals("Deposite"))
                        bal+=Integer.parseInt(r.getString("amount"));
                    else 
                        bal-=Integer.parseInt(r.getString("amount"));
                
            }
            balance.setText("Your Current Balance is Rs: "+bal);
            
        }
        
        catch(SQLException e){
            System.out.println(e);
        }
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        
    }
        
    
    public static  void main (String args[]){
        new MiniStatement("").setVisible(true);
    }
    
}
