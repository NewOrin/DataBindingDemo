package com.neworin.databindingdemo;

/**
 * <b>Create Date:</b> 01/14/2017<br>
 * <b>Author:</b> NewOrin <br>
 * <b>Description:</b>
 * <br>
 */

public class User {
    private String uid;
    private String uname;
    private String upwd;
    private String ugender;

    public User() {
    }

    public User(String uid, String uname, String upwd, String ugender) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.ugender = ugender;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }
}
