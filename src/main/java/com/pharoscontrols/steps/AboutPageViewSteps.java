package com.pharoscontrols.steps;

import com.pharoscontrols.views.AboutPageView;
import com.pharoscontrols.views.AbstractPageView;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class AboutPageViewSteps extends AbstractPageSteps{
    private static final Logger LOG = LoggerFactory.getLogger(AboutPageViewSteps.class);
    private final String TITLE = "About — Pharos Controls";
    private WebDriver driver;
    private AboutPageView aboutPageView;

    public AboutPageViewSteps(WebDriver driver) {
        this.driver = driver;
        aboutPageView = new AboutPageView(driver);
    }

    @Step("Assert title")
    public void verifyAboutPageTitle() {
        String actualTitle = aboutPageView.getTitle();
        Assert.assertEquals(actualTitle, TITLE, "Page title mismatch");
    }

    public void clickContactUsLink() {
        aboutPageView.clickContactUsLink();
    }

    @Override
    public AboutPageViewSteps open() {
        LOG.info("Open About page");
        driver.get("https://www.pharoscontrols.com/about/");
        return this;
    }
}
