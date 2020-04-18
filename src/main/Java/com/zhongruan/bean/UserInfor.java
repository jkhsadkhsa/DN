package com.zhongruan.bean;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserInfor {
    private int uid;
    private String username;
    private String password;
    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public UserInfor(int uid, String username, String password, List<Role> roleList) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.roleList = roleList;
    }

    public UserInfor() {
    }

    public UserInfor(int uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "UserInfor{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roleList=" + roleList +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
