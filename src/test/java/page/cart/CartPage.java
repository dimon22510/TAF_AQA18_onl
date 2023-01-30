package page.cart;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final By buttonCheckoutLocator = By.id("checkout");

    public SelenideElement getButtonCheckoutLocator() {
        return $(buttonCheckoutLocator).should(visible);
    }
}
