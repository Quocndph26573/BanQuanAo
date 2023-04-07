/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nhom4.service;

import java.util.List;
import com.nhom4.domain.HoaDonChiTiet;
import com.nhom4.reponse.HDCTReponse;

/**
 *
 * @author ACER
 */
public interface HDCTService {

    boolean createHDCT(HDCTReponse hoaDon);

    boolean createHDCT2(HDCTReponse hoaDon);

    List<HoaDonChiTiet> getHDCTByMaHD(int maHD);

    boolean updateHDCT(int maHD, int maSP, int soLuong);

    boolean deleteHDBySPVe0(int maHD, int maSP);

    boolean deleteAll(int maHD);
}
