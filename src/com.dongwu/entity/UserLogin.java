package com.dongwu.entity;

/**
 * @author liudw
 * @date 2021/4/15 9:23
 * @effect
 */
public class UserLogin {
    private String loginname;
    private String password;
    private String username;

    public UserLogin() {
        super();
    }

    public UserLogin(String loginname, String password, String username) {
        super();
        this.loginname = loginname;
        this.password = password;
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserLogin[loginname = " + loginname + ", password = " + password + ", username = " + username + "]";
    }
}
