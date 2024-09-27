package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BasePage{
    //div[text()='-- Select --']
    //span[text()='CAN - FMLA']
    //label[text()='From Date']/../..//div[@class='oxd-date-input']
//    @FindBy(xpath = "//div[text()='-- Select --']")
    @FindBy(xpath = "//a[text()='Apply']")
    WebElement apply;

    @FindBy(xpath = "//label[text()='From Date']/../..//div[@class='oxd-date-input']")
    WebElement leaveFromDate;

    public void clickLeaveFromDate(){
        leaveFromDate.click();
    }

    public void clickApply(){
        apply.click();
    }
}
