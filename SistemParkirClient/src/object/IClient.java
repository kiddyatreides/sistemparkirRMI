/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Kid
 */
import java.rmi.*;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.print.attribute.standard.DateTimeAtCompleted;

public interface IClient extends Remote {
     //login
    public void setUsername(String username)throws RemoteException;
    public String getUsername() throws RemoteException;
    public void setPassword(String password)throws RemoteException;
    public String getPassword() throws RemoteException;
    public int doLogin()throws RemoteException;
    
    //save platnomor
    public void setIDParkir(String IDParkir) throws RemoteException;
    public String getIDParkir() throws RemoteException;
    public void setPlatNomor(String Plat) throws RemoteException;
    public String getPlatNomor() throws RemoteException;
    public void setJenis(String Jenis) throws RemoteException;
    public String getJenis() throws RemoteException;
    public void setWaktu(String Waktu) throws RemoteException;
    public String getWaktu() throws RemoteException;
    public void setWaktuKeluar(String WaktuKeluar) throws RemoteException;
    public String getWaktuKeluar() throws RemoteException;
    public void setBiaya(String biaya) throws RemoteException;
    public String getBiaya() throws RemoteException;
    public int SavePlatNomor() throws RemoteException;
    
    //customer
    public void setIDCustomer(String IDCustomer) throws RemoteException;
    public String getIDCustomer() throws RemoteException;
    public void setNama(String Nama) throws RemoteException;
    public String getNama() throws RemoteException;
    public void setTglLahir(String tgl) throws RemoteException;
    //public void setTglLahir(Date tgl) throws RemoteException;
    public String getTglLahir() throws RemoteException;
    public void setJenisKelamin(String JenisKelamin) throws RemoteException;
    public String getJenisKelamin() throws RemoteException;
    public void setAlamat(String Alamat) throws RemoteException;
    public String getAlamat() throws RemoteException;
    public void setNoIdentitas(String NoIdentitas) throws RemoteException;
    public String getNoIdentitas() throws RemoteException;
    public void setJenisIdentitas(String JenisIdentitas) throws RemoteException;
    public String getJenisIdentitas() throws RemoteException;
    public void setNoHp(String NoHp) throws RemoteException;
    public String getNoHp() throws RemoteException;
    public int SaveCustomer() throws RemoteException;
    
    //add trouble
    public void setJenisKehilangan(String JenisKehilangan) throws RemoteException;
    public String getJenisKehilangan() throws RemoteException;
    public void setKeterangan(String Keterangan) throws RemoteException;
    public String getKeterangan() throws RemoteException;
    public void setTanggalMasalah(String TanggalMasalah) throws RemoteException;
    public String getTanggalMasalah() throws RemoteException;
    public void setDenda(String denda) throws RemoteException;
    public String getDenda() throws RemoteException;
    public int SaveTrouble() throws RemoteException;
    
    //get Kendaraan
      
      public ArrayList getCustomer() throws RemoteException;
      public ArrayList getCustomerID() throws RemoteException;
      public ArrayList getTrouble() throws RemoteException;
      public ArrayList getTroubleID() throws RemoteException;
      public ArrayList getListKendaraan() throws RemoteException;
      public ArrayList getDataKendaraan() throws RemoteException;
      public int UpdateDataParkir() throws RemoteException;
      public ArrayList getJumlahWaktu() throws RemoteException;
    
}
