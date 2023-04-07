/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nhom4.service;

import com.nhom4.domain.LoaiSP;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface LoaiSPService {
    List<String> getLoaiSp();
    
    boolean createLoaiSP(LoaiSP loaiSP);
}
