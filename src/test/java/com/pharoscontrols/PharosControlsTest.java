package com.pharoscontrols;

import com.pharoscontrols.steps.AboutPageViewSteps;
import com.pharoscontrols.steps.CloudPageViewSteps;
import com.pharoscontrols.steps.HomePageViewSteps;
import com.pharoscontrols.steps.SalesPageViewSteps;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class PharosControlsTest extends AbstractTest {
    private HomePageViewSteps homePageViewSteps;
    private AboutPageViewSteps aboutPageViewSteps;
    private CloudPageViewSteps cloudPageViewSteps;
    private SalesPageViewSteps salesPageViewSteps;

    @Test
    @Description("Test Home page title and click About")
    public void testHomePage() {
        homePageViewSteps = new HomePageViewSteps(driver);
        homePageViewSteps
            .open()
            .verifyPageTitle()
            .clickAboutLink();
        // Perform assertions on the About page if needed
    }

    @Test
    @Description("Test About page title")
    public void testAboutPage() {
        aboutPageViewSteps = new AboutPageViewSteps(driver);
        aboutPageViewSteps
            .open()
            .verifyAboutPageTitle();
        // Perform assertions on the Contact Us page if needed
    }

    @Test
    @Description("Test Cloud page title")
    public void testCloudPage() {
        cloudPageViewSteps = new CloudPageViewSteps(driver);
        cloudPageViewSteps
            .open()
            .verifyCloudPageTitle();
        // Perform additional tests/assertions on the Cloud page if needed
    }

    @Test
    @Description("Test Sales page title")
    public void testSalesPage() {
        salesPageViewSteps = new SalesPageViewSteps(driver);
        salesPageViewSteps
            .open()
            .verifySalesPageTitle();
        // Perform additional tests/assertions on the Sales page if needed
    }
}
