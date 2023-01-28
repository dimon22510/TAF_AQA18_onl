package sauceDemo.pages.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sauceDemo.baseEntities.BasePage;

public class ProductPage extends BasePage {
    @FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement buttonAddToCart;
    @FindBy(className = "shopping_cart_link")
    public WebElement cartButton;
    Logger logger = LogManager.getLogger();

    public ProductPage(WebDriver driver) {
        super(driver);

        logger.info("The ProductPage class implements the PageFactory pattern");
    }

    @Override
    protected WebElement getPageIdentifier() {
        return cartButton;
    }
}
