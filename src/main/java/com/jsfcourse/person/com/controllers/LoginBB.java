package com.jsfcourse.person.com.controllers;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import java.util.ResourceBundle;

@ManagedBean
public class LoginBB {
    private String userEmail;
    private String userPassword;

    @ManagedProperty("#{txtCalcErr}")
    private ResourceBundle txtCalcErr;

    public void setTxtCalcErr(ResourceBundle txtCalcErr) {
        this.txtCalcErr = txtCalcErr;
    }

    private ResourceBundle txtCalcErrManual;

    @PostConstruct
    public void postConstruct() {
        FacesContext context = FacesContext.getCurrentInstance();
        txtCalcErrManual = ResourceBundle.getBundle("textCalcErr",
                context.getViewRoot().getLocale());
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String signIn() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        try {
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                    txtCalcErr.getString("calcComputationOkInfo"), null));
            return "profile";
        } catch (Exception e) {
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    txtCalcErrManual.getString("calcWrongParams"), null));
            return null;
        }
    }

}
