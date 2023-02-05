package pages.product;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement buttonAddToCart;
    @FindBy(className = "shopping_cart_link")
    public WebElement cartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getPageIdentifier() {
        return cartButton;
    }
}
