package com.jsfcourse.person.com.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProfileAboutBB {
    public Boolean renderTextarea;
    public Boolean renderInput;

    public String userPhoto;
    public String author;
    public String email;

    public Integer postsCount;
    public Integer subscribersCount;

    public String description;
    public String city;

    public ProfileAboutBB() {
        this.assignData();
    }

    public Boolean getRenderTextarea() {
        return renderTextarea;
    }

    public void setRenderTextarea(Boolean renderTextarea) {
        this.renderTextarea = renderTextarea;
    }

    public Boolean getRenderInput() {
        return renderInput;
    }

    public void setRenderInput(Boolean renderInput) {
        this.renderInput = renderInput;
    }

    public Integer getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }

    public Integer getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(Integer subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public void assignData() {
        this.renderTextarea = false;
        this.renderInput = false;

        this.postsCount = 10;
        this.subscribersCount = 11;

        this.author = "Adam" + " " + "Adam";
        this.description = "Adam super mieszkam tutaj elo";

        this.email = "sss";
        this.city = "Sosnowiec";

        this.userPhoto = "resources/template/img/w1.jpg";
    }

    public String editDescription() {
        this.renderTextarea = !this.renderTextarea;
        System.out.println(this.renderTextarea);
        return null;
    }

    public String editCity() {
        this.renderInput = !this.renderInput;
        System.out.println(this.renderInput);
        return null;
    }

    public String saveDescription() {
        System.out.println("opis " + this.description);
        this.renderTextarea = !this.renderTextarea;
        return null;
    }

    public String saveCity() {
        System.out.println(this.city);
        this.renderInput = !this.renderInput;
        return null;
    }
}


