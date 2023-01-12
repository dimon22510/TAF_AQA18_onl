package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.project.AddProjectPage;
import pages.project_pr01.EditPR01Page;

public class NavigationSteps extends BaseStep {
    public NavigationSteps(WebDriver driver) {
        super(driver);
    }

    public AddProjectPage navigateToAddProjectPage() {
         AddProjectPage page = new AddProjectPage(driver);
         page.openPageByUrl();

         return page;
    }


    public EditPR01Page navigateToEditProject() {
        EditPR01Page page = new EditPR01Page(driver);
        page.openPageByUrl();

        return page;
    }
}
