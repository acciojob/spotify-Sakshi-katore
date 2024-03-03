package com.driver;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String mobile;

    public User() {

    }

    public User(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
//class UserManagement{
//    private List<User> userList;
//
//    public UserManagement(){
//        this.userList = new ArrayList<>();
//    }
//
//    public void createUser(String name, String mobile){
//        User newUser = new User(name,mobile);
//        userList.add(newUser);
//    }
//}
