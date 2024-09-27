package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(name = "username" )
    WebElement usernameInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(xpath = "//button")
    WebElement loginButton;


    public void openWebsite(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public void doLogin(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
