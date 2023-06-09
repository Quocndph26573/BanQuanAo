/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nhom4.view;

import java.math.BigDecimal;
import java.util.List;
import com.nhom4.domain.GiaoCa;
import com.nhom4.service.GiaoCaService;
import com.nhom4.service.impl.GiaoCaIplm;

/**
 *
 * @author ACER
 */
public class GiaoCaView extends javax.swing.JFrame {

    private final GiaoCaService giaoCaService;

    /**
     * Creates new form GiaoCaView
     */
    int tienBanDuoc;

    public GiaoCaView(int tienBanDuocTrongCa, String TGBD) {
        initComponents();

        giaoCaService = new GiaoCaIplm();
        List<GiaoCa> list = giaoCaService.getGiaoCaMoiNhat();

        int maCa = list.get(0).getMACA();
        double db = list.get(0).getTIENBANDAU().doubleValue();

        BigDecimal tienBD = new BigDecimal(db);
        String st = tienBD.toString();
        Integer int1 = Integer.parseInt(st);
        String maCa2 = String.valueOf(maCa);
        lblCa.setText(maCa2);
        lblTGKT.setText(java.time.LocalTime.now().getHour() + ":" + java.time.LocalTime.now().getMinute() + "  " + java.time.LocalDate.now());
        lblTGBD.setText(TGBD);
        lblTienBD.setText(st);
        int tongTien = int1 + tienBanDuocTrongCa;
        tienBanDuoc = tongTien;
        String tongTien2 = String.valueOf(tongTien);
        lblTongTien.setText(tongTien2);
        lblTienChuThu.setText("0 đ");
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblCa = new javax.swing.JLabel();
        lblTGBD = new javax.swing.JLabel();
        lblTGKT = new javax.swing.JLabel();
        lblTienBD = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        lblTienChuThu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTienChuThu1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTienChuThu2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Giao Ca");

        jLabel2.setText("Mã Ca:");

        jLabel3.setText("Thời Gian Bắt Đầu:");

        jLabel4.setText("Thời Gian Kết Thúc:");

        jLabel5.setText("Tiền Ban Đầu:");

        jLabel6.setText("Tổng Tiền Ca Hiện Có:");

        jLabel7.setText("Tiền Chủ Thu:");

        jButton1.setText("Reset Ca");

        jButton2.setText("Xác Nhận");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hủy");

        lblCa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCa.setText("jLabel8");

        lblTGBD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTGBD.setText("jLabel9");

        lblTGKT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTGKT.setText("jLabel10");

        lblTienBD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTienBD.setText("jLabel11");

        lblTongTien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien.setText("jLabel12");

        lblTienChuThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTienChuThu.setText("jLabel13");

        jLabel8.setText("Nhân viên giao");

        lblTienChuThu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTienChuThu1.setText("jLabel14");

        jLabel9.setText("Nhân viên nhận");

        lblTienChuThu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTienChuThu2.setText("jLabel15");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTGKT, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(lblTGBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTienBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTienChuThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTienChuThu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTienChuThu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(46, 46, 46)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTGBD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTGKT))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTienBD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTongTien))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblTienChuThu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTienChuThu1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblTienChuThu2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GiaoCa gc = new GiaoCa();
        gc.setTHOIGIANGIAOCA(java.time.LocalDateTime.now());
        String tien = String.valueOf(tienBanDuoc);
        double db = Double.parseDouble(tien);
        BigDecimal bd = new BigDecimal(db);
        Integer maCa = Integer.parseInt(lblCa.getText());
        gc.setMACA(maCa);
        gc.setTONGTIENTRONGCA(bd);
        gc.setTRANGTHAI(0);
        giaoCaService.updateGC(gc);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lblCa;
    private javax.swing.JLabel lblTGBD;
    private javax.swing.JLabel lblTGKT;
    private javax.swing.JLabel lblTienBD;
    private javax.swing.JLabel lblTienChuThu;
    private javax.swing.JLabel lblTienChuThu1;
    private javax.swing.JLabel lblTienChuThu2;
    private javax.swing.JLabel lblTongTien;
    // End of variables declaration//GEN-END:variables
}
