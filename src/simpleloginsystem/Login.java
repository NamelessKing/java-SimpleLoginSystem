/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleloginsystem;
import java.awt.EventQueue;
import javax.swing.JFrame;

import java.sql.*;
import javax.swing.*;
import org.sqlite.SQLiteJDBCLoader;
/**
 *
 * @author NamelessKing
 */
public class Login {
    
    private JFrame frame;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    Connection connection = null;
    public Login(){
        initialize();
        connection = SqliteConnection.dbConnector();
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setBounds(100,100,450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
