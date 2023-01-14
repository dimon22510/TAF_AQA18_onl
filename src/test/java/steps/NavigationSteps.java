package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;
import pages.project_pr01.EditPR01Page;
import pages.project_pr01.test_cases.AddTestCasesPage;

public class NavigationSteps extends BaseStep {
    public NavigationSteps(WebDriver driver) {
        super(driver);
    }

    public AddProjectPage navigateToAddProjectPage() {
        AddProjectPage page = new AddProjectPage(driver);
        page.openPageByUrl();

        return page;
    }

    public EditPR01Page navigateToEditProjectPage() {
        EditPR01Page page = new EditPR01Page(driver);
        page.openPageByUrl();

        return page;
    }

    public AddTestCasesPage navigateToTestCasesPage() {
        AddTestCasesPage page = new AddTestCasesPage(driver);
        page.openPageByUrl();

        return page;
    }
}
