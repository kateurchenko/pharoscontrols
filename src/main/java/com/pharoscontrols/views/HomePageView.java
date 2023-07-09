package com.pharoscontrols.views;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePageView extends AbstractPageView{
    private WebDriver driver;

    @FindBy(linkText = "About")
    private WebElement aboutLink;

    @FindBy(linkText = "Cloud")
    private WebElement cloudLink;

    @FindBy(linkText = "Sales")
    private WebElement salesLink;

    @FindBy(id = "welcome")
    private WebElement welcomeTitle;


    public HomePageView(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAboutLink() {
        aboutLink.click();
    }

    public void clickCloudLink() {
        cloudLink.click();
    }

    public void clickSalesLink() {
        salesLink.click();
    }

    public String getTitle() {
        return welcomeTitle.getText();
    }
}
