package pages.sauceDemo.overview;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage {
    @FindBy(id = "finish")
    public WebElement buttonFinish;
    @FindBy(xpath = "//*[text()='THANK YOU FOR YOUR ORDER']")
    WebElement completePage;

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return completePage;
    }
}
