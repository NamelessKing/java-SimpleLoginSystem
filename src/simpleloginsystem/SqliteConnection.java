/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleloginsystem;


import java.sql.*;
import javax.swing.*;

/**
 *
 * @author NamelessKing
 */
public class SqliteConnection {
    
    Connection con = null;
    public static Connection dbConnector(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = 
                    DriverManager.getConnection("jdbc:sqlite:C:\\Users\\"
                            + "NamelessKing\\Google Drive\\Projects\\NetBeansProjects"
                            + "\\SimpleLoginSystem\\EmployeeData.sqlite");
            JOptionPane.showMessageDialog(null, "Connection Successful");
            return con;
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    };
}
