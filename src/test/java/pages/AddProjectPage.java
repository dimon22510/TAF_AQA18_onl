package pages;

import baseEntities.BasePage;
import elements.CheckBox;
import elements.RadioButton;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage extends BasePage {
    private final static String pagePath = "index.php?/admin/projects/add";
    private final By checkBox = By.name("show_announcement");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public RadioButton getType() {
        return new RadioButton(driver, "suite_mode");
    }

    public CheckBox getCheckBox() {
        return new CheckBox(driver, checkBox);
    }
}
