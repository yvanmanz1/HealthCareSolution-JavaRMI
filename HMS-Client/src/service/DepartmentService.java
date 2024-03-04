/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Department;

/**
 *
 * @author hp
 */
public interface DepartmentService extends Remote{
    Department recordDepartment(Department theDepartment) throws RemoteException; 
    Department updateDepartment(Department theDepartment) throws RemoteException; 
    Department deleteDepartment(Department theDepartment) throws RemoteException; 
    Department searchDepartment(int departmentId) throws RemoteException;
    List<Department> retrieveAllDepartment() throws RemoteException; 
}
