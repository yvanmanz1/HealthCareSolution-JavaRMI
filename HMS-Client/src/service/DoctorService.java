/*
 * To change this license header, choose Doctor Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Doctor;

/**
 *
 * @author hp
 */
public interface DoctorService extends Remote {
     Doctor recordDoctor(Doctor theDoctor) throws RemoteException; 
    Doctor updateDoctor(Doctor theDoctor) throws RemoteException; 
    Doctor deleteDoctor(Doctor theDoctor) throws RemoteException; 
    Doctor searchDoctor(int doctorId) throws RemoteException;
    List<Doctor> retrieveAllDoctor() throws RemoteException; 
    Doctor loginUser(String email, String password) throws RemoteException; 
    Doctor depDoctor(Doctor theDoctor) throws RemoteException;
}
