
package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {
    
    JButton deposite,exit,withdrawl,fastcash,ministatement,pinchange,checkbalance;
    String pinno;
    Transactions(String pinno){
        this.pinno=pinno;
        setLayout(null);
        
        ImageIcon img=new ImageIcon (ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image=new ImageIcon(i);
        JLabel backgroundImg=new JLabel(image);
        backgroundImg.setBounds(0, 0, 900,900);
        add(backgroundImg);
        
        JLabel text=new JLabel("Please Select your Transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        backgroundImg.add(text);
        
         deposite=new JButton("Deposite");
        deposite.setBounds(170, 415, 150, 30);
        deposite.addActionListener(this);
        backgroundImg.add(deposite);
        
         withdrawl=new JButton("Withdrawl");
        withdrawl.setBounds(355 , 415, 150, 30);
         withdrawl.addActionListener(this);
        backgroundImg.add(withdrawl);
        
          fastcash=new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150, 30);
         fastcash.addActionListener(this);
        backgroundImg.add(fastcash);
        
         ministatement=new JButton("Mini Statement");
        ministatement.setBounds(355 , 450, 150, 30);
         ministatement.addActionListener(this);
        backgroundImg.add(ministatement);
        
          pinchange=new JButton("PIN Change");
        pinchange.setBounds(170, 485, 150, 30);
         pinchange.addActionListener(this);
        backgroundImg.add(pinchange);
        
         checkbalance=new JButton("Check Balance");
        checkbalance.setBounds(355 , 485, 150, 30);
         checkbalance.addActionListener(this);
        backgroundImg.add(checkbalance);
        
         exit=new JButton("Exit");
        exit.setBounds(355 , 520, 150, 30);
         exit.addActionListener(this);
        backgroundImg.add(exit);
        
        
        
        
        setUndecorated(true);
        setSize(900,900);
        setLocation(300,0);
        
    }
    
    public static void main(String args[]){
        new Transactions("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exit)System.exit(0);
        else if(e.getSource()==deposite){
            setVisible(false);
            new Deposite(pinno).setVisible(true);
        }
        else if(e.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinno).setVisible(true);
        }
        else if(e.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinno).setVisible(true);
        }
        else if(e.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinno).setVisible(true);
        }
        else if(e.getSource()==checkbalance){
            setVisible(false);
            new CheckBalance(pinno).setVisible(true);
        }
        else if(e.getSource()==ministatement){
           
            
            new MiniStatement(pinno).setVisible(true);
        }
    }
    
}
