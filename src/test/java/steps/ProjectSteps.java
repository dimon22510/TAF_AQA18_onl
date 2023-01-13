package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;
import pages.project_pr01.AddTestCasesPage;
import pages.project_pr01.ProjectPr01Page;

public class ProjectSteps extends BaseStep {
    private AddProjectPage addProjectPage;
    private ProjectPr01Page projectPr01Page;
    private AddTestCasesPage addTestCasesPage;

    public ProjectSteps(WebDriver driver) {
        super(driver);

        addProjectPage = new AddProjectPage(driver);
        projectPr01Page = new ProjectPr01Page(driver);
        addTestCasesPage = new AddTestCasesPage(driver);
    }

    public void addProject(String projectName) {
        new NavigationSteps(driver).navigateToAddProjectPage();
        addProjectPage.getNameInput().sendKeys(projectName);
        addProjectPage.getAddProjectButton().click();

    }

    public void clickProject() {
        projectPr01Page.getClickProjectLocator().click();
    }

    public void clickAddTestCasesProject() {
        addTestCasesPage.getAddTestCasesLocator().click();
    }
}
