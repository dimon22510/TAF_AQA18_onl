package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.project_pr01.EditPR01Page;
import steps.NavigationSteps;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxAddProjectPage() {
        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        AddProjectPage page = new NavigationSteps(driver).navigateToAddProjectPage();

        page.getCheckBox().selectByIndex(0);
        page.getCheckBox().selectByValue("1");
        page.getCheckBox().selectByText("Show the announcement on the overview page");
    }

    @Test
    public void checkBoxEditProjectPageTest() {
        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        projectSteps.clickProjectPR01();
        EditPR01Page page = new NavigationSteps(driver).navigateToEditProjectPage();

        page.getCheckBoxAnnouncement().removeCheckBox();
        page.getCheckBoxAnnouncement().clickCheckBox();
        page.getCheckBoxIsCompleted().removeCheckBox();
        page.getCheckBoxIsCompleted().clickCheckBox();
    }
}
