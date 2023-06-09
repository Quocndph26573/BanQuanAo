/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.reponse;

import com.nhom4.domain.ChucVu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author FPT Shop
 */
@Getter
@Setter
public class ChucVuReponse {

    private Integer maCV;
    private String tenCV;

    public ChucVuReponse() {
    }

    public ChucVuReponse(ChucVu chucVu) {
        this.maCV = chucVu.getMACV();
        this.tenCV = chucVu.getTENCV();
    }

    @Override
    public String toString() {
        return tenCV;
    }

}
