package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import elements.CheckBox;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.project.AddProjectPage;
import pages.project_pr01.EditPR01Page;
import pages.project_pr01.ProjectPr01Page;
import steps.NavigationSteps;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest() {
        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        AddProjectPage page = new NavigationSteps(driver).navigateToAddProjectPage();

        page.getCheckBox().selectByIndex(0);
        page.getCheckBox().selectByValue("1");
        page.getCheckBox().selectByText("Show the announcement on the overview page");
    }

//    @Test
//    public void checkBox2() {
//        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
//        new NavigationSteps(driver).navigateToAddProjectPage();
//        CheckBox checkBox = new CheckBox(driver, By.name("show_announcement"));
//        checkBox.clickCheckBox();
//        checkBox.removeCheckBox();
//        checkBox.isSelected();
//    }

    @Test
    public void checkBox3() throws InterruptedException {
        userStep.loginSuccessful(ReadProperties.username(),ReadProperties.password());
        projectSteps.clickProject();
        Thread.sleep(3000);
        EditPR01Page page = new NavigationSteps(driver).navigateToEditProject();
        Thread.sleep(3000);
        page.getCheckBox().selectByText("This project is completed");
        Thread.sleep(3000);
        projectSteps.editProject();
        Thread.sleep(3000);


    }
}
