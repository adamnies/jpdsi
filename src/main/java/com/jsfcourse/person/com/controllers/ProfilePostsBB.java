package com.jsfcourse.person.com.controllers;

import com.jsfcourse.person.com.entities.Post;
import com.jsfcourse.person.com.services.SessionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;


@ManagedBean
@ViewScoped
public class ProfilePostsBB {
    public String newPostImage;
    public String newPostText;
    public List<Post> postsList = new ArrayList<Post>();

    @ManagedProperty(value = "#{sessionService}")
    private SessionService sessionService;

    public ProfilePostsBB() {
        this.newPostImage = "resources/template/img/w1.jpg";
        this.newPostText = "";
    }

    public void setSessionService(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    public String getNewPostImage() {
        return newPostImage;
    }
    public void setNewPostImage(String newPostImage) {
        this.newPostImage = newPostImage;
    }

    public String getNewPostText() {
        return newPostText;
    }
    public void setNewPostText(String newPostText) {
        this.newPostText = newPostText;
    }

    public List<Post> getPostsList() {
        return postsList;
    }
    public void setPostsList(List<Post> postsList) {
        this.postsList = postsList;
    }

    public String addPost() {
        Post a = new Post();
        return null;
    }
}


