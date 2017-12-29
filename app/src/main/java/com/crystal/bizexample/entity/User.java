package com.crystal.bizexample.entity;

/**
 * Created by GanJinjin on 2017/12/29.
 */

public class User {

    private String account;
    private String password;
    private boolean isLogin;

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }
}
