/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import javax.swing.*;

public class DatabaseConnection {
    public static Connection ConnectDb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/dbinventory","root","");
           
            System.out.println("Yehhh DB Connected");
            return conn;    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
            
        }
        
    }
    
}
