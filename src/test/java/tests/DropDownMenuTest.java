package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.project_pr01.test_cases.AddTestCasesPage;
import steps.NavigationSteps;

public class DropDownMenuTest extends BaseTest {
    @Test
    public void dropDownMenuTestCasesTest() {
        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        projectSteps.clickProjectPR01();
        AddTestCasesPage page = new NavigationSteps(driver).navigateToTestCasesPage();

        page.getDropDownMenu().search("Crit");
        page.getDropDownMenu().selectByText("Critical");
    }

    @Test
    public void dropDownMenuReferencesTest() {
        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        AddProjectPage page = new NavigationSteps(driver).navigateToAddProjectPage();

        page.getDropDownMenu().search("GitH");
        page.getDropDownMenu().selectByText("GitHub");
    }
}
