package com.kams.bean;

public class SmComments {
    private Integer id;

    private Integer articalid;

    private String commentuser;

    private String comment;

    private String cval1;

    private String cval2;

    private String cval3;

    private String updateTime;

    private String chk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticalid() {
        return articalid;
    }

    public void setArticalid(Integer articalid) {
        this.articalid = articalid;
    }

    public String getCommentuser() {
        return commentuser;
    }

    public void setCommentuser(String commentuser) {
        this.commentuser = commentuser == null ? null : commentuser.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getCval1() {
        return cval1;
    }

    public void setCval1(String cval1) {
        this.cval1 = cval1 == null ? null : cval1.trim();
    }

    public String getCval2() {
        return cval2;
    }

    public void setCval2(String cval2) {
        this.cval2 = cval2 == null ? null : cval2.trim();
    }

    public String getCval3() {
        return cval3;
    }

    public void setCval3(String cval3) {
        this.cval3 = cval3 == null ? null : cval3.trim();
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