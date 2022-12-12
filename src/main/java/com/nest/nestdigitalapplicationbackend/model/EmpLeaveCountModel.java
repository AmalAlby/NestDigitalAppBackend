package com.nest.nestdigitalapplicationbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="leavecount")
public class EmpLeaveCountModel {
    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private String name;
    private int casualleave;
    private int sickleave;
    private int specialeave;

    public EmpLeaveCountModel() {
    }

    public EmpLeaveCountModel(int id, int empid, String name, int casualleave, int sickleave, int specialeave) {
        this.id = id;
        this.empid = empid;
        this.name = name;
        this.casualleave = casualleave;
        this.sickleave = sickleave;
        this.specialeave = specialeave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCasualleave() {
        return casualleave;
    }

    public void setCasualleave(int casualleave) {
        this.casualleave = casualleave;
    }

    public int getSickleave() {
        return sickleave;
    }

    public void setSickleave(int sickleave) {
        this.sickleave = sickleave;
    }

    public int getSpecialeave() {
        return specialeave;
    }

    public void setSpecialeave(int specialeave) {
        this.specialeave = specialeave;
    }
}
