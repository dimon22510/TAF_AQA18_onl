package homeWork2.saucedemo.baseEntities;

import configuration.ReadProperties;
import factory.BrowserFactory;
import homeWork2.saucedemo.steps.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected UserLoginSteps userLoginSteps;
    protected AddToCartSteps addToCartSteps;
    protected CheckProductSteps checkProductSteps;
    protected DataInputSteps dataInputSteps;
    protected DataCheckSteps dataCheckSteps;

    @BeforeMethod
    public void setUp() {
        driver = new BrowserFactory().getDriver();
        driver.get(ReadProperties.getUrl());

        userLoginSteps = new UserLoginSteps(driver);
        addToCartSteps = new AddToCartSteps(driver);
        checkProductSteps = new CheckProductSteps(driver);
        dataInputSteps = new DataInputSteps(driver);
        dataCheckSteps = new DataCheckSteps(driver);
    }

    @AfterSuite(enabled = true)
    public void tearDown() {
        driver.quit();
    }
}
