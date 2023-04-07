/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.repository;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.nhom4.domain.LoaiSP;
import com.nhom4.hibernateconfig.HibernateUtil;
import org.hibernate.Transaction;

/**
 *
 * @author ACER
 */
public class LoaiSPRepository {

    public List<String> getLoaiSp() {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From LoaiSP");
        List<LoaiSP> list = query.getResultList();
        List<String> list1 = new ArrayList<>();
        for (LoaiSP loaiSP : list) {
            list1.add(loaiSP.getTenLoaiSP());
        }
        return list1;
    }
    
        public boolean createLoaiSP(LoaiSP loaiSP) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.persist(loaiSP);
            transaction.commit();
            getLoaiSp();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

       public boolean update(LoaiSP loaiSP) {
        Transaction transaction = null;
        try (
                 Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(loaiSP);
            transaction.commit();
            getLoaiSp();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    public Boolean delete(LoaiSP loaiSP) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.delete(loaiSP);
            transaction.commit();
            getLoaiSp();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

}
