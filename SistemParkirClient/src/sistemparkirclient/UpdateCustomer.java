/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemparkirclient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import object.IClient;

/**
 *
 * @author Kid
 */
public class UpdateCustomer extends javax.swing.JFrame {

    /**
     * Creates new form UpdateCustomer
     */
    public UpdateCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb_jk = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tx_nomor = new javax.swing.JTextField();
        cb_jenis = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tx_alamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tx_nama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tx_hp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tx_search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        cb_jk.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        cb_jk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pria", "Wanita" }));
        getContentPane().add(cb_jk);
        cb_jk.setBounds(190, 400, 220, 20);

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Identitas :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 200, 88, 15);

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jenis Kelamin :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 400, 85, 15);

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nomor Identitas :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 240, 100, 15);

        tx_nomor.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        getContentPane().add(tx_nomor);
        tx_nomor.setBounds(190, 240, 220, 21);

        cb_jenis.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        cb_jenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KTP", "SIM", "Kartu Pelajar", " " }));
        getContentPane().add(cb_jenis);
        cb_jenis.setBounds(190, 200, 220, 21);

        tx_alamat.setColumns(20);
        tx_alamat.setFont(new java.awt.Font("Myriad Pro", 0, 12)); // NOI18N
        tx_alamat.setRows(5);
        jScrollPane1.setViewportView(tx_alamat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 270, 220, 71);

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 270, 47, 15);

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 160, 41, 15);

        tx_nama.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        getContentPane().add(tx_nama);
        tx_nama.setBounds(190, 160, 220, 21);

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nomor HP :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 360, 67, 15);

        jLabel2.setFont(new java.awt.Font("Trajan Pro 3", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Customer");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 20, 277, 44);

        tx_hp.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        getContentPane().add(tx_hp);
        tx_hp.setBounds(190, 360, 220, 21);

        jButton1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 440, 90, 23);

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 120, 60, 15);

        tx_search.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        getContentPane().add(tx_search);
        tx_search.setBounds(190, 120, 120, 21);

        jButton2.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jButton2.setText("ID Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 120, 90, 23);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(320, 440, 55, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kid\\Documents\\NetBeansProjects\\SistemParkirClient\\src\\imgprk\\2560x1440-black-solid-color-background.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     private void popolatetable2()
    {
        try 
        {
            
           Registry reg = LocateRegistry.getRegistry("127.0.0.1", 9999);
            IClient obj = (IClient) reg.lookup("log");
            String idcustomer  = tx_search.getText();
            obj.setIDCustomer(idcustomer);
            
           ArrayList data = obj.getCustomer();
           
           if (!data.isEmpty())
           {
                JOptionPane.showMessageDialog(null, "Data Found" );
                tx_nama.setText(data.get(1).toString());
                cb_jenis.setSelectedItem(data.get(4).toString());
                cb_jk.setSelectedItem(data.get(3).toString());
                tx_nomor.setText(data.get(5).toString());
                tx_alamat.setText(data.get(6).toString());
                tx_hp.setText(data.get(7).toString());

           }
           else{
                   JOptionPane.showMessageDialog(null, "Data Not Found" );
           }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
     
     private void clear(){
         tx_alamat.setText("");
         tx_hp.setText("");
         tx_nama.setText("");
         tx_nomor.setText("");
         tx_search.setText("");
     }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try{
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 9999);
            IClient obj = (IClient) reg.lookup("log");
            String idcustomer = tx_search.getText();
            String nama = tx_nama.getText();
            String jenis = cb_jenis.getSelectedItem().toString();
            String nomoridentitas = tx_nomor.getText();
            String alamat = tx_alamat.getText();
            String nohp = tx_hp.getText();
            String jk = cb_jk.getSelectedItem().toString();
            
            obj.setNama(nama);
            obj.setJenisKelamin(jk);
            obj.setJenisIdentitas(jenis);
            obj.setNoIdentitas(nomoridentitas);
            obj.setAlamat(alamat);
            obj.setNoHp(nohp);
            obj.setIDCustomer(idcustomer);
            
            int data = obj.UpdateCustomer();
            if(data > 0)
            {
                JOptionPane.showMessageDialog(null, "Success" );
                clear();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error" );
            }
            
            
       }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private int Validation(){
        int flag = 0;
        String error = "";
        
        
        if(tx_nama.getText().equals("")){
            flag = 1;
            error += "Nama Tidak Boleh Kosong.\n";
        }
        if(tx_alamat.getText().equals("")){
            flag = 1;
            error += "Alamat Tidak Boleh Kosong.\n";
        }
        if(tx_nomor.getText().equals("")){
            flag = 1;
            error += "No Identitas Tidak Boleh Kosong.\n";
        }
        if(tx_hp.getText().equals("")){
            flag = 1;
            error += "No HP Tidak Boleh Kosong.\n";
        }
        if(flag == 0)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, error);
        }
        return flag;
    }
    
     private int Validation2(){
        int flag = 0;
        String error = "";
        
        
        if(tx_search.getText().equals("")){
            flag = 1;
            error += "ID Customer Tidak Boleh Kosong.\n";
        }
       
        if(flag == 0)
        {
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, error);
        }
        return flag;
    }
     
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
           if(Validation2() == 0){
               popolatetable2();
           }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Customer cs = new Customer();
        cs.setLocationRelativeTo(null);
        cs.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_jenis;
    private javax.swing.JComboBox cb_jk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tx_alamat;
    private javax.swing.JTextField tx_hp;
    private javax.swing.JTextField tx_nama;
    private javax.swing.JTextField tx_nomor;
    private javax.swing.JTextField tx_search;
    // End of variables declaration//GEN-END:variables
}
