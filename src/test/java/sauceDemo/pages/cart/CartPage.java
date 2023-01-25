package sauceDemo.pages.cart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sauceDemo.baseEntities.BasePage;

public class CartPage extends BasePage {
    @FindBy(id = "checkout")
    public WebElement buttonCheckOut;
    Logger logger = LogManager.getLogger(CartPage.class);

    public CartPage(WebDriver driver) {
        super(driver);

        logger.error("В классе CartPage реализован паттерн PageFactory");
    }

    @Override
    protected WebElement getPageIdentifier() {
        return buttonCheckOut;
    }
}
