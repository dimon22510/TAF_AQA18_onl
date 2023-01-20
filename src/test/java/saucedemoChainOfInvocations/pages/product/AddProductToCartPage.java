package saucedemoChainOfInvocations.pages.product;

import saucedemoPageFactory.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToCartPage extends BasePage {
    @FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement buttonAddToCart;
    @FindBy(className = "shopping_cart_link")
    public WebElement cartButton;
    private final By nextPageTitleLocator = By.xpath("//*[text()='Your Cart']");

    public AddProductToCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return nextPageTitleLocator;
    }
}
