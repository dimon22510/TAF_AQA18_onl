package pages.project_pr01;

import baseEntities.BasePage;
import elements.CheckBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPR01Page extends BasePage {
    private final static String pagePath = "index.php?/admin/projects/edit/1/1";
    private final By checkBoxAnnouncementLocator = By.name("show_announcement");
    private final By checkBoxIsCompletedLocator = By.name("is_completed");

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

    public CheckBox getCheckBoxAnnouncement() {return new CheckBox(driver, checkBoxAnnouncementLocator);}

    public CheckBox getCheckBoxIsCompleted() {return new CheckBox(driver,checkBoxIsCompletedLocator);}
}
