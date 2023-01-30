package page.product;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    private final By buttonAddToCartLocator = By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
    private final By cartButtonLocator = By.cssSelector("#shopping_cart_container");

    public SelenideElement getButtonAddToCartLocator() {
        return $(buttonAddToCartLocator).should(visible);
    }

    public SelenideElement getCartButtonLocator() {
        return $(cartButtonLocator).should(visible);
    }
}
