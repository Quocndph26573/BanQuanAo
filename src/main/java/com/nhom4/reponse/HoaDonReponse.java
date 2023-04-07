/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.reponse;

import java.sql.Date;
import java.util.List;
import com.nhom4.domain.HoaDon;
import com.nhom4.repository.HDCTRepository;
import java.math.BigDecimal;

/**
 *
 * @author ACER
 */
public class HoaDonReponse {

    private final HDCTRepository hDCTRepository;
    private int MAHD;
    private String NHANVIEN;
    private String KHACHHANG;
    private Date ngayTao;
    private int trangThai;
    private BigDecimal tongTien;

    public HoaDonReponse() {
        hDCTRepository = new HDCTRepository();
    }

    public HoaDonReponse(HoaDon hoaDon) {
        hDCTRepository = new HDCTRepository();
        if (hoaDon.getKhachHang() == null) {
            this.MAHD = hoaDon.getMAHD();
            this.NHANVIEN = hoaDon.getUsertt().getHOTEN();
            this.KHACHHANG = "";
            this.ngayTao = hoaDon.getNgayTao();
            this.trangThai = hoaDon.getTinhTrang();
            this.tongTien = hoaDon.getTongTien();
        } else {
            this.MAHD = hoaDon.getMAHD();
            this.NHANVIEN = hoaDon.getUsertt().getHOTEN();
            this.KHACHHANG = hoaDon.getKhachHang().getTENKH();
            this.ngayTao = hoaDon.getNgayTao();
            this.trangThai = hoaDon.getTinhTrang();
            this.tongTien = hoaDon.getTongTien();
        }

    }

    public int getMAHD() {
        return MAHD;
    }

    public void setMAHD(int MAHD) {
        this.MAHD = MAHD;
    }

    public String getNHANVIEN() {
        return NHANVIEN;
    }

    public void setNHANVIEN(String NHANVIEN) {
        this.NHANVIEN = NHANVIEN;
    }

    public String getKHACHHANG() {
        return KHACHHANG;
    }

    public void setKHACHHANG(String KHACHHANG) {
        this.KHACHHANG = KHACHHANG;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public String layTrangThai(int trangThai1) {
        if (trangThai1 == 0) {
            return "Chờ Order";
        } else if (trangThai1 == 1) {
            return "Chờ Xác Nhận";
        } else {
            return "Hoàn Thành";
        }
    }
    
//    public BigDecimal tinhTien(BigDecimal tongTien) {
//        HDCTReponse hdct = new HDCTReponse();
//
//        return tongTien= hdct.getSoLuong()*hdct.getDonGia();
//    }

    
//    public String layBan(int maHD) {
//        List<Integer> list = hDCTRepository.getBanByMaHD(maHD);
//        String chuoi = "";
//        for (int i = 0; i < list.size(); i++) {
//            int maban = list.get(i);
//            String maban2 = String.valueOf(maban);
//            chuoi = chuoi + " " + maban2;
//        }
//        return chuoi;
//    }
//
}
