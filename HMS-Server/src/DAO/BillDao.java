/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Bill;
import org.hibernate.Session;

/**
 *
 * @author hp
 */
public class BillDao {
    public Bill recordBill(Bill billObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.save(billObj);
            ss.beginTransaction().commit();
            ss.close();
            return billObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Bill updateBill(Bill billObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.update(billObj);
            ss.beginTransaction().commit();
            ss.close();
            return billObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Bill deleteBill(Bill billObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.delete(billObj);
            ss.beginTransaction().commit();
            ss.close();
            return billObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Bill searchBill (Bill billObj){
      try{  
          Session ss = NewHibernateUtil.getSessionFactory().openSession();
       Bill theBill = (Bill)ss.get(Bill.class, billObj.getId());
       ss.close();
       return theBill;
      }catch(Exception ex){
          ex.printStackTrace();
      }
        return null;
    }
    public List<Bill> retrieveAllBill(){
        try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            List<Bill> bill = ss.createQuery("select theBill from Bill theBill").list();
            ss.close();
            return bill;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
