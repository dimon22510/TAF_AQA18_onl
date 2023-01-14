package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;
import pages.project_pr01.test_cases.AddTestCasesPage;
import pages.project_pr01.ProjectPr01Page;

public class ProjectSteps extends BaseStep {
    private AddProjectPage addProjectPage;
    private ProjectPr01Page projectPr01Page;


    public ProjectSteps(WebDriver driver) {
        super(driver);

        addProjectPage = new AddProjectPage(driver);
        projectPr01Page = new ProjectPr01Page(driver);
    }

    public void addProject(String projectName) {
        new NavigationSteps(driver).navigateToAddProjectPage();
        addProjectPage.getNameInput().sendKeys(projectName);
        addProjectPage.getAddProjectButton().click();

    }

    public void clickProjectPR01() {
        projectPr01Page.getClickProjectLocator().click();

    }


}
