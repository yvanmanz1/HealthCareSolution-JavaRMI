/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.MedicalRecord;
import org.hibernate.Session;

/**
 *
 * @author hp
 */
public class MedDao {
    public MedicalRecord recordMedicalRecord(MedicalRecord medObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.save(medObj);
            ss.beginTransaction().commit();
            ss.close();
            return medObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public MedicalRecord updateMedicalRecord(MedicalRecord medObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.update(medObj);
            ss.beginTransaction().commit();
            ss.close();
            return medObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public MedicalRecord deleteMedicalRecord(MedicalRecord medObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.delete(medObj);
            ss.beginTransaction().commit();
            ss.close();
            return medObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public MedicalRecord searchMedicalRecord (MedicalRecord medObj){
      try{  
          Session ss = NewHibernateUtil.getSessionFactory().openSession();
       MedicalRecord theMedicalRecord = (MedicalRecord)ss.get(MedicalRecord.class, medObj.getId());
       ss.close();
       return theMedicalRecord;
      }catch(Exception ex){
          ex.printStackTrace();
      }
        return null;
    }
    public List<MedicalRecord> retrieveAllMedicalRecord(){
        try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            List<MedicalRecord> med = ss.createQuery("select theMedicalRecord from MedicalRecord theMedicalRecord").list();
            ss.close();
            return med;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     public List<MedicalRecord> getMedicByUserId(int userId) {
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();

        String hql = "FROM MedicalRecord WHERE user_id = :userId";
        List<MedicalRecord> records = ss.createQuery(hql)
            .setParameter("userId", userId)
            .list();

        ss.close();
        return records;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
}
