/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConnectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdelhalim
 */
public class DBConnection {
    //Apply Singltone pattern

    //private static DBConnection DBConn;
    public static Connection connection;

//    public static DBConnection getInstance() {
//        if (DBConn == null) {
//            DBConn = new DBConnection();
//        }
//        return DBConn;
//    }
    public DBConnection() {
    }

    public static void openConnection() {

        if (connection == null) {
            try {
                String driverName = "com.mysql.jdbc.Driver";
                Class.forName(driverName);
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javadb","root","root");
            } catch (Exception ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("connection = " + connection.toString());
                System.out.println("Exception = " + ex.getMessage());
            }
        }
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
