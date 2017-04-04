/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemparkirclient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import object.IClient;

/**
 *
 * @author Kid
 */
public class UpdateAdmin extends javax.swing.JFrame {

    /**
     * Creates new form UpdateAdmin
     */
    public UpdateAdmin() {
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

        jLabel2 = new javax.swing.JLabel();
        tx_nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tx_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tx_password = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_jk = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        tx_search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trajan Pro 3", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update admin");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 30, 320, 37);

        tx_nama.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        getContentPane().add(tx_nama);
        tx_nama.setBounds(180, 140, 170, 21);

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 150, 35, 15);

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 180, 98, 17);

        tx_username.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        getContentPane().add(tx_username);
        tx_username.setBounds(180, 180, 170, 21);

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 220, 63, 17);

        tx_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(tx_password);
        tx_password.setBounds(180, 220, 170, 23);

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jenis Kelamin");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 260, 79, 15);

        cb_jk.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        cb_jk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pria", "Wanita" }));
        getContentPane().add(cb_jk);
        cb_jk.setBounds(180, 260, 170, 21);

        jButton1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 340, 90, 23);

        tx_search.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        getContentPane().add(tx_search);
        tx_search.setBounds(60, 100, 107, 21);

        jButton2.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jButton2.setText("Search ID");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 100, 90, 23);

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 300, 36, 15);

        cb_status.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        cb_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aktif", "tidak aktif" }));
        getContentPane().add(cb_status);
        cb_status.setBounds(180, 300, 170, 21);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(320, 80, 55, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kid\\Documents\\NetBeansProjects\\SistemParkirClient\\src\\imgprk\\2560x1440-black-solid-color-background.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     private void popolatetable2()
    {
        try 
        {
            
           Registry reg = LocateRegistry.getRegistry("127.0.0.1", 9999);
            IClient obj = (IClient) reg.lookup("log");
            String idadmin  = tx_search.getText();
            obj.setIDAdmin(idadmin);
            
           ArrayList data = obj.getAdminID();
           
           if (!data.isEmpty())
           {
                JOptionPane.showMessageDialog(null, "Data Found" );
                tx_nama.setText(data.get(1).toString());
                tx_username.setText(data.get(2).toString());
                tx_password.setText(data.get(3).toString());
                cb_status.setSelectedItem(data.get(6).toString());
                cb_jk.setSelectedItem(data.get(4).toString());

           }
           else{
                   JOptionPane.showMessageDialog(null, "Data Not Found" );
           }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
     private void updateadmin(){
         try{
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 9999);
            IClient obj = (IClient) reg.lookup("log");
            
            String idadmin = tx_search.getText();
            String nama = tx_nama.getText();
            String username = tx_username.getText();
            String password = tx_password.getText();
            String jk = cb_jk.getSelectedItem().toString();
            String status = cb_status.getSelectedItem().toString();
            
            
            obj.setNama(nama);
            obj.setUsername(username);
            obj.setPassword(password);
            obj.setJenisKelamin(jk);
            obj.setStatus(status);
            obj.setIDAdmin(idadmin);
            
            int data = obj.UpdateAdmin();
            if(data > 0)
            {
                JOptionPane.showMessageDialog(null, "Success" );
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error" );
            }
            
            
       }
        catch(Exception e){
            System.out.println(e);
        }
     }
     
     private int Validation(){
        int flag = 0;
        String error = "";
        
        
        if(tx_nama.getText().equals("")){
            flag = 1;
            error += "Nama Tidak Boleh Kosong.\n";
        }
        if(tx_username.getText().equals("")){
            flag = 1;
            error += "Username Tidak Boleh Kosong.\n";
        }
        if(tx_password.getText().equals("")){
            flag = 1;
            error += "Password Tidak Boleh Kosong.\n";
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
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            if(Validation() == 0){
                updateadmin();
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
        try{
            if(Validation2() == 0){
                popolatetable2();
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SuperadminAdmin cs = new SuperadminAdmin();
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
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_jk;
    private javax.swing.JComboBox cb_status;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tx_nama;
    private javax.swing.JTextField tx_password;
    private javax.swing.JTextField tx_search;
    private javax.swing.JTextField tx_username;
    // End of variables declaration//GEN-END:variables
}
