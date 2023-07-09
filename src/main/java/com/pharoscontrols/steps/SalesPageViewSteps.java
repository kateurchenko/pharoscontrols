package com.pharoscontrols.steps;

import com.pharoscontrols.views.SalesPageView;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static com.pharoscontrols.constants.Constants.BASE_URL;
import static java.lang.String.format;

public class SalesPageViewSteps extends AbstractPageSteps {
    private static final Logger LOG = LoggerFactory.getLogger(SalesPageViewSteps.class);
    private final String TITLE = "SALES";
    private final WebDriver driver;
    private final SalesPageView salesPageView;

    public SalesPageViewSteps(WebDriver driver) {
        this.driver = driver;
        salesPageView = new SalesPageView(driver);
    }
    @Step("Assert title")
    public void verifySalesPageTitle() {
        String actualTitle = salesPageView.getSalesPageTitle();
        Assert.assertEquals(actualTitle, TITLE, "Sales page title mismatch");
    }

    @Override
    public SalesPageViewSteps open() {
        LOG.info("Open sales page");
        driver.get(format("%s/sales/", BASE_URL));
        return this;
    }
}
