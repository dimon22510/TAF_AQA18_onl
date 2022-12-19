package homeWork2.saucedemo.steps;

import homeWork2.saucedemo.baseEntities.BaseStep;
import homeWork2.saucedemo.pages.product.AddProductToCartPage;
import homeWork2.saucedemo.pages.product.CheckDataProductPage;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps extends BaseStep {
    protected AddProductToCartPage addProductToCartPage;

    public AddToCartSteps(WebDriver driver) {
        super(driver);

        addProductToCartPage = new AddProductToCartPage(driver);
    }

    public void addToCartAndGoingToCart() {
        addProductToCartPage.getButtonAddToCart().click();
        addProductToCartPage.getCartButton().click();

    }

    public CheckDataProductPage successfulAddToCartAndGoingToCart() {
        addToCartAndGoingToCart();

        return new CheckDataProductPage(driver);
    }
}
