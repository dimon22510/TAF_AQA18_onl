package pages.project_pr01.test_cases;

import baseEntities.BasePage;
import elements.DropDownMenu;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTestCasesPage extends BasePage {
    private DropDownMenu dropDownMenu;

    private final By addTestCasesLocator = By.id("sidebar-cases-add");
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

    public UIElement getAddTestCasesLocator() {
        return new UIElement(driver, addTestCasesLocator);
    }

    public DropDownMenu getDropDownList() {
        return new DropDownMenu(driver,"chzn-single");
    }

    public DropDownMenu getText() {
        return new DropDownMenu(driver,"chzn-search");
    }

    public DropDownMenu getExploratory() {
        return new DropDownMenu(driver,By.id("template_id_chzn_o_0"));
    }


}
