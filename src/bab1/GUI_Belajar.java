/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab1;

/**
 *
 * @author Naufal whildan
 */
public class GUI_Belajar extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Belajar
     */
    public GUI_Belajar() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMateri = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtJam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPeng = new javax.swing.JTextField();
        btnCETAK = new javax.swing.JToggleButton();
        txtMapel = new javax.swing.JTextField();
        btnCLOSE = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnReset = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        memoCetak = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bimbingan Belajar Online");

        jLabel5.setText("Materi Yang Dibahas");

        jLabel6.setText("Harga Bimbingan");

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        jLabel7.setText("Jam Belajar");

        txtJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Pengajar");

        btnCETAK.setText("Cetak");
        btnCETAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCETAKActionPerformed(evt);
            }
        });

        txtMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMapelActionPerformed(evt);
            }
        });

        btnCLOSE.setText("Close");
        btnCLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLOSEActionPerformed(evt);
            }
        });

        jLabel4.setText("Mata Pelajaran");

        jLabel8.setText("Nama Murid");

        jLabel9.setText("Id Murid");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        memoCetak.setColumns(20);
        memoCetak.setRows(5);
        jScrollPane1.setViewportView(memoCetak);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(183, 183, 183))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(92, 92, 92))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(71, 71, 71)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHarga)
                                    .addComponent(txtMapel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMateri)
                                    .addComponent(txtPeng, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCETAK)
                                .addGap(35, 35, 35)
                                .addComponent(btnReset)
                                .addGap(33, 33, 33)
                                .addComponent(btnCLOSE)
                                .addGap(0, 39, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPeng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMateri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCETAK)
                    .addComponent(btnReset)
                    .addComponent(btnCLOSE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJamActionPerformed

    private void btnCETAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCETAKActionPerformed
        memoCetak.setText("");
        infoData Bljr = new  infoData();
     
        Bljr.Murid    = (txtNama.getText());
        Bljr.Id       = (txtID.getText());
        Bljr.Pengajar = (txtPeng.getText());
        Bljr.Mapel    = (txtMapel.getText());
        Bljr.Materi   = (txtMateri.getText());
        Bljr.Harga    = (Integer.parseInt(txtHarga.getText()));
        Bljr.Jam      = (txtJam.getText());

        memoCetak.append(" Pembelajaran Online (Zenius)\n");
        memoCetak.append("+============================+\n");
        memoCetak.append("Nama Murid          : "+ Bljr.cetakMurid()+"\n");
        memoCetak.append("Id Murid            : "+ Bljr.cetakId()+"\n");
        memoCetak.append("Nama Pengajar       : "+ Bljr.cetakPengajar()+"\n");
        memoCetak.append("Mata Pelajaran      : "+ Bljr.cetakMapel()+"\n");
        memoCetak.append("Materi Yang Dibahas : "+ Bljr.cetakMateri()+"\n");
        memoCetak.append("Harga Bimbingan     : "+ Bljr.cetakHarga()+"\n");
        memoCetak.append("Jam Belajar         : "+ Bljr.cetakJam()+"\n");
        memoCetak.append("Nilai Hasil Belajar : "+ Bljr.NilaiBljr()+"\n");
    }//GEN-LAST:event_btnCETAKActionPerformed

    private void txtMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMapelActionPerformed

    private void btnCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLOSEActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCLOSEActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        memoCetak.setText(" ");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Belajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Belajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Belajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Belajar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Belajar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCETAK;
    private javax.swing.JToggleButton btnCLOSE;
    private javax.swing.JToggleButton btnReset;
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
    private javax.swing.JTextArea memoCetak;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJam;
    private javax.swing.JTextField txtMapel;
    private javax.swing.JTextField txtMateri;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPeng;
    // End of variables declaration//GEN-END:variables
}
