/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Query;
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.criterion.Restrictions;


/**
 *
 * @author hp
 */
public class UsersDao {
    public Users recordUsers(Users usersObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.save(usersObj);
            ss.beginTransaction().commit();
            ss.close();
            return usersObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Users updateUsers(Users usersObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.update(usersObj);
            ss.beginTransaction().commit();
            ss.close();
            return usersObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Users deleteUsers(Users usersObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.delete(usersObj);
            ss.beginTransaction().commit();
            ss.close();
            return usersObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Users searchUsers (int userId){
      try{  
          Session ss = NewHibernateUtil.getSessionFactory().openSession();
         Users theUsers = (Users) ss.get(Users.class, userId);
      
       ss.close();
       return theUsers;
      }catch(Exception ex){
          ex.printStackTrace();
      }
        return null;
    }
    public List<Users> retrieveAllUsers(){
        try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            List<Users> users = ss.createQuery("select theUsers from Users theUsers").list();
            ss.close();
            return users;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     public Users loginUser(String email, String password) {
        try {
            Session ss = NewHibernateUtil.getSessionFactory().openSession();

            // Create an HQL query to retrieve the user with the specified email and password
            String hql = "FROM Users WHERE email = :email AND password = :password";
            Query query = ss.createQuery(hql);
            query.setParameter("email", email);
            query.setParameter("password", password);

            // Retrieve the user
            Users loggedInUser = (Users) query.uniqueResult();

            ss.close();

            return loggedInUser;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
