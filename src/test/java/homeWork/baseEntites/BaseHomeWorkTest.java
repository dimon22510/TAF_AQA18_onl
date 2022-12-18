package homeWork.baseEntites;

import configuration.ReadProperties;
import factory.BrowserFactory;
import homeWork.steps.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseHomeWorkTest {
    protected WebDriver driver;
    protected UserHomeWorkSteps userHomeWorkSteps;
    protected AddToCartSteps addToCartSteps;
    protected ProductCheckSteps productCheckSteps;
    protected InputInformationSteps inputInformationSteps;
    protected FinalCheckInformationSteps finalCheckInformationSteps;

    @BeforeMethod
    public void setUp() {
        driver = new BrowserFactory().getDriver();
        driver.get(ReadProperties.getUrl());

        userHomeWorkSteps = new UserHomeWorkSteps(driver);
        addToCartSteps = new AddToCartSteps(driver);
        productCheckSteps = new ProductCheckSteps(driver);
        inputInformationSteps = new InputInformationSteps(driver);
        finalCheckInformationSteps = new FinalCheckInformationSteps(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

