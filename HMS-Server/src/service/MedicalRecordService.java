/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.MedicalRecord;

/**
 *
 * @author hp
 */
public interface MedicalRecordService extends Remote {
    MedicalRecord recordMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException; 
    MedicalRecord updateMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException; 
    MedicalRecord deleteMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException; 
    MedicalRecord searchMedicalRecord(MedicalRecord theMedicalRecord) throws RemoteException;
    List<MedicalRecord> retrieveAllMedicalRecord() throws RemoteException; 
    List<MedicalRecord> getMedicByUserId(int userId) throws RemoteException;
}
