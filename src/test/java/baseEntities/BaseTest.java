package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.WaitService;

public class BaseTest {
    protected WebDriver driver;
    protected WaitService waitService;

    @BeforeMethod
    public void setUp() {
        driver = new BrowserFactory().getDriver();
        waitService = new WaitService(driver);
//        driver.get(ReadProperties.getUrl());

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
