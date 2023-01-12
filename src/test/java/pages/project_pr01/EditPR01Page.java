package pages.project_pr01;

import baseEntities.BasePage;
import elements.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPR01Page extends BasePage {
    private final static String pagePath = "index.php?/admin/projects/edit/1/1";
    private final By saveProjectButton = By.id("accept");


    public EditPR01Page(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public WebElement getSaveProjectButton() {return driver.findElement(saveProjectButton);}

    public CheckBox getCheckBox() {return new CheckBox(driver,"is_completed");}

}
