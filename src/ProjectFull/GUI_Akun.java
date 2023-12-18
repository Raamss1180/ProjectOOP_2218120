/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectFull;

//masukkan semua import di bawah
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_Akun extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Akun
     */
    public GUI_Akun() {
        initComponents();
        //masukkan metho tanpil()
        tampil();
    }
    public void batal() {
        txtUser.setText("");
        txtPass.setText("");
        txtEmail.setText("");
        txtDomi.setText("");
        txtHP.setText("");
        txtSekolah.setText("");
    }
    //masukkan conection (public Connection conn;)
    public Connection conn;    

    String user, pass, email, domi, NoHP, Sklh, jk;
    
    //masukkan method itempilih()
    public void itempilih() {
        txtUser.setText(user);
        txtPass.setText(pass);
        txtEmail.setText(email);
        txtDomi.setText(domi);
        txtHP.setText(NoHP);
        txtSekolah.setText(Sklh);
        if (jk.equalsIgnoreCase("L")) {
            RbtnLK.setSelected(true);
        } else {
            RbtnWNT.setSelected(true);
        }
    }
    
    //masukkan method koneksi()
    public void koneksi() throws SQLException {
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/OOP_2218120?user=root&password=");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Akun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(GUI_Akun.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(GUI_Akun.class.getName()).log(Level.SEVERE, null, es);
        }
    }
    
    //masukkan method tampil()
    public void tampil() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("Username");
        tabelhead.addColumn("Password");
        tabelhead.addColumn("Email");
        tabelhead.addColumn("Gender");
        tabelhead.addColumn("Domisili");
        tabelhead.addColumn("No HP");
        tabelhead.addColumn("Asal Sekolah");
        try {
            koneksi();
            String sql = "SELECT * FROM tb_akun";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                tabelhead.addRow(new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8),});
            }
            tableInfo.setModel(tabelhead);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
        }
    }
    
    //masukkan method delete()
    public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ?", 
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE FROM tb_akun WHERE username='" + txtUser.getText() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
                batal();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus");
            }
        }
        refresh();
    }
    
    //masukkan method cari()
    public void cari() {
        try {
            try ( Statement statement = conn.createStatement()) {
                String sql = "SELECT * FROM tb_akun WHERE `username`  LIKE '%" + txtSearch.getText() + "%'";
                ResultSet rs = statement.executeQuery(sql); //menampilkan data dari sql query
                if (rs.next()) // .next() = scanner method
                {
                    txtUser.setText(rs.getString(2));
                    txtPass.setText(rs.getString(3));
                    txtEmail.setText(rs.getString(4));
                    String jk = rs.getString(5);
                    if (jk.equalsIgnoreCase("L")) {
                        RbtnLK.setSelected(true);
                    } else {
                        RbtnWNT.setSelected(true);
                    }
                    txtDomi.setText(rs.getString(6));
                    txtHP.setText(rs.getString(7));
                    txtSekolah.setText(rs.getString(8));
                } else {
                    JOptionPane.showMessageDialog(null, "Data yang Anda cari tidak ada");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error." + ex);
        }
    }
    
    //masukkan method update()
    public void update() {
        String User = txtUser.getText();
        String Pass = txtPass.getText();
        String Email = txtEmail.getText();
        String Gender;
        if (RbtnLK.isSelected()) {
            Gender = "L";
        } else {
            Gender = "P";
        }
        String Domi = txtDomi.getText();
        String Nomor = txtHP.getText();
        String Sekolah = txtSekolah.getText();
        String UserLama = user;
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE tb_akun SET username='" + User + "'," + "password='" + Pass + "',"
                    + "email='" + Email + "'" + "gender='" + Gender + "'" + ",domisili='" + Domi + "',no_hp='" + Nomor + "',asal_sekolah='"
                    + Sekolah + "' WHERE username = '" + UserLama + "'");
            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Update Data Akun Berhasil!");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        refresh();
    }
    
    //masukkan method refresh()
    public void refresh() {
        new GUI_Akun().setVisible(true);
        this.setVisible(false);
    }
    
    //masukkan method insert()
    public void insert() {
        String User = txtUser.getText();
        String Pass = txtPass.getText();
        String Email = txtEmail.getText();
        String Gender;
        if (RbtnLK.isSelected()) {
            Gender = "L";
        } else {
            Gender = "P";
        }
        String Domi = txtDomi.getText();
        String Nomor = txtHP.getText();
        String Sekolah = txtSekolah.getText();
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tb_akun (username, password, email, gender, domisili, no_hp, asal_sekolah)"
                    + "VALUES('" + User + "','" + Pass + "','" + Email + "','" + Gender + "','" + Domi + "','" + Nomor + "','" + Sekolah + "')");
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Memasukan Data Akun Baru!" + "\n" + User);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Input Data!");
        }
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupJk = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDomi = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtHP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSekolah = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        RbtnLK = new javax.swing.JRadioButton();
        RbtnWNT = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnBTL = new javax.swing.JButton();
        btnCLS = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnPaket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Domisili");

        btnsimpan.setText("simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        jLabel7.setText("No HP");

        jLabel8.setText("Asal Sekolah");

        txtSekolah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSekolahActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("BUAT AKUN SISWA");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Email");

        RbtnLK.setText("Laki - Laki");

        RbtnWNT.setText("Perempuan");

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Email", "Gender", "Domisili", "NoHp", "Asal Sekolah"
            }
        ));
        tableInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableInfo);
        if (tableInfo.getColumnModel().getColumnCount() > 0) {
            tableInfo.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        btnHapus.setText("hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBTL.setText("batal");
        btnBTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBTLActionPerformed(evt);
            }
        });

        btnCLS.setText("keluar");
        btnCLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLSActionPerformed(evt);
            }
        });

        btnSearch.setText("Search 🔍");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPaket.setText("Form Paket");
        btnPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail)
                                .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(txtUser))
                            .addComponent(RbtnLK, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RbtnWNT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHP)
                            .addComponent(txtSekolah)
                            .addComponent(txtDomi, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnsimpan)
                            .addGap(18, 18, 18)
                            .addComponent(btnHapus)
                            .addGap(18, 18, 18)
                            .addComponent(btnBTL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCLS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPaket))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(413, 413, 413))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(RbtnLK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RbtnWNT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(btnsimpan)
                            .addComponent(btnHapus)
                            .addComponent(btnBTL)
                            .addComponent(btnCLS)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPaket)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
       insert();
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void txtSekolahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSekolahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSekolahActionPerformed

    private void btnCLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLSActionPerformed
        dispose();
    }//GEN-LAST:event_btnCLSActionPerformed

    private void btnBTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBTLActionPerformed
        batal();
    }//GEN-LAST:event_btnBTLActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
       /*DefaultTableModel dataModel = (DefaultTableModel) tableInfo.getModel();
       int rowCount = dataModel.getRowCount();
       while(rowCount > 0){
           dataModel.removeRow(rowCount - 1);
           rowCount = dataModel.getRowCount();
       }*/
       delete();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoMouseClicked
        // TODO add your handling code here:
        //masukkan source code onclick pada tabel
        int tabel = tableInfo.getSelectedRow();
        user  = tableInfo.getValueAt(tabel, 0).toString();
        pass  = tableInfo.getValueAt(tabel, 1).toString();
        email = tableInfo.getValueAt(tabel, 2).toString();
        jk    = tableInfo.getValueAt(tabel, 3).toString();
        domi  = tableInfo.getValueAt(tabel, 4).toString();
        NoHP  = tableInfo.getValueAt(tabel, 5).toString();
        Sklh  = tableInfo.getValueAt(tabel, 6).toString();
        itempilih();
    }//GEN-LAST:event_tableInfoMouseClicked

    private void btnPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaketActionPerformed
        // TODO add your handling code here:
        new GUI_Paket().setVisible(true);
    }//GEN-LAST:event_btnPaketActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Akun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbtnLK;
    private javax.swing.JRadioButton RbtnWNT;
    private javax.swing.JButton btnBTL;
    private javax.swing.JButton btnCLS;
    private javax.swing.ButtonGroup btnGroupJk;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnPaket;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableInfo;
    private javax.swing.JTextField txtDomi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSekolah;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
