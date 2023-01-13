package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMenuTest extends BaseTest {

    @Test
    public void dropDownMenuTest() throws InterruptedException {
        userStep.loginSuccessful(ReadProperties.username(),ReadProperties.password());
        projectSteps.clickProject();
        projectSteps.clickAddTestCasesProject();
        Thread.sleep(5000);
    }
}
