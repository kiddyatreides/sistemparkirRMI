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
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.JOptionPane;
import object.IClient;

/**
 *
 * @author Kid
 */
public class Client extends UnicastRemoteObject implements IClient {
    
    Koneksi kon = new Koneksi();
    
    
    public Client() throws RemoteException {
        super();
    }
    
    String username;
    String password;
    String plat;
    String jenis;
    String waktu;
    String nama;
    String alamat;
    String nohp;
    String jenisidentitas;
    String jk;
    String tgllahir;
    String noidentitas;
    String idparkir,idcustomer;
    String jeniskehilangan,keterangan,tanggalmasalah;
    int denda;

    
    //login
    @Override
    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String getUsername() {
        return this.username;
    }
    
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String getPassword() {
        return this.password;
    }
    
     public int doLogin()
    {
        int i = 0;
        try
        {
            Connection con = kon.getConnection();
            String str = "SELECT COUNT (*) FROM administrator WHERE username = ? AND password = ?";
            
            PreparedStatement pr = con.prepareStatement(str);

            pr.setString(1, username.trim());
            pr.setString(2, password.trim());
            ResultSet rs = pr.executeQuery();
            if (rs.next())
            {
                i = rs.getInt(1);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return i;
        
    }
     
     //platnomor
     @Override
    public void setPlatNomor(String plat) {
        this.plat = plat;
    }
    
    @Override
    public String getPlatNomor() {
        return this.plat;
    }
    
     @Override
    public void setIDParkir(String idparkir) {
        this.idparkir = idparkir;
    }
    
    @Override
    public String getIDParkir() {
        return this.idparkir;
    }
    
     //platnomor
     @Override
    public void setJenis(String jenis) {
        this.jenis  = jenis;
    }
    
    @Override
    public String getJenis() {
        return this.jenis;
    }
    
    public void setWaktu(String waktu) {
        this.waktu  = waktu;
    }
    
    @Override
    public String getWaktu() {
        return this.waktu;
    }
    
    
    
    
    
    public int SavePlatNomor() throws RemoteException{
        try
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.getConnection();
            String str = "INSERT kendaraan (plat_nomor, jenis) values (?,?)";
            PreparedStatement ps = con.prepareStatement(str);

            ps.setString(1,this.plat);
            ps.setString(2,this.jenis);
            
            
            int i = ps.executeUpdate();
            return i;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    
     //customer
    public void setIDCustomer(String idcustomer) {
        this.idcustomer  = idcustomer;
    }
    
    public String getIDCustomer() {
        return this.idcustomer;
    }
    
    public void setNama(String nama) {
        this.nama  = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setTglLahir(String tglLahir) {
        this.tgllahir  = tglLahir;
    }
    
    public String getTglLahir() {
        return this.tgllahir;
    }
    
    public void setJenisKelamin(String jk) {
        this.jk  = jk;
    }
    
    public String getJenisKelamin() {
        return this.jk;
    }
    
    public void setAlamat(String alamat) {
        this.alamat  = alamat;
    }
    
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setNoIdentitas(String noidentitas) {
        this.noidentitas  = noidentitas;
    }
    
    public String getNoIdentitas() {
        return this.noidentitas;
    }
    
    public void setJenisIdentitas(String jenisidentitas) {
        this.jenisidentitas  = jenisidentitas;
    }
    
    public String getJenisIdentitas() {
        return this.jenisidentitas;
    }
    
    public void setNoHp(String nohp) {
        this.nohp  = nohp;
    }
    
    public String getNoHp() {
        return this.nohp;
    }
    
    public int SaveCustomer() throws RemoteException{
        try
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.getConnection();
            String str = "INSERT customer (customer_name, tgl_lahir, jenis_identitas, no_identitas, alamat,phoneno,jk) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(str);

            ps.setString(1,this.nama);
            ps.setString(2,this.tgllahir);
            ps.setString(3,this.jenisidentitas);
            ps.setString(4,this.noidentitas);
            ps.setString(5,this.alamat);
            ps.setString(6,this.nohp);
            ps.setString(7,this.jk);
            
            
            int i = ps.executeUpdate();
            return i;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    
    //trouble
     public void setJenisKehilangan(String jeniskehilangan) {
        this.jeniskehilangan  = jeniskehilangan;
    }
    
    public String getJenisKehilangan() {
        return this.jeniskehilangan;
    }
    
     public void setKeterangan(String keterangan) {
        this.keterangan  = keterangan;
    }
    
    public String getKeterangan() {
        return this.keterangan;
    }
    
     public void setTanggalMasalah(String tanggalmasalah) {
        this.tanggalmasalah  = tanggalmasalah;
    }
    
    public String getTanggalMasalah() {
        return this.tanggalmasalah;
    }
    
    public void setDenda(int denda) {
        this.denda  = denda;
    }
    
    @Override
    public int getDenda() {
        return this.denda;
    }
    
    public int SaveTrouble() throws RemoteException{
        try
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.getConnection();
            String str = "INSERT trouble (id_customer, jenis_masalah, keterangan,denda) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(str);

            ps.setString(1,this.idcustomer);
            ps.setString(2,this.jeniskehilangan);
            ps.setString(3,this.keterangan);
            ps.setInt(4,this.denda);
            
            
            int i = ps.executeUpdate();
            return i;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return 0;
        }
        
    }
    
    //crud method
    @Override
    public  ArrayList getKendaraan() throws RemoteException{
        ArrayList data = new ArrayList();
        try {
            Connection con = kon.getConnection();
            String sql = "select * from kendaraan";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setIDParkir(rs.getString(1));
                this.setPlatNomor(rs.getString(2));
                this.setJenis(rs.getString(3));
                this.setWaktu(rs.getString(4));
                
                // using getter method too add value in arraylist
                data.add(this.getIDParkir());
                data.add(this.getPlatNomor());
                data.add(this.getJenis());
                data.add(this.getWaktu());
                
            }
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
    
    //crud method
    @Override
    public  ArrayList getTrouble() throws RemoteException{
        ArrayList data = new ArrayList();
        try {
            Connection con = kon.getConnection();
            String sql = "select * from trouble order by tgl";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setIDCustomer(rs.getString(1));
                this.setJenisKehilangan(rs.getString(2));
                this.setKeterangan(rs.getString(3));
                this.setDenda(rs.getInt(4));
                this.setTanggalMasalah(rs.getString(5));
                
                // using getter method too add value in arraylist
                data.add(this.getIDCustomer());
                data.add(this.getJenisKehilangan());
                data.add(this.getKeterangan());
                data.add(this.getDenda());
                data.add(this.getTanggalMasalah());
                
            }
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
    
     //crud method
    @Override
    public  ArrayList getCustomer() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select * from customer";
            Statement st = con.createStatement();
             rs = st.executeQuery(sql);
            
           while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setIDCustomer(rs.getString(1));
                this.setNama(rs.getString(2));
                this.setTglLahir(rs.getString(3));
                this.setJenisKelamin(rs.getString(4));
                this.setJenisIdentitas(rs.getString(5));
                this.setNoIdentitas(rs.getString(6));
                this.setAlamat(rs.getString(7));
                this.setNoHp(rs.getString(8));
                
                // using getter method too add value in arraylist
                data.add(this.getIDCustomer());
                data.add(this.getNama());
                data.add(this.getTglLahir());
                data.add(this.getJenisKelamin());
                data.add(this.getJenisIdentitas());
                data.add(this.getNoIdentitas());
                data.add(this.getAlamat());
                data.add(this.getNoHp());
                
                
            }
             
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
    
}
