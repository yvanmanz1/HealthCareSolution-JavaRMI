/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.DoctorDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Doctor;
import service.DoctorService;

/**
 *
 * @author hp
 */
public class DoctorImpl extends UnicastRemoteObject implements DoctorService {
    public DoctorImpl() throws RemoteException{
        super();
    }
    @Override
    public Doctor recordDoctor(Doctor theDoctor) throws RemoteException {
           return dao.recordDoctor(theDoctor);
    }
DoctorDao dao = new DoctorDao();
    @Override
    public Doctor updateDoctor(Doctor theDoctor) throws RemoteException {
        return dao.updateDoctor(theDoctor);
    }

    @Override
    public Doctor deleteDoctor(Doctor theDoctor) throws RemoteException {
         return dao.deleteDoctor(theDoctor);
    }

    @Override
    public Doctor searchDoctor(int doctorId) throws RemoteException {
       return dao.searchDoctor(doctorId);
    }

    @Override
    public List<Doctor> retrieveAllDoctor() throws RemoteException {
         return dao.retrieveAllDoctor();    
    }

    @Override
    public Doctor loginUser(String email, String password) throws RemoteException {
            return dao.loginUser(email, password);   
    }

    @Override
    public Doctor depDoctor(Doctor theDoctor) throws RemoteException {
              return dao.depDoctor(theDoctor);
    }
}
