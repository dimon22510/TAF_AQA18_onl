package saucedemoPageFactory.baseEntities;

import configuration.ReadProperties;
import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import saucedemoPageFactory.steps.CartStep;
import saucedemoPageFactory.steps.CheckoutStep;
import saucedemoPageFactory.steps.UserStep;

public class BaseTest {
    protected WebDriver driver;
    protected UserStep userStep;
    protected CheckoutStep checkoutStep;
    protected CartStep cartStep;

    @BeforeMethod
    public void setUp() {
        driver = new BrowserFactory().getDriver();
        driver.get(ReadProperties.getUrl());

        userStep = new UserStep(driver);
        checkoutStep = new CheckoutStep(driver);
        cartStep = new CartStep(driver);
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        driver.quit();
    }
}
