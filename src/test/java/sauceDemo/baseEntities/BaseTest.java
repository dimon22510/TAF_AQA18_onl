package sauceDemo.baseEntities;

import configuration.ReadProperties;
import factory.BrowserFactory;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sauceDemo.steps.CheckoutSteps;
import sauceDemo.steps.UserSteps;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;


    @BeforeMethod
    public void setUp() {
        driver = new BrowserFactory().getDriver();
        driver.get(ReadProperties.getUrl());

        userSteps = new UserSteps(driver);
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        driver.quit();
    }
}
