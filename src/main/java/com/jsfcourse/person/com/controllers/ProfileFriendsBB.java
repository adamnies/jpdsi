package com.jsfcourse.person.com.controllers;

import com.jsfcourse.person.com.entities.User;
import com.jsfcourse.person.com.services.SessionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;


@ManagedBean
@ViewScoped
public class ProfileFriendsBB {
    public List<User> friendsList = new ArrayList<User>();

    @ManagedProperty(value = "#{sessionService}")
    private SessionService sessionService;

    public List<User> getFriendsList() {
        return friendsList;
    }
    public void setFriendsList(List<User> friendsList) {
        this.friendsList = friendsList;
    }

    public void setSessionService(SessionService sessionService) {
        this.sessionService = sessionService;
    }


    public ProfileFriendsBB() {
        User a = new User("resources/template/img/w1.jpg", "adam", "kowalski");
        User b = new User("resources/template/img/w1.jpg", "dobry", "whey");
        this.friendsList.add(a);
        this.friendsList.add(a);
        this.friendsList.add(b);
        this.friendsList.add(a);
        this.friendsList.add(b);
        this.friendsList.add(b);
        this.friendsList.add(b);
        this.friendsList.add(b);
        this.friendsList.add(b);
        this.friendsList.add(b);
    }

    public String addPost() {
        System.out.println(this.sessionService.userName);
        return null;
    }
}


