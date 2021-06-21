package com.example.SpringAppHCC.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainPage {

    public MainPage(){
        System.out.println("In Main Page");
    }

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    /*public MainPage(LoginPage loginPage, HomePage homePage) {
        this.loginPage = loginPage;
        this.homePage = homePage;
    }*/

    public void PerformLogin(){
        homePage.clickLogin();
        loginPage.login("admin", "adminpassword23432");
        loginPage.clickLogin();
    }

}
