/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Bill;

/**
 *
 * @author hp
 */
public interface BillService extends Remote {
    Bill recordBill(Bill theBill) throws RemoteException; 
    Bill updateBill(Bill theBill) throws RemoteException; 
    Bill deleteBill(Bill theBill) throws RemoteException; 
    Bill searchBill(Bill theBill) throws RemoteException;
    List<Bill> retrieveAllBill() throws RemoteException; 
}
