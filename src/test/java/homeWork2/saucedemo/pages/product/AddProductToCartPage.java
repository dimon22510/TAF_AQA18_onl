package homeWork2.saucedemo.pages.product;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProductToCartPage extends BasePage {
    private final By buttonAddToCartLocator = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By cartButtonLocator = By.className("shopping_cart_link");

    public AddProductToCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return cartButtonLocator;
    }

    public WebElement getButtonAddToCart() {return driver.findElement(buttonAddToCartLocator);}
    public WebElement getCartButton() {return driver.findElement(cartButtonLocator);}
}
