package com.ea.SpringBasic.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GuidesPage extends BasePage{

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/header/div/div[2]/div/button/span[1]/div")
    public WebElement organizationProfile;

    @FindBy(how = How.ID, using = "//*[@id=\"notistack-snackbar\"]")
    public WebElement loginSnackbar;

    @FindBy(how = How.XPATH, using = "//div[@role='alert']/div[2]/div")
    public WebElement closeLoginSnackBarButton;

    @FindBy(how = How.XPATH, using = "//span[.='Logout']")
    public WebElement logoutButton;

    @FindBy(how = How.XPATH, using = ".//h4[.='Guides List']")
    public WebElement guidesListHeader;

    public LoginPage ClickLogin() {
        lnkLogin.click();
        return new LoginPage();
    }

    public void closeLoginModal(){
        closeLoginSnackBarButton.click();
    }

    public LoginPage LogOff() {
        organizationProfile.click();
        logoutButton.click();
        return new LoginPage();
    }

    public boolean isGuidesListHeaderExist() {
        return guidesListHeader.isDisplayed();
    }

}
