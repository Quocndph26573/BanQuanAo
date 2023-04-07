/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.domain;

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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HoaDon {

    @Id
    @Column(name = "MAHD")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MAHD;

    @Column(name = "NGAYTAO")
    private Date ngayTao;

    @Column(name = "TINHTRANG")
    private int tinhTrang;

    @Column(name = "TONGTIEN")
    private BigDecimal tongTien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANV", referencedColumnName = "MANV")
    private USERTT usertt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKH", referencedColumnName = "MAKH")
    private KhachHang khachHang;


    @Override
    public String toString() {
        return "HoaDon{" + "MAHD=" + MAHD + ", ngayTao=" + ngayTao + ", tinhTrang=" + tinhTrang + ", tongTien=" + tongTien + ", usertt=" + usertt + ", khachHang=" + khachHang + '}';
    }


}
