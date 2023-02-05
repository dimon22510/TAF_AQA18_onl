package pages.booking;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(id = "__bui-c5129199-1")
    public WebElement searchString;
    @FindBy(className = "b91c144835")
    public WebElement dateString;
    @FindBy(xpath = "//*[text() = 'Search']")
    public WebElement searchButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return null;
    }
}
