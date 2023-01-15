package pages.project_pr01.test_cases;

import baseEntities.BasePage;
import elements.DropDownMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTestCasesPage extends BasePage {
    private final By liIdLocator = By.id("type_id_chzn_o_0");
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

    public DropDownMenu getDropDownList() {return new DropDownMenu(driver,"chzn-single");}
    public DropDownMenu getLiIdLocator() {return new DropDownMenu(driver,liIdLocator);}
}
