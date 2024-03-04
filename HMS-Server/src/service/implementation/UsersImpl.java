/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.UsersDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Users;
import service.UsersService;

/**
 *
 * @author hp
 */
public class UsersImpl extends UnicastRemoteObject implements UsersService {
    public UsersImpl() throws RemoteException{
        super();
    }
    @Override
    public Users recordUsers(Users theUsers) throws RemoteException {
           return dao.recordUsers(theUsers);
    }
UsersDao dao = new UsersDao();
    @Override
    public Users updateUsers(Users theUsers) throws RemoteException {
        return dao.updateUsers(theUsers);
    }

    @Override
    public Users deleteUsers(Users theUsers) throws RemoteException {
         return dao.deleteUsers(theUsers);
    }

    @Override
    public Users searchUsers(int userId) throws RemoteException {
       return dao.searchUsers(userId);
    }

    @Override
    public List<Users> retrieveAllUsers() throws RemoteException {
         return dao.retrieveAllUsers();    
    }

    @Override
    public Users loginUser(String email, String password) throws RemoteException {
            return dao.loginUser(email, password);   
    }
}
