package com.pharoscontrols.views;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudPageView extends AbstractPageView{
    private WebDriver driver;

    @FindBy(css = ".cloud-product-title")
    private WebElement cloudPageTitle;

    public CloudPageView(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getCloudPageTitle() {
        return cloudPageTitle.getText();
    }
}