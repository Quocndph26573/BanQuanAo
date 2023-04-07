/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.hibernateconfig;

import com.nhom4.domain.ChatLieu;
import com.nhom4.domain.ChucVu;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import com.nhom4.domain.HoaDon;
import com.nhom4.domain.HoaDonChiTiet;
import com.nhom4.domain.KhachHang;
import com.nhom4.domain.KhuyenMai;
import com.nhom4.domain.LoaiSP;
import com.nhom4.domain.SanPham;
import com.nhom4.domain.Size;
import com.nhom4.domain.ThuongHieu;
import com.nhom4.domain.USERTT;

/**
 *
 * @author hangnt
 */
public class HibernateUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=QLBANQA_1");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123456");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(KhuyenMai.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(HoaDonChiTiet.class);
        conf.addAnnotatedClass(USERTT.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(ThuongHieu.class);
        conf.addAnnotatedClass(ChatLieu.class);
        conf.addAnnotatedClass(Size.class);
        conf.addAnnotatedClass(LoaiSP.class);
        
//        conf.addAnnotatedClass(GiaoCa.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }
}
