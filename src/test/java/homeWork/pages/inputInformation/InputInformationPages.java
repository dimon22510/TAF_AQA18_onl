package homeWork.pages.inputInformation;

import homeWork.baseEntites.BaseHomeWorkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputInformationPages extends BaseHomeWorkPage {
    private final By inputFirstNameLocator = By.id("first-name");
    private final By inputLastNameLocator = By.id("last-name");
    private final By inputZIPCodeLocator = By.id("postal-code");
    private final By buttonContinueLocator = By.id("continue");


    public InputInformationPages(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonContinueLocator;
    }

    public WebElement getFirstNameLocator() {
        return driver.findElement(inputFirstNameLocator);
    }

    public WebElement getLastNameLocator() {
        return driver.findElement(inputLastNameLocator);
    }

    public WebElement getZipCodeLocator() {
        return driver.findElement(inputZIPCodeLocator);
    }

    public WebElement getButtonContinueLocator() {
        return driver.findElement(buttonContinueLocator);
    }
}
