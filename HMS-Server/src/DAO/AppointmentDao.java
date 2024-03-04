/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Appointment;
import org.hibernate.Session;

/**
 *
 * @author hp
 */
public class AppointmentDao {
    public Appointment recordAppointment(Appointment appointmentObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.save(appointmentObj);
            ss.beginTransaction().commit();
            ss.close();
            return appointmentObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Appointment updateAppointment(Appointment appointmentObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.update(appointmentObj);
            ss.beginTransaction().commit();
            ss.close();
            return appointmentObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Appointment deleteAppointment(Appointment appointmentObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.delete(appointmentObj);
            ss.beginTransaction().commit();
            ss.close();
            return appointmentObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Appointment searchAppointment (Appointment appointmentObj){
      try{  
          Session ss = NewHibernateUtil.getSessionFactory().openSession();
       Appointment theAppointment = (Appointment)ss.get(Appointment.class, appointmentObj.getId());
       ss.close();
       return theAppointment;
      }catch(Exception ex){
          ex.printStackTrace();
      }
        return null;
    }
    public List<Appointment> retrieveAllAppointment(){
        try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            List<Appointment> appointment = ss.createQuery("select theAppointment from Appointment theAppointment").list();
            ss.close();
            return appointment;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Appointment> getAppointmentsByDoctorId(int doctorId) {
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();

        // Assuming "doctor_id" is the column name in the Appointment entity that represents the doctor's ID
        String hql = "FROM Appointment WHERE doctor_id = :doctorId";
        List<Appointment> appointments = ss.createQuery(hql)
            .setParameter("doctorId", doctorId)
            .list();

        ss.close();
        return appointments;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
}
