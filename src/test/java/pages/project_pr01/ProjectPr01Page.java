package pages.project_pr01;

import baseEntities.BasePage;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPr01Page extends BasePage {
    private final By clickProjectPR01Locator = By.xpath("//*[text() = 'PR-01']");

    public ProjectPr01Page(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public UIElement getClickProjectLocator() {
        return new UIElement(driver, clickProjectPR01Locator);
    }


}
