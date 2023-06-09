/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.service.impl;

import com.nhom4.domain.ChucVu;
import com.nhom4.domain.USERTT;
import com.nhom4.reponse.ChucVuReponse;
import com.nhom4.reponse.UserTTReponse;
import com.nhom4.repository.ChucVuRepository;
import com.nhom4.service.ChucVuService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public class ChucVuServiceImpl implements ChucVuService {

    @Override
    public List<ChucVuReponse> getAllChucVus() {
        List<ChucVu> lists = new ChucVuRepository().getAll();
        // B2: convert list từ reposotory sang list response
        List<ChucVuReponse> lst = new ArrayList<>();
//        return lists.stream().map(UserTTReponse::new).collect(Collectors.toList());
        for (ChucVu x : lists) {
            ChucVuReponse reponse = new ChucVuReponse(x);
            lst.add(reponse);
        }
        return lst;
    }

}
