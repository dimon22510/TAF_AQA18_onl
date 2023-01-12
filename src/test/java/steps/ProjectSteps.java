package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.project.AddProjectPage;
import pages.project_pr01.EditPR01Page;
import pages.project_pr01.ProjectPr01Page;

public class ProjectSteps extends BaseStep {
    private AddProjectPage addProjectPage;
    private ProjectPr01Page projectPr01Page;
    private EditPR01Page editPR01Page;

    public ProjectSteps(WebDriver driver) {
        super(driver);

        addProjectPage = new AddProjectPage(driver);
        projectPr01Page = new ProjectPr01Page(driver);
        editPR01Page = new EditPR01Page(driver);
    }

    public void addProject(String projectName) {
        new NavigationSteps(driver).navigateToAddProjectPage();
        addProjectPage.getNameInput().sendKeys(projectName);
        addProjectPage.getAddProjectButton().click();

    }

    public void clickProject() {
        projectPr01Page.getClickProjectLocator().click();
    }

    public void editProject() {
        editPR01Page.getSaveProjectButton().click();
    }

    public void updateProject() {

    }

    public void deleteProject() {

    }
}
