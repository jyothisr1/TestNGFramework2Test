package com.automation.test;

import com.automation.pages.AdminPage;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest{

    @Test
    public void verifyLeave(){
        loginPage.openWebsite();
        loginPage.doLogin("Admin","admin123");
        adminPage.clickLeave();
        leavePage.clickApply();
        leavePage.clickLeaveFromDate();

    }
}
