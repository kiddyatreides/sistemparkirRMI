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
    String denda;
    String waktukeluar,biaya;
    String idadmin,status;

    
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
    
    //login
    @Override
    public void setIDAdmin(String idadmin) {
        this.idadmin = idadmin;
    }
    @Override
    public String getIDAdmin() {
        return this.idadmin;
    }
    
    @Override
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String getStatus() {
        return this.status;
    }
    
     public int doLogin()
    {
        int i = 0;
        try
        {
            Connection con = kon.getConnection();
            String str = "SELECT COUNT (*) FROM administrator WHERE username = ? AND password = ? AND status = 'aktif'";
            
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
            String str = "INSERT kendaraan (plat_nomor, jenis,wkt_tanggal) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(str);

            ps.setString(1,this.plat);
            ps.setString(2,this.jenis);
            ps.setString(3,this.waktu);
            
            
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
    
    public void setDenda(String denda) {
        this.denda  = denda;
    }
    
    @Override
    public String getDenda() {
        return this.denda;
    }
    
    public int SaveTrouble() throws RemoteException{
        try
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.getConnection();
            String str = "INSERT trouble (id_customer, jenis_masalah, keterangan) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(str);

            ps.setString(1,this.idcustomer);
            ps.setString(2,this.jeniskehilangan);
            ps.setString(3,this.keterangan);
            
            
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
    public  ArrayList getTrouble() throws RemoteException{
        ArrayList data = new ArrayList();
        try {
            Connection con = kon.getConnection();
            String sql = "select b.customer_name,a.jenis_masalah,a.tgl,a.keterangan,a.denda from trouble a inner join customer b on a.id_customer = b.id_customer order by a.tgl desc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setNama(rs.getString(1));
                this.setJenisKehilangan(rs.getString(2));
                this.setKeterangan(rs.getString(3));
                this.setDenda(rs.getString(4));
                this.setTanggalMasalah(rs.getString(5));
                
                // using getter method too add value in arraylist
                data.add(this.getNama());
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
    public  ArrayList getTroubleID() throws RemoteException{
        ArrayList data = new ArrayList();
        try {
            Connection con = kon.getConnection();
            String sql = "select b.customer_name,a.jenis_masalah,a.tgl,a.keterangan,a.denda from trouble a inner join customer b on a.id_customer = b.id_customer where a.id_customer = ? order by a.tgl desc";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.nama);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setIDCustomer(rs.getString(1));
                this.setJenisKehilangan(rs.getString(2));
                this.setKeterangan(rs.getString(3));
                this.setDenda(rs.getString(4));
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
    public  ArrayList getListKendaraan() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select * from kendaraan where status = 'masuk' order by wkt_tanggal desc";
            Statement st = con.createStatement();
             rs = st.executeQuery(sql);
            
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
    public  ArrayList getListKendaraan2() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select id_kendaraan,plat_nomor,jenis,wkt_tanggal from kendaraan where status = 'masuk' order by wkt_tanggal desc";
            Statement st = con.createStatement();
             rs = st.executeQuery(sql);
            
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
    public  ArrayList getListKendaraan3() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select id_kendaraan,plat_nomor,jenis,wkt_tanggal from kendaraan where id_kendaraan = ? and status = 'masuk' order by wkt_tanggal desc";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.plat);
            rs = ps.executeQuery();
            
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
    
    public void setWaktuKeluar(String waktukeluar) {
        this.waktukeluar  = waktukeluar;
    }
    
    @Override
    public String getWaktuKeluar() {
        return this.waktukeluar;
    }
    
    public void setBiaya(String biaya) {
        this.biaya  = biaya;
    }
    
    @Override
    public String getBiaya() {
        return this.biaya;
    }
    
     //crud method
    @Override
    public  ArrayList getDataKendaraan() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select * from kendaraan where plat_nomor = ? and status = 'masuk' order by wkt_tanggal desc";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.plat);
            rs = ps.executeQuery();
            
           while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setPlatNomor(rs.getString(1));
                this.setJenis(rs.getString(2));
                this.setWaktu(rs.getString(3));
                this.setWaktuKeluar(rs.getString(4));
                this.setBiaya(rs.getString(5));
                
                // using getter method too add value in arraylist
                data.add(this.getPlatNomor());
                data.add(this.getJenis());
                data.add(this.getWaktu());
                data.add(this.getWaktuKeluar());
                data.add(this.getBiaya());
            }
             
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
    
     //crud method
    @Override
    public  ArrayList getDataKendaraan2() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select * from kendaraan where tgl = ? and status = 'masuk' order by wkt_tanggal desc";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.waktu);
            rs = ps.executeQuery();
            
           while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setPlatNomor(rs.getString(1));
                this.setJenis(rs.getString(2));
                this.setWaktu(rs.getString(3));
                this.setWaktuKeluar(rs.getString(4));
                this.setBiaya(rs.getString(5));
                
                // using getter method too add value in arraylist
                data.add(this.getPlatNomor());
                data.add(this.getJenis());
                data.add(this.getWaktu());
                data.add(this.getWaktuKeluar());
                data.add(this.getBiaya());
            }
             
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
    
    
    
     //crud method
    @Override
    public  int UpdateDataParkir() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sqlupdate = "update kendaraan set wkt_keluar = ? where plat_nomor =? and status = 'masuk'";
            PreparedStatement psupdate = con.prepareStatement(sqlupdate);
            psupdate.setString(1, this.waktukeluar);
            psupdate.setString(2, this.plat);
            
            
            
            System.out.print("Success Update\n");
            int i = psupdate.executeUpdate();
            return i;
            
            
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
            return 0;
        }
     
    }
    
    //crud method
    @Override
    public  ArrayList getJumlahWaktu() throws RemoteException{
        ArrayList data1 = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            
            String sql = "select TOP 1 biaya from kendaraan where plat_nomor = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.plat);
            rs = ps.executeQuery();
            
           while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setBiaya(rs.getString(1));
                
                
                // using getter method too add value in arraylist
                data1.add(this.getBiaya());
                
                
            }
            
             
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data1;
    }
    
     //crud method
    @Override
    public  ArrayList getCustomer() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select * from customer where id_customer = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.idcustomer);
            rs = ps.executeQuery();
            
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
    
     //crud method
    @Override
    public  ArrayList getCustomerID() throws RemoteException{
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
    
    //crud method
    @Override
    public  ArrayList getLogin() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select status from administrator where username = ? and password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.username);
            ps.setString(2, this.password);
            rs = ps.executeQuery();
            
           while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setNama(rs.getString(1));
                
               
                
                // using getter method too add value in arraylist
               
                data.add(this.getNama());
               
                
            }
             
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
    
    //crud method
    @Override
    public  ArrayList getPemasukan() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select jenis,SUM(biaya) from kendaraan where status = 'keluar' group by jenis;";
            Statement st = con.createStatement();
             rs = st.executeQuery(sql);
            
           while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setJenis(rs.getString(1));
                this.setBiaya(rs.getString(2));
                
                
                // using getter method too add value in arraylist
                data.add(this.getJenis());
                data.add(this.getBiaya());
                
                
                
            }
             
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
     //crud method
    @Override
    public  ArrayList getPemasukan2() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select jenis,SUM(biaya) from kendaraan where tgl = ? and status = 'keluar' group by jenis";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.waktu);
            rs = ps.executeQuery();
            
           while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setJenis(rs.getString(1));
                this.setBiaya(rs.getString(2));
                
                // using getter method too add value in arraylist
                data.add(this.getJenis());
                data.add(this.getBiaya());
            }
             
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
    
     //crud method
    @Override
    public  ArrayList getAdminID() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select * from administrator where id_admin = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, this.idadmin);
            rs = ps.executeQuery();
            
           while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setIDAdmin(rs.getString(1));
                this.setNama(rs.getString(2));
                this.setUsername(rs.getString(3));
                this.setPassword(rs.getString(4));
                this.setJenisKelamin(rs.getString(5));
                this.setTglLahir(rs.getString(6));
                this.setStatus(rs.getString(7));
                
                // using getter method too add value in arraylist
                
                data.add(this.getIDAdmin());
                data.add(this.getNama());
                data.add(this.getUsername());
                data.add(this.getPassword());
                data.add(this.getJenisKelamin());
                data.add(this.getTglLahir());
                data.add(this.getStatus());
            }
             
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
    
    
     //crud method
    @Override
    public  ArrayList getAdmin() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sql = "select * from administrator";
            Statement st = con.createStatement();
             rs = st.executeQuery(sql);
            
           while(rs.next())
            {
                // using setter method to assign value of attribute
                this.setIDAdmin(rs.getString(1));
                this.setNama(rs.getString(2));
                this.setUsername(rs.getString(3));
                this.setPassword(rs.getString(4));
                this.setJenisKelamin(rs.getString(5));
                this.setTglLahir(rs.getString(6));
                this.setStatus(rs.getString(7));
                
                // using getter method too add value in arraylist
                data.add(this.getIDAdmin());
                data.add(this.getNama());
                data.add(this.getUsername());
                data.add(this.getPassword());
                data.add(this.getJenisKelamin());
                data.add(this.getTglLahir());
                data.add(this.getStatus());
                
                
            }
             
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
        }
        return data;
    }
    
    public int SuperAdminLogin()
    {
        int i = 0;
        try
        {
            Connection con = kon.getConnection();
            String str = "SELECT COUNT (*) FROM superadmin WHERE username = ? AND password = ?";
            
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
    
     public int SaveAdmin() throws RemoteException{
        try
        {
            Koneksi kon = new Koneksi();
            Connection con = kon.getConnection();
            String str = "INSERT administrator (nama, username, password, jenis_kelamin, tgl_lahir) values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(str);

            ps.setString(1,this.nama);
            ps.setString(2,this.username);
            ps.setString(3,this.password);
            ps.setString(4,this.jk);
            ps.setString(5,this.tgllahir);
            
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
    public  int UpdateAdmin() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sqlupdate = "update administrator set nama = ?, username = ?, password = ?, jenis_kelamin = ?, status = ? where id_admin = ? ";
            PreparedStatement psupdate = con.prepareStatement(sqlupdate);
            psupdate.setString(1, this.nama);
            psupdate.setString(2, this.username);
            psupdate.setString(3, this.password);
            psupdate.setString(4, this.jk);
            psupdate.setString(5, this.status);
            psupdate.setString(6, this.idadmin);
            
            System.out.print("Success Update\n");
            int i = psupdate.executeUpdate();
            return i;
            
            
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
            return 0;
        }
     
    }
    
    @Override
    public  int UpdateCustomer() throws RemoteException{
        ArrayList data = new ArrayList();
        Connection con = kon.getConnection(); 
        ResultSet rs;
        try {
            String sqlupdate = "update customer set customer_name = ?, jk = ?, jenis_identitas = ?, no_identitas = ?, alamat = ?,phoneno = ? where id_customer = ? ";
            PreparedStatement psupdate = con.prepareStatement(sqlupdate);
            psupdate.setString(1, this.nama);
            psupdate.setString(2, this.jk);
            psupdate.setString(3, this.jenisidentitas);
            psupdate.setString(4, this.noidentitas);
            psupdate.setString(5, this.alamat);
            psupdate.setString(6, this.nohp);
            psupdate.setString(7, this.idcustomer);
            
            System.out.print("Success Update\n");
            int i = psupdate.executeUpdate();
            return i;
            
            
        } 
        catch (Exception e) {
            System.err.println("ProductCRUD Server: "+e);
            return 0;
        }
     
    }
    
    
}
