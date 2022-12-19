package homeWork2.saucedemo.pages.data_input;

import homeWork2.saucedemo.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataInputPage extends BasePage {
    private final By inputFirstNameLocator = By.id("first-name");
    private final By inputLastNameLocator = By.id("last-name");
    private final By inputZIPCodeLocator = By.id("postal-code");
    private final By buttonContinueLocator = By.id("continue");

    public DataInputPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonContinueLocator;
    }

    public WebElement getFirstNameLocator() {return driver.findElement(inputFirstNameLocator);}
    public WebElement getLastNameLocator() {return driver.findElement(inputLastNameLocator);}
    public WebElement getZipCodeLocator() {return driver.findElement(inputZIPCodeLocator);}
    public WebElement getButtonContinueLocator() {return driver.findElement(buttonContinueLocator);}
}
