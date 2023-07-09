package com.pharoscontrols;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class AbstractTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver instance
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }
}
