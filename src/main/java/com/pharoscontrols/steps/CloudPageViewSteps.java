package com.pharoscontrols.steps;

import com.pharoscontrols.views.CloudPageView;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static com.pharoscontrols.constants.Constants.BASE_URL;
import static java.lang.String.format;

public class CloudPageViewSteps extends AbstractPageSteps {
    private static final Logger LOG = LoggerFactory.getLogger(CloudPageViewSteps.class);
    private static final String TITLE = "CLOUD";
    private WebDriver driver;
    private CloudPageView cloudPageView;

    public CloudPageViewSteps(WebDriver driver) {
        this.driver = driver;
        cloudPageView = new CloudPageView(driver);
    }

    @Step("Assert title")
    public void verifyCloudPageTitle() {
        String actualTitle = cloudPageView.getCloudPageTitle();
        Assert.assertEquals(actualTitle, TITLE, "Cloud page title mismatch");
    }

    @Override
    public CloudPageViewSteps open() {
        LOG.info("Open cloud page");
        driver.get(format("%s/cloud/", BASE_URL));
        return this;
    }
}