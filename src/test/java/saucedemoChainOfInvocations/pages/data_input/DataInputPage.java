package saucedemoChainOfInvocations.pages.data_input;

import saucedemoPageFactory.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataInputPage extends BasePage {
    @FindBy(id = "first-name")
    public WebElement inputFirstName;
    @FindBy(id = "last-name")
    public WebElement inputLastName;
    @FindBy(id = "postal-code")
    public WebElement inputZIPCode;
    @FindBy(id = "continue")
    public WebElement buttonContinue;
    private final By nextPageTitleLocator = By.xpath("//*[text()='Checkout: Overview']");

    public DataInputPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return nextPageTitleLocator;
    }
}
