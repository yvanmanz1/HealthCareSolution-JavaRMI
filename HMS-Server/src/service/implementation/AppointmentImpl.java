/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.AppointmentDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Appointment;
import service.AppointmentService;

/**
 *
 * @author hp
 */
public class AppointmentImpl extends UnicastRemoteObject implements AppointmentService {
    public AppointmentImpl() throws RemoteException{
        super();
    }
    @Override
    public Appointment recordAppointment(Appointment theAppointment) throws RemoteException {
           return dao.recordAppointment(theAppointment);
    }
AppointmentDao dao = new AppointmentDao();
    @Override
    public Appointment updateAppointment(Appointment theAppointment) throws RemoteException {
        return dao.updateAppointment(theAppointment);
    }

    @Override
    public Appointment deleteAppointment(Appointment theAppointment) throws RemoteException {
         return dao.deleteAppointment(theAppointment);
    }

    @Override
    public Appointment searchAppointment(Appointment theAppointment) throws RemoteException {
       return dao.searchAppointment(theAppointment);
    }

    @Override
    public List<Appointment> retrieveAllAppointment() throws RemoteException {
         return dao.retrieveAllAppointment();    
    }

    @Override
    public List<Appointment> getAppointmentsByDoctorId(int doctorId) throws RemoteException {
           return dao.getAppointmentsByDoctorId(doctorId);
    }

   
}
