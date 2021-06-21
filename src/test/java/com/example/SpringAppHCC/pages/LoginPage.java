package com.example.SpringAppHCC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class LoginPage {

    public LoginPage(){
        System.out.println("In Login Page");
    }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.CSS, using = ".btn-default")
    public WebElement btnLogin;

    public void login(String username, String password){
        //txtUserName.sendKeys(username);
        //txtPassword.sendKeys(password);

        System.out.println("Username and password: " + username + "---" + password);

    }

    public HomePage clickLogin(){
        System.out.println("Click login from login page");
        return new HomePage();
    }


}
