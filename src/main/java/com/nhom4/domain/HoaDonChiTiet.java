/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.domain;

import com.nhom4.domain.HoaDon;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ACER
 */
@Table
@Entity
@Setter
@Getter
@ToString

public class HoaDonChiTiet {

    @Id
    @Column(name = "MAHOADONCT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MAHOADONCT;

    @Column(name = "SOLUONG")
    private int SOLUONG;

    @Column(name = "DONGIA")
    private BigDecimal DONGIA;

    @Column(name = "MOTA")
    private String MOTA;

    @Column(name = "THANHTIEN")
    private BigDecimal thanhTien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAHD", referencedColumnName = "MAHD")
    private HoaDon hoaDon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MASP", referencedColumnName = "MASP")
    private SanPham sanPham;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKM", referencedColumnName = "MAKM")
    private KhuyenMai khuyenMai;


    public HoaDonChiTiet() {
    }

//    public HoaDonChiTiet(HoaDon hoaDon, Ban ban) {
//        this.hoaDon = hoaDon;
//        this.ban = ban;
//    }

    public HoaDonChiTiet(int MAHOADONCT, int SOLUONG, BigDecimal DONGIA, String MOTA, BigDecimal thanhTien, HoaDon hoaDon, SanPham sanPham) {
        this.MAHOADONCT = MAHOADONCT;
        this.SOLUONG = SOLUONG;
        this.DONGIA = DONGIA;
        this.MOTA = MOTA;
        this.thanhTien = thanhTien;
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
    }

    public HoaDonChiTiet(int soLuong, BigDecimal donGia, HoaDon hdByMa, SanPham spByMa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public HoaDonChiTiet(HoaDon hdByMa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
