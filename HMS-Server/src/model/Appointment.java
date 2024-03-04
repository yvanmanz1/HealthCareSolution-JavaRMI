/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author hp
 */
@Entity
public class Appointment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users patientid;
    @Column(name = "patient_name")
    private String patientname;
    @Column(name = "patient_phone")
    private String patientphone;
    @Column(name = "dep_name")
    private String departmentname;
    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctorname;
    private String day;
    private String time;
    private String insurance;
    private String status;

    public Appointment() {
    }

    public Appointment(Integer id) {
        this.id = id;
    }

    public Appointment(Integer id, Users patientid, String patientname, String patientphone, String departmentname, Doctor doctorname, String day, String time, String insurance, String status) {
        this.id = id;
        this.patientid = patientid;
        this.patientname = patientname;
        this.patientphone = patientphone;
        this.departmentname = departmentname;
        this.doctorname = doctorname;
        this.day = day;
        this.time = time;
        this.insurance = insurance;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getPatientid() {
        return patientid;
    }

    public void setPatientid(Users patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientphone() {
        return patientphone;
    }

    public void setPatientphone(String patientphone) {
        this.patientphone = patientphone;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public Doctor getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(Doctor doctorname) {
        this.doctorname = doctorname;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
