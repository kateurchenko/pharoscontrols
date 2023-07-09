package com.pharoscontrols.steps;

import com.pharoscontrols.views.HomePageView;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static com.pharoscontrols.constants.Constants.BASE_URL;

public class HomePageViewSteps extends AbstractPageSteps {
    private static final Logger LOG = LoggerFactory.getLogger(HomePageViewSteps.class);
    private static final String TITLE = "Welcome to Pharos Architectural Controls";
    private final WebDriver driver;
    private final HomePageView homePageView;

    public HomePageViewSteps(WebDriver driver) {
        this.driver = driver;
        homePageView = new HomePageView(driver);
    }

    public void clickAboutLink() {
        homePageView.clickAboutLink();
    }

    public void clickCloudLink() {
        homePageView.clickCloudLink();
    }

    public void clickSalesLink() {
        homePageView.clickSalesLink();
    }

    @Step("Assert title")
    public HomePageViewSteps verifyPageTitle() {
        String actualTitle = homePageView.getTitle();
        Assert.assertEquals(actualTitle, TITLE, "Sales page title mismatch");
        return this;
    }
    @Override
    public HomePageViewSteps open() {
        LOG.info("Open home page");
        driver.get(BASE_URL);
        return this;
    }
}