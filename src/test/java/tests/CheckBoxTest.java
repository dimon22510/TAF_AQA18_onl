package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;
import pages.project.AddProjectPage;
import steps.NavigationSteps;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest() {
        userStep.loginSuccessful(ReadProperties.username(),ReadProperties.password());
        AddProjectPage page = new NavigationSteps(driver).navigateToAddProjectPage();

        page.getCheckBox().selectByIndex(0);
        page.getCheckBox().selectByValue("1");
        page.getCheckBox().selectByText("Show the announcement on the overview page");
    }
}
