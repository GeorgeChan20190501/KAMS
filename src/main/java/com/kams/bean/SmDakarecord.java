package com.kams.bean;

public class SmDakarecord {
    private Integer id;

    private String usr;

    private String active;

    private String describ;

    private String createTime;

    private String updateTime;

    private String chk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr == null ? null : usr.trim();
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ == null ? null : describ.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getChk() {
        return chk;
    }

    public void setChk(String chk) {
        this.chk = chk == null ? null : chk.trim();
    }
}