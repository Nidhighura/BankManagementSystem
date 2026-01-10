
package bank.managment.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener {
    JButton back,changepin;
    JPasswordField pin,repin;
    String oldpinNo;
    PinChange(String oldpinNo){
        this.oldpinNo=oldpinNo;
         setLayout(null);
        
        ImageIcon img=new ImageIcon (ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image=new ImageIcon(i);
        JLabel backgroundImg=new JLabel(image);
        backgroundImg.setBounds(0, 0, 900,900);
        add(backgroundImg);
        
        JLabel text=new JLabel("CHANGE YOUR PIN");
        text.setBounds(250,280,500,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        backgroundImg.add(text);
        
        JLabel pintext=new JLabel("New Pin");
        pintext.setBounds(165,320,180,25);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        backgroundImg.add(pintext);
        
        pin=new JPasswordField();
        pin.setBounds(330, 325, 180, 25);
        pin.setFont(new Font("System",Font.BOLD,16));
        pin.addActionListener(this);
        backgroundImg.add(pin);
        
        JLabel repintext=new JLabel("Re-Enter New Pin");
        repintext.setBounds(165,360,180,25);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        backgroundImg.add(repintext);
        
        repin=new JPasswordField();
        repin.setBounds(330, 360, 180, 25);
        repin.setFont(new Font("System",Font.BOLD,16));
        repin.addActionListener(this);
        backgroundImg.add(repin);
        
        changepin=new JButton("Change");
        changepin.setBounds(355, 485, 150, 30);
        changepin.addActionListener(this);
        backgroundImg.add(changepin);
        
        
        back=new JButton("Back");
        back.setBounds(355 , 520, 150, 30);
        back.addActionListener(this);
        backgroundImg.add(back);
        
        setUndecorated(true);
        setSize(900,900);
        setLocation(300,0);
    }
    public static void main(String args[]){
        new PinChange("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
            setVisible(false);
            new Transactions(oldpinNo).setVisible(true);
        }
        else {
            try{
                String npin=pin.getText();
                String rpin=repin.getText();
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null, "Pin Not Match");
                    return;
                }
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter Your New Pin");
                    return;
                }
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Re-Enter Your New Pin");
                    return;
                }
                conn c=new conn();
                String query1="update bank set pin='"+rpin+"'where pin='"+oldpinNo+"'";
                String query2="update login set PIN='"+rpin+"'where PIN='"+oldpinNo+"'";
                String query3="update signup3 set PIN='"+rpin+"'where PIN='"+oldpinNo+"'";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "PIN Successfully Changed");
                setVisible(false);
                new Transactions(oldpinNo).setVisible(true);
                
                
                
                
            }catch(HeadlessException | SQLException e){
                System.out.println(e);
            }
        }
    }
}
