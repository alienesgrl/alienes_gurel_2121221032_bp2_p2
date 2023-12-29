/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fsm.alienes_gurel_2121221032_bp2_p2;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alien
 */
public class OgrenciGirisi extends javax.swing.JFrame {

    ImageIcon iconGeri = new ImageIcon("C:\\Users\\alien\\OneDrive\\Belgeler\\NetBeansProjects\\alienes_gurel_2121221032_bp2_p2\\src\\main\\java\\com\\fsm\\alienes_gurel_2121221032_bp2_p2\\icons\\gerioku.png");
    Image newImg1 = iconGeri.getImage().getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
    ImageIcon newGeriBtn = new ImageIcon(newImg1);
    Main main = new Main();

    /**
     * Creates new form OgrenciGirisi
     */
    public OgrenciGirisi() {
        initComponents();
        this.setTitle("LOGIN");
        btn_geri.setIcon(newGeriBtn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_ogrenciGirisi = new javax.swing.JPanel();
        txt_ogrenciEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_ogrenciGirisYap = new javax.swing.JButton();
        btn_ogrenciKayitOl = new javax.swing.JButton();
        chcbx_ogrenciSifreGoster = new javax.swing.JCheckBox();
        txtp_ogrenciParola = new javax.swing.JPasswordField();
        btn_geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));

        pnl_ogrenciGirisi.setBackground(new java.awt.Color(0, 51, 51));
        pnl_ogrenciGirisi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OGRENCI GIRISI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        pnl_ogrenciGirisi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_ogrenciEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_ogrenciEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ogrenciEmailActionPerformed(evt);
            }
        });
        pnl_ogrenciGirisi.add(txt_ogrenciEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 200, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-MAIL");
        pnl_ogrenciGirisi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 95, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAROLA");
        pnl_ogrenciGirisi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 95, -1));

        btn_ogrenciGirisYap.setBackground(new java.awt.Color(0, 51, 51));
        btn_ogrenciGirisYap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_ogrenciGirisYap.setForeground(new java.awt.Color(255, 255, 255));
        btn_ogrenciGirisYap.setText("GIRIS YAP");
        btn_ogrenciGirisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrenciGirisYapActionPerformed(evt);
            }
        });
        pnl_ogrenciGirisi.add(btn_ogrenciGirisYap, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 200, 50));

        btn_ogrenciKayitOl.setBackground(new java.awt.Color(255, 102, 102));
        btn_ogrenciKayitOl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_ogrenciKayitOl.setForeground(new java.awt.Color(255, 255, 255));
        btn_ogrenciKayitOl.setText("KAYIT OL");
        btn_ogrenciKayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrenciKayitOlActionPerformed(evt);
            }
        });
        pnl_ogrenciGirisi.add(btn_ogrenciKayitOl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 330, 30));

        chcbx_ogrenciSifreGoster.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        chcbx_ogrenciSifreGoster.setForeground(new java.awt.Color(204, 0, 51));
        chcbx_ogrenciSifreGoster.setText("Sifreyi Goster");
        chcbx_ogrenciSifreGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcbx_ogrenciSifreGosterActionPerformed(evt);
            }
        });
        pnl_ogrenciGirisi.add(chcbx_ogrenciSifreGoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 120, -1));

        txtp_ogrenciParola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtp_ogrenciParolaActionPerformed(evt);
            }
        });
        pnl_ogrenciGirisi.add(txtp_ogrenciParola, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 50));

        btn_geri.setBackground(new java.awt.Color(0, 51, 51));
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });
        pnl_ogrenciGirisi.add(btn_geri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        getContentPane().add(pnl_ogrenciGirisi, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ogrenciEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ogrenciEmailActionPerformed

    }//GEN-LAST:event_txt_ogrenciEmailActionPerformed

    private void chcbx_ogrenciSifreGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcbx_ogrenciSifreGosterActionPerformed
        if (chcbx_ogrenciSifreGoster.isSelected()) {//sifre gosterme
            txtp_ogrenciParola.setEchoChar((char) 0);
        } else {
            txtp_ogrenciParola.setEchoChar('*');
        }
    }//GEN-LAST:event_chcbx_ogrenciSifreGosterActionPerformed

    private void txtp_ogrenciParolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtp_ogrenciParolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtp_ogrenciParolaActionPerformed

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_geriActionPerformed

    private void btn_ogrenciKayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrenciKayitOlActionPerformed
        KayitOlOgrenci ogrenciKayitOl = new KayitOlOgrenci();
        ogrenciKayitOl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ogrenciKayitOlActionPerformed

    private void btn_ogrenciGirisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrenciGirisYapActionPerformed
        String email = txt_ogrenciEmail.getText();
        String parola = new String(txtp_ogrenciParola.getPassword());
        Kullanici kullanici = DB_Ders_Icerik_Takibi.Login(email, parola);
        if (kullanici != null) {
            if (kullanici.kullanici_turu.compareTo("OGRENCI") == 0) {
                OgrenciDersIcerik ogrenciFrame = new OgrenciDersIcerik(kullanici);
                ogrenciFrame.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Basarisiz");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Basarisiz");
        }
    }//GEN-LAST:event_btn_ogrenciGirisYapActionPerformed

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
            java.util.logging.Logger.getLogger(OgrenciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OgrenciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OgrenciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgrenciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgrenciGirisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_ogrenciGirisYap;
    private javax.swing.JButton btn_ogrenciKayitOl;
    private javax.swing.JCheckBox chcbx_ogrenciSifreGoster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnl_ogrenciGirisi;
    private javax.swing.JTextField txt_ogrenciEmail;
    private javax.swing.JPasswordField txtp_ogrenciParola;
    // End of variables declaration//GEN-END:variables
}
