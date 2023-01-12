package pages.project_pr01;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPr01Page extends BasePage {
    private final static String pagePath = "index.php?/projects/overview/1";
    private final By clickProjectPR01Locator = By.xpath("//*[text() = 'PR-01']");

    public ProjectPr01Page(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public WebElement getClickProjectLocator() {return driver.findElement(clickProjectPR01Locator);}


}
