package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import steps.NavigationSteps;

public class RadioButtonTest extends BaseTest {
    @Test
    public void radioButtonTest() {
        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        AddProjectPage page = new NavigationSteps(driver).navigateToAddProjectPage();
        page.getRadioButton().selectByIndex(1);
        page.getRadioButton().selectByValue("3");
        page.getRadioButton().selectByText("Use a single repository for all cases (recommended)");
    }
}
