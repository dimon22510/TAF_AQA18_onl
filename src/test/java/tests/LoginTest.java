package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.*;
import models.Project;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.project.AddProjectPage;
import steps.NavigationSteps;

public class LoginTest extends BaseTest {

    //@Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getEmailInput().sendKeys(ReadProperties.username());
        loginPage.getPassword().sendKeys(ReadProperties.password());
        loginPage.getLogInButton().click();

        Assert.assertTrue(new DashboardPage(driver).isPageOpened());
    }

    @Test (description = "Description")
    @Issue("AQA18-12")
    @TmsLink("TC-001")
    @Description("Description1")
    @Link("https://onliner.by")
    @Link(name ="catalog", type = "myLink", url = "https://onliner.by")
    @Severity(SeverityLevel.BLOCKER)
    public void loginSuccessfulTest() {
        Assert.assertTrue(
                userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password())
                .isPageOpened()
        );
    }

    @Test
    public void loginIncorrectTest() {
        Assert.assertEquals(
                userStep.loginIncorrect(ReadProperties.username(), "sdfsdfsdf")
                .getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again1."
        );
    }

    @Test
    public void addProjectTest() {
        Project project = new Project();
        project.setName("WP_01");
        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        projectSteps.addProject(project);

        Assert.assertEquals(driver.findElement(By.className("page_title")).getText(),
                project.getName());
    }

    @Test
    public void radioButtonTest() {
        userStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        AddProjectPage page = new NavigationSteps(driver).navigateToAddProjectPage();
        page.getType().selectByIndex(1);
        page.getType().selectByValue("3");
        page.getType().selectByText("Use a single repository for all cases (recommended)");
    }
}
