/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.implementation.AppointmentImpl;
import service.implementation.BillImpl;
import service.implementation.DepartmentImpl;
import service.implementation.DoctorImpl;
import service.implementation.MedicalRecordImpl;
import service.implementation.UsersImpl;

/**
 *
 * @author hp
 */
public class server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{ System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        Registry theRegistry = LocateRegistry.createRegistry(6000);
        theRegistry.rebind("appointment", new AppointmentImpl());
        theRegistry.rebind("bill", new BillImpl());
        theRegistry.rebind("department", new DepartmentImpl());
        theRegistry.rebind("doctor", new DoctorImpl());
        theRegistry.rebind("medic", new MedicalRecordImpl());
        theRegistry.rebind("users", new UsersImpl());
        System.out.println("Server is running on port 6000");
        Thread.currentThread().join(); //keep it alive running
       }catch(Exception ex){
           ex.printStackTrace();
       }
    }
    
}
