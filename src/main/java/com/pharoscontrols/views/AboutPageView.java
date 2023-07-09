package com.pharoscontrols.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPageView extends AbstractPageView{
    private WebDriver driver;

    public AboutPageView(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickContactUsLink() {
        WebElement contactUsLink = driver.findElement(By.linkText("Get in Touch"));
        contactUsLink.click();
    }
}
