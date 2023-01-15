package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;
import pages.project_pr01.test_cases.AddTestCasesPage;
import steps.NavigationSteps;

public class DropDownMenuTest extends BaseTest {
    @Test
    public void dropDownMenuTest() {
        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        projectSteps.clickProjectPR01();
        AddTestCasesPage page = new NavigationSteps(driver).navigateToTestCasesPage();
        page.getDropDownList().selectionByIndexDropDownMenuElement(2);
        page.getLiIdLocator().clickLiIdElement();

    }
}
