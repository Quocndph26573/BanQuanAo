/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.domain;

import com.nhom4.domain.KhuyenMai;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ACER
 */
@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SanPham {

    @Id
    @Column(name = "MASP")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MASP;

    @Column(name = "GIABAN")
    private BigDecimal GIABAN;

    @Column(name = "MOTA")
    private String MOTA;
    
    @Column(name = "TRANGTHAI")
    private int TRANGTHAI;

    @Column(name = "TENSP")
    private String TENSP;

    @Column(name = "ANHSP")
    private String ANHSP;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKM", referencedColumnName = "MAKM")
    private KhuyenMai KHUYENMAI;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDTHUONGHIEU", referencedColumnName = "IDTHUONGHIEU")
    private ThuongHieu THUONGHIEU;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCHATLIEU", referencedColumnName = "IDCHATLIEU")
    private ChatLieu CHATLIEU;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDSIZE", referencedColumnName = "IDSIZE")
    private Size SIZE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDLOAISP", referencedColumnName = "IDLOAISP")
    private LoaiSP LOAISP;

    @Override
    public String toString() {
        return "SanPham{" + "MASP=" + MASP + ", GIABAN=" + GIABAN + ", MOTA=" + MOTA + ", TRANGTHAI=" + TRANGTHAI + ", TENSP=" + TENSP + ", ANHSP=" + ANHSP + ", KHUYENMAI=" + KHUYENMAI + ", THUONGHIEU=" + THUONGHIEU + ", CHATLIEU=" + CHATLIEU + ", SIZE=" + SIZE + ", LOAISP=" + LOAISP + '}';
    }


}
