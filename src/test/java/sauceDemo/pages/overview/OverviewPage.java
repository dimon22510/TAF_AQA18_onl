package sauceDemo.pages.overview;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sauceDemo.baseEntities.BasePage;

public class OverviewPage extends BasePage {
    @FindBy(id = "finish")
    public WebElement buttonFinish;
    @FindBy(xpath = "//*[text()='THANK YOU FOR YOUR ORDER']")
    WebElement completePage;
    Logger logger = LogManager.getLogger();

    public OverviewPage(WebDriver driver) {
        super(driver);

        logger.info("The OverviewPage class implements the PageFactory pattern");
    }

    @Override
    protected WebElement getPageIdentifier() {
        return completePage;
    }
}
