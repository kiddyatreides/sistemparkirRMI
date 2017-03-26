/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import config.Koneksi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Kid
 */
public class Login extends UnicastRemoteObject implements sistemparkirapi.Login{
    
    public String username,password;
    private config.Koneksi kon = new Koneksi();
    
     //no argument constructor
    public Login() throws Exception{
        super();
    }

    public String getAccount() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public String getUsername() throws RemoteException  {return username;}
    @Override
    public String getPassword() throws RemoteException  {return username;}


    @Override
    public void setUsername(String username) throws RemoteException {
       this.username = username; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String password) throws RemoteException {
        this.password = password; //To change body of generated methods, choose Tools | Templates.
    }
    
    public  ArrayList read() throws RemoteException{
        ArrayList data = new ArrayList();
        try {
            Connection con = kon.getConnection();
            String sql = "select * from administrator where username = ? and password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.username);
            ps.setString(2, this.password);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setUsername(rs.getString(2));
                this.setPassword(rs.getString(3));
                
                // using getter method too add value in arraylist
                data.add(this.getUsername());
                data.add(this.getPassword());
            }
        } 
        catch (Exception e) {
            System.err.println("Error Server : "+e);
        }
        return data;
    }
    
    
}
