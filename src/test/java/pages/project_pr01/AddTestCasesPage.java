package pages.project_pr01;

import baseEntities.BasePage;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTestCasesPage extends BasePage {
    private final By addTestCasesLocator = By.id("sidebar-cases-add");

    public AddTestCasesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public UIElement getAddTestCasesLocator() {return new UIElement(driver,addTestCasesLocator);}
}
