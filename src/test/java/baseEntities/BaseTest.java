package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.WaitService;
import steps.ProjectSteps;
import steps.UserStep;

public class BaseTest {
    protected WebDriver driver;
    protected UserStep userStep;
    protected ProjectSteps projectSteps;
    protected WaitService waitService;

    @BeforeMethod
    public void setUp() {
        driver = new BrowserFactory().getDriver();
        waitService = new WaitService(driver);
//        driver.get(ReadProperties.getUrl());

        userStep = new UserStep(driver);
        projectSteps = new ProjectSteps(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
