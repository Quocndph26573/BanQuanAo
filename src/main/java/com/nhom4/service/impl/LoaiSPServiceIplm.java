/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.service.impl;

import com.nhom4.domain.LoaiSP;
import java.util.List;
import com.nhom4.repository.LoaiSPRepository;
import com.nhom4.service.LoaiSPService;

/**
 *
 * @author ACER
 */
public class LoaiSPServiceIplm implements LoaiSPService{
  private final LoaiSPRepository loaiSPRepository;
    public LoaiSPServiceIplm() {
        loaiSPRepository=new LoaiSPRepository();
    }

    
    @Override
    public List<String> getLoaiSp() {
        return loaiSPRepository.getLoaiSp();
    }

    @Override
    public boolean createLoaiSP(LoaiSP loaiSP) {
        return loaiSPRepository.createLoaiSP(loaiSP);
    }
    
    
}
