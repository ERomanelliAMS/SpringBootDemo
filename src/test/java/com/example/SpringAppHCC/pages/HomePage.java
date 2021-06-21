package com.example.SpringAppHCC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class HomePage {

    public HomePage(){
        System.out.println("In Home Page");
    }

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    public LoginPage clickLogin(){
        //lnkLogin.click();
        System.out.println("Click the home page login");
        return new LoginPage();
    }

    public void clickEmployeeList(){
        lnkEmployeeList.click();
    }

}
