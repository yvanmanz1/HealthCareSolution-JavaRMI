/*
 * To change this license header, choose Users Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Users;

/**
 *
 * @author hp
 */
public interface UsersService extends Remote{
     Users recordUsers(Users theUsers) throws RemoteException; 
    Users updateUsers(Users theUsers) throws RemoteException; 
    Users deleteUsers(Users theUsers) throws RemoteException; 
    Users searchUsers(int userId) throws RemoteException;
    List<Users> retrieveAllUsers() throws RemoteException; 
    Users loginUser(String email, String password) throws RemoteException; 
}
