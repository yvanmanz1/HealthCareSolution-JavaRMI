/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.MedDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.MedicalRecord;
import service.MedicalRecordService;

/**
 *
 * @author hp
 */
public class MedicalRecordImpl extends UnicastRemoteObject implements MedicalRecordService {
    public MedicalRecordImpl() throws RemoteException{
        super();
    }
    @Override
    public MedicalRecord recordMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException {
           return dao.recordMedicalRecord(theMedicalRecord);
    }
MedDao dao = new MedDao();
    @Override
    public MedicalRecord updateMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException {
        return dao.updateMedicalRecord(theMedicalRecord);
    }

    @Override
    public MedicalRecord deleteMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException {
         return dao.deleteMedicalRecord(theMedicalRecord);
    }

    @Override
    public MedicalRecord searchMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException {
       return dao.searchMedicalRecord(theMedicalRecord);
    }

    @Override
    public List<MedicalRecord> retrieveAllMedicalRecord() throws RemoteException {
         return dao.retrieveAllMedicalRecord();    
    }

    @Override
    public List<MedicalRecord> getMedicByUserId(int userId) throws RemoteException {
              return dao.getMedicByUserId(userId);
             }

   
}
