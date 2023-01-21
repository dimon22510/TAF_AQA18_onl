package sauceDemo.pages.data_input;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sauceDemo.baseEntities.BasePage;

public class DataInputPage extends BasePage {
    @FindBy(id = "first-name")
    public WebElement inputFirstName;
    @FindBy(id = "last-name")
    public WebElement inputLastName;
    @FindBy(id = "postal-code")
    public WebElement inputZIPCode;
    @FindBy(id = "continue")
    public WebElement buttonContinue;

    public DataInputPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return buttonContinue;
    }
}
