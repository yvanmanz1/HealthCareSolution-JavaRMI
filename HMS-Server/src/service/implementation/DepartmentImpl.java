/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.DepartmentDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Department;
import service.DepartmentService;

/**
 *
 * @author hp
 */
public class DepartmentImpl extends UnicastRemoteObject implements DepartmentService {
    public DepartmentImpl() throws RemoteException{
        super();
    }
    @Override
    public Department recordDepartment(Department theDepartment) throws RemoteException {
           return dao.recordDepartment(theDepartment);
    }
DepartmentDao dao = new DepartmentDao();
    @Override
    public Department updateDepartment(Department theDepartment) throws RemoteException {
        return dao.updateDepartment(theDepartment);
    }

    @Override
    public Department deleteDepartment(Department theDepartment) throws RemoteException {
         return dao.deleteDepartment(theDepartment);
    }

    @Override
    public Department searchDepartment(int departmentId) throws RemoteException {
       return dao.searchDepartment(departmentId);
    }

    @Override
    public List<Department> retrieveAllDepartment() throws RemoteException {
         return dao.retrieveAllDepartment();    
    }

   
}
