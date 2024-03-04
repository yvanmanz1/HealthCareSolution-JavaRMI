/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.BillDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Bill;
import service.BillService;

/**
 *
 * @author hp
 */
public class BillImpl extends UnicastRemoteObject implements BillService {
    public BillImpl() throws RemoteException{
        super();
    }
    @Override
    public Bill recordBill(Bill theBill) throws RemoteException {
           return dao.recordBill(theBill);
    }
BillDao dao = new BillDao();
    @Override
    public Bill updateBill(Bill theBill) throws RemoteException {
        return dao.updateBill(theBill);
    }

    @Override
    public Bill deleteBill(Bill theBill) throws RemoteException {
         return dao.deleteBill(theBill);
    }

    @Override
    public Bill searchBill(Bill theBill) throws RemoteException {
       return dao.searchBill(theBill);
    }

    @Override
    public List<Bill> retrieveAllBill() throws RemoteException {
         return dao.retrieveAllBill();    
    }

   
}
