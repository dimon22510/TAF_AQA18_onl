package pages;

import baseEntities.BasePage;
import elements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProjectPage extends BasePage {
    private final static String pagePath = "index.php?/admin/projects/add";
    private final By checkBox = By.name("show_announcement");
    private final By referencesButtonLocator = By.id("projects-tabs-references");

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

    public Button getReferencesButtonLocator() {
        return new Button(driver, referencesButtonLocator);
    }

    public DropDownMenu getDropDownMenu() {return new DropDownMenu(driver, "reference_plugin_chzn");}

    public RadioButton getRadioButton() {
        return new RadioButton(driver, "suite_mode");
    }

    public CheckBox getCheckBox() {
        return new CheckBox(driver, checkBox);
    }
}
