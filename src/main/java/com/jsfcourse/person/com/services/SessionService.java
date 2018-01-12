package com.jsfcourse.person.com.services;

import com.jsfcourse.person.com.entities.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class SessionService implements Serializable {

    public User currentUser;
    public String userName;
    public String userPhoto;
    public String userProfileId;

    public User getCurrentUser() {
        return currentUser;
    }
    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserProfileId() {
        return userProfileId;
    }
    public void setUserProfileId(String userProfileId) {
        this.userProfileId = userProfileId;
    }

    public SessionService() {
    }

}
