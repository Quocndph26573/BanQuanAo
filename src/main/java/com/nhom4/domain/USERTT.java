/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.domain;

import com.nhom4.domain.ChucVu;
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

public class USERTT {

    @Id
    @Column(name = "MANV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MANV;

    @Column(name = "HOTEN")
    private String HOTEN;

    @Column(name = "GIOITINH")
    private String GIOITINH;

    @Column(name = "NAMSINH")
    private Integer NAMSINH;

    @Column(name = "SDT")
    private String SDT;

    @Column(name = "TAIKHOAN")
    private String TAIKHOAN;

    @Column(name = "MATKHAU")
    private String MATKHAU;

    @Column(name = "TRANGTHAI")
    private int TRANGTHAI;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MACV", referencedColumnName = "MACV")
    private ChucVu CHUCVU;


}
