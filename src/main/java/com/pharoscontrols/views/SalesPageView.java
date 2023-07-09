package com.pharoscontrols.views;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPageView extends AbstractPageView{
    private WebDriver driver;

    @FindBy(id = "sales")
    private WebElement salesPageTitle;

    public SalesPageView(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getSalesPageTitle() {
        return salesPageTitle.getText();
    }
}