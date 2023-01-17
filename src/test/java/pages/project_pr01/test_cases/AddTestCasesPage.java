package pages.project_pr01.test_cases;

import baseEntities.BasePage;
import elements.DropDownMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTestCasesPage extends BasePage {
    private final static String pagePath = "index.php?/cases/add/1";

    public AddTestCasesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public DropDownMenu getDropDownMenu() {return new DropDownMenu(driver,"priority_id_chzn");}
}
