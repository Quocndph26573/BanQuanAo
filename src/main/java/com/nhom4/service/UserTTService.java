/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nhom4.service;

import java.util.List;
import com.nhom4.domain.USERTT;
import com.nhom4.reponse.UserTTReponse;

/**
 *
 * @author ACER
 */
public interface UserTTService {
    USERTT getUSerByMaNV(int maNV);
    List<UserTTReponse> getAllUserTTs();

    UserTTReponse dangNhap(String taiKhoanNhap, String matKhauNhap);

    boolean insertUser(UserTTReponse userReponse);

    boolean updateUser(UserTTReponse userReponse);
}
