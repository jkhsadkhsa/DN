package com.zhongruan.bean;

import org.springframework.stereotype.Component;

/*资费*/
@Component
public class Fee {
    private int fid;
    private String fname;
    private String fhour;
    private String fbfee;
    private String fdfee;
    private String fcdate;
    private String fkdate;
    private String fstate;

    public Fee() {
    }

    public Fee(int fid, String fname, String fhour, String fbfee, String fdfee, String fcdate, String fkdate, String fstate) {
        this.fid = fid;
        this.fname = fname;
        this.fhour = fhour;
        this.fbfee = fbfee;
        this.fdfee = fdfee;
        this.fcdate = fcdate;
        this.fkdate = fkdate;
        this.fstate = fstate;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFhour() {
        return fhour;
    }

    public void setFhour(String fhour) {
        this.fhour = fhour;
    }

    public String getFbfee() {
        return fbfee;
    }

    public void setFbfee(String fbfee) {
        this.fbfee = fbfee;
    }

    public String getFdfee() {
        return fdfee;
    }

    public void setFdfee(String fdfee) {
        this.fdfee = fdfee;
    }

    public String getFcdate() {
        return fcdate;
    }

    public void setFcdate(String fcdate) {
        this.fcdate = fcdate;
    }

    public String getFkdate() {
        return fkdate;
    }

    public void setFkdate(String fkdate) {
        this.fkdate = fkdate;
    }

    public String getFstate() {
        return fstate;
    }

    public void setFstate(String fstate) {
        this.fstate = fstate;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", fhour='" + fhour + '\'' +
                ", fbfee='" + fbfee + '\'' +
                ", fdfee='" + fdfee + '\'' +
                ", fcdate='" + fcdate + '\'' +
                ", fkdate='" + fkdate + '\'' +
                ", fstate='" + fstate + '\'' +
                '}';
    }
}
