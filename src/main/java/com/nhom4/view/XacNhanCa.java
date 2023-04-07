/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nhom4.view;

import com.nhom4.domain.GiaoCa;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import com.nhom4.service.GiaoCaService;
import com.nhom4.service.UserTTService;
import com.nhom4.service.impl.GiaoCaIplm;
import com.nhom4.service.impl.UserTTServiceIplm;

/**
 *
 * @author ACER
 */
public class XacNhanCa extends javax.swing.JFrame {

    private final GiaoCaService giaoCaService;
    private final UserTTService userTTService;
    int ma1 = 0;

    /**
     * Creates new form XacNhanCa
     */
    public XacNhanCa(int ma) {
        initComponents();
        ma1 = ma;
        giaoCaService = new GiaoCaIplm();
        userTTService = new UserTTServiceIplm();
        List<GiaoCa> list = giaoCaService.getGiaoCaMoiNhat();
        BigDecimal gc = list.get(0).getTONGTIENTRONGCA();
        double db = gc.doubleValue();
        BigDecimal tienBD = new BigDecimal(db);
        String tienBD2 = String.valueOf(tienBD);
        lblTGBD.setText(java.time.LocalTime.now().getHour() + ":" + java.time.LocalTime.now().getMinute() + "  " + java.time.LocalDate.now());
        lblTBD.setText(tienBD2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTGBD = new javax.swing.JLabel();
        lblTBD = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Xác Nhận Ca");

        jLabel2.setText("Thời Gian Bắt Đầu:");

        jLabel3.setText("Tiền Bắt Đầu:");

        lblTGBD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblTBD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jButton1.setText("Xác Nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hủy");

        jLabel4.setText("Nhân viên nhận ca");

        jLabel5.setText("Nhân viên giao ca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addComponent(lblTGBD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(lblTBD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(131, 131, 131))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTGBD, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTBD, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        List<GiaoCa> list = giaoCaService.getGiaoCaMoiNhat();
        GiaoCa gc1 = new GiaoCa();
        int maCa = list.get(0).getMACA();
        gc1.setMACA(maCa);
        gc1.setUsertt1(userTTService.getUSerByMaNV(ma1));
        giaoCaService.updateGC1(gc1);
        GiaoCa gc = new GiaoCa();
        gc.setTHOIGIANNHANCA(java.time.LocalDateTime.now());
        double db = Double.parseDouble(lblTBD.getText());
        BigDecimal bd = new BigDecimal(db);
        gc.setTIENBANDAU(bd);
        gc.setTRANGTHAI(0);
        gc.setUsertt(userTTService.getUSerByMaNV(ma1));
        giaoCaService.createGC(gc);
        BanHang bh = new BanHang(ma1);
        bh.show();
        bh.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblTBD;
    private javax.swing.JLabel lblTGBD;
    // End of variables declaration//GEN-END:variables
}