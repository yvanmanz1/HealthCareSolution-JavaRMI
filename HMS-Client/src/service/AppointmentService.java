/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Appointment;

/**
 *
 * @author hp
 */
public interface AppointmentService extends Remote{
    Appointment recordAppointment(Appointment theAppointment) throws RemoteException; 
    Appointment updateAppointment(Appointment theAppointment) throws RemoteException; 
    Appointment deleteAppointment(Appointment theAppointment) throws RemoteException; 
    Appointment searchAppointment(Appointment theAppointment) throws RemoteException;
    List<Appointment> retrieveAllAppointment() throws RemoteException; 
    List<Appointment> getAppointmentsByDoctorId(int doctorId) throws RemoteException;
}
