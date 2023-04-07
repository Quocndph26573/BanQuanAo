/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.service.impl;

import java.util.List;
import com.nhom4.domain.KhachHang;
import com.nhom4.repository.KhachHangRepository;
import poly.nhom4.service.KhachHangService;

/**
 *
 * @author ACER
 */
public class KhachHangServiceIplm implements KhachHangService {

    private final KhachHangRepository khachHangRepository;

    public KhachHangServiceIplm() {
        khachHangRepository = new KhachHangRepository();
    }

    @Override
    public String getTenKhBySdt(String sdt) {
        return khachHangRepository.getTenKhBySdt(sdt);
    }

    @Override
    public KhachHang getKhBySdt(String sdt) {
        return khachHangRepository.getKhBySdt(sdt);
    }

    @Override
    public boolean createKH(KhachHang kh) {
        return khachHangRepository.createKH(kh);
    }

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.getAll();
    }

}
