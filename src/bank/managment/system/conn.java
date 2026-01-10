
package bank.managment.system;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
           
           
            c=DriverManager.getConnection("jdbc:mysql:///bankManagmentSystem","root","#Nidhi7974");
             s=c.createStatement();
//           
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
}
