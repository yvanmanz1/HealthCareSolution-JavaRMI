/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Department;
import org.hibernate.Session;

/**
 *
 * @author hp
 */
public class DepartmentDao {
    public Department recordDepartment(Department departmentObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.save(departmentObj);
            ss.beginTransaction().commit();
            ss.close();
            return departmentObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Department updateDepartment(Department departmentObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.update(departmentObj);
            ss.beginTransaction().commit();
            ss.close();
            return departmentObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Department deleteDepartment(Department departmentObj){
         try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            ss.delete(departmentObj);
            ss.beginTransaction().commit();
            ss.close();
            return departmentObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     public Department searchDepartment(int departmentId) {
        try {
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            Department theDepartment = (Department) ss.get(Department.class, departmentId);
            ss.close();
            return theDepartment;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<Department> retrieveAllDepartment(){
        try{
            Session ss = NewHibernateUtil.getSessionFactory().openSession();
            List<Department> department = ss.createQuery("select theDepartment from Department theDepartment").list();
            ss.close();
            return department;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
