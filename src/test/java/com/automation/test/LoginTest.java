package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void LoginVerifyTest(){
        loginPage.openWebsite();
        loginPage.doLogin("Admin","admin123");
        adminPage.clickAdmin();
        adminPage.searchAdminList();
        Assert.assertTrue(adminPage.validateAdminList());
    }
}
