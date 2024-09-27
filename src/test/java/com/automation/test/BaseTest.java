package com.automation.test;

import com.automation.pages.AdminPage;
import com.automation.pages.BasePage;
import com.automation.pages.LeavePage;
import com.automation.pages.LoginPage;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    LeavePage leavePage;

    @BeforeMethod
    public void setUp(){
        DriverManager.createDriver();
        basePage=new BasePage();
        loginPage=new LoginPage();
        adminPage=new AdminPage();
    }

    @AfterMethod
    public void cleanUp(){
//        DriverManager.getDriver().quit();
    }
}
