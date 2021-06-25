package com.ea.SpringBasic.pages;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MainPage {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private GuidesPage guidesPage;

    @Autowired
    private WebDriver webDriver;

    public void PerformLogin() {

        webDriver.navigate().to("http://eaapp.somee.com");
        guidesPage.ClickLogin();
        loginPage.enterData("admin", "password");
        loginPage.ClickLogin();
    }
}
