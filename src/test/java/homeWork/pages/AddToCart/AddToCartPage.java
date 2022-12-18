package homeWork.pages.AddToCart;

import homeWork.baseEntites.BaseHomeWorkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage extends BaseHomeWorkPage {
    private final By buttonAddToCartLocator = By.id("add-to-cart-sauce-labs-bike-light");
    private final By cartButtonLocator = By.className("shopping_cart_link");

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonAddToCartLocator;
    }

    public WebElement getButtonAddToCart() {return driver.findElement(buttonAddToCartLocator);}
    public WebElement getCartButton() {return driver.findElement(cartButtonLocator);}
}
