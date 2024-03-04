/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Doctor;
import model.Doctor;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author hp
 */
public class DoctorDao {
    public Doctor recordDoctor(Doctor doctorObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.save(doctorObj);
            ss.beginTransaction().commit();
            ss.close();
            return doctorObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
   public Doctor updateDoctor(Doctor doctorObj) {
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();

        // Merge the detached doctorObj with the persistent state
        Doctor updatedDoctor = (Doctor) ss.merge(doctorObj);

        ss.getTransaction().commit();
        ss.close();

        return updatedDoctor;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

    public Doctor deleteDoctor(Doctor doctorObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.beginTransaction();
            Doctor persistentDoctor = (Doctor) ss.get(Doctor.class, doctorObj.getId());

        if (persistentDoctor != null) {
            ss.delete(persistentDoctor);
            ss.getTransaction().commit();
        }

        ss.close();

        return persistentDoctor;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Doctor searchDoctor (int doctorId){
      try{  
          Session ss = NewHibernateUtil.getSessionFactory().openSession();
          Doctor theDoctor = (Doctor) ss.get(Doctor.class, doctorId);
     
       ss.close();
       return theDoctor;
      }catch(Exception ex){
          ex.printStackTrace();
      }
        return null;
    }
    public List<Doctor> retrieveAllDoctor(){
        try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            List<Doctor> doctor = ss.createQuery("select theDoctor from Doctor theDoctor").list();
            ss.close();
            return doctor;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Doctor loginUser(String email, String password) {
        try {
            Session ss = NewHibernateUtil.getSessionFactory().openSession();

            // Create an HQL query to retrieve the user with the specified email and password
            String hql = "FROM Doctor WHERE email = :email AND password = :password";
            Query query = ss.createQuery(hql);
            query.setParameter("email", email);
            query.setParameter("password", password);

            // Retrieve the user
            Doctor loggedInDoctor = (Doctor) query.uniqueResult();

            ss.close();

            return loggedInDoctor;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Doctor depDoctor (Doctor doctorObj){
      try{  
          Session ss = NewHibernateUtil.getSessionFactory().openSession();
       Doctor theDoctor = (Doctor)ss.get(Doctor.class, doctorObj.getDepartment());
       ss.close();
       return theDoctor;
      }catch(Exception ex){
          ex.printStackTrace();
      }
        return null;
    }
}
