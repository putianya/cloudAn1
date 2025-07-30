package com.hy.pojo;

import java.util.Date;

public class CpmEx {
    private Integer id;

    private Integer cid;

    private String cname;

    private Long cpm;

    private Date cpmDate;

    private String stauts;

    private Long cpmDiff;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Long getCpm() {
        return cpm;
    }

    public void setCpm(Long cpm) {
        this.cpm = cpm;
    }

    public Date getCpmDate() {
        return cpmDate;
    }

    public void setCpmDate(Date cpmDate) {
        this.cpmDate = cpmDate;
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts == null ? null : stauts.trim();
    }

    public Long getCpmDiff() {
        return cpmDiff;
    }

    public void setCpmDiff(Long cpmDiff) {
        this.cpmDiff = cpmDiff;
    }
}