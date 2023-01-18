package pages.project_pr01;

import baseEntities.BasePage;
import elements.Button;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPr01Page extends BasePage {
    private final By clickProjectPR01Locator = By.xpath("//*[text() = 'PR-01']");

    public ProjectPr01Page(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public Button getClickProjectLocator() {
        return new Button(driver, clickProjectPR01Locator);
    }
}
