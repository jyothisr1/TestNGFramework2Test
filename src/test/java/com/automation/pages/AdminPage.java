package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminPage extends BasePage{
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement admin;

    @FindBy(xpath = "//label[text()='User Role']/../../div//div[text()='-- Select --']")
    WebElement userRole;

    @FindBy(xpath = "//div[@role='listbox']//span[text()='Admin']")
    WebElement selectAdmin;

    @FindBy(xpath = "//button[text()=' Search ']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@class='oxd-table-card']")
    List<WebElement> adminList;

    @FindBy(xpath ="//span[text()='Leave']")
    WebElement leavePage;

    public void clickAdmin(){
        admin.click();
    }

    public void searchAdminList(){
        userRole.click();
        selectAdmin.click();
        searchButton.click();
    }
    public boolean validateAdminList(){
        if (adminList.size()>=1) return true;
        return false;
    }
    public void clickLeave(){
        leavePage.click();
    }
}
