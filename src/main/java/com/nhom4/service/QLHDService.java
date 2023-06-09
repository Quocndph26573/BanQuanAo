/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nhom4.service;

import java.util.List;
import com.nhom4.domain.HoaDon;
import com.nhom4.reponse.HoaDonReponse;

/**
 *
 * @author ACER
 */
public interface QLHDService {

    List<HoaDonReponse> getAll();

    boolean createHD(HoaDon hoaDon);

    boolean updateHD(int maHD);

    List<HoaDonReponse> getAllHDByTinhTrangCXN();

    boolean updateHDThanhCong(int maHD);

    List<HoaDonReponse> getAll1();

    HoaDonReponse getHDByMa(int ma);

    List<HoaDonReponse> getAllHDByTinhTrang(int tinhTrang);
    
    boolean updateHDBySdt(int maHD, String sdt);

}
