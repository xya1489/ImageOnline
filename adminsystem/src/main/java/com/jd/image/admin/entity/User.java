package com.jd.image.admin.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/26 0026.
 */
public class User implements Serializable {

    private String userId;
    private String userName;
    private Integer userAge;
    private Date userBirthday;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }
}