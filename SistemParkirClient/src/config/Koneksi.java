/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kid
 */
public class Koneksi {
     public Connection getConnection()
    {
        Connection con;
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url = "jdbc:sqlserver://localhost\\DHANA;databaseName=SistemParkir";
           con = DriverManager.getConnection(url, "sa", "123456");
           return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.err.println(e);
            return null;
        }
                
    }
}
