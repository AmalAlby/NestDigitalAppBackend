package com.nest.nestdigitalapplicationbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitorlog")
public class VisitorLog {
    @Id
    @GeneratedValue
    private int id;
    private String vname;
    private String whomtomeet;
    private String reason;
    private String entrytime;
    private String exittime;

    public VisitorLog() {
    }

    public VisitorLog(int id, String vname, String whomtomeet, String reason, String entrytime, String exittime) {
        this.id = id;
        this.vname = vname;
        this.whomtomeet = whomtomeet;
        this.reason = reason;
        this.entrytime = entrytime;
        this.exittime = exittime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getWhomtomeet() {
        return whomtomeet;
    }

    public void setWhomtomeet(String whomtomeet) {
        this.whomtomeet = whomtomeet;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getExittime() {
        return exittime;
    }

    public void setExittime(String exittime) {
        this.exittime = exittime;
    }
}
