package saucedemoPageFactory.steps;

import saucedemoPageFactory.baseEntities.BaseStep;
import saucedemoPageFactory.pages.product.AddProductToCartPage;
import org.openqa.selenium.WebDriver;

public class CartStep extends BaseStep {
    private AddProductToCartPage addProductToCartPage;

    public CartStep(WebDriver driver) {
        super(driver);

        addProductToCartPage = new AddProductToCartPage(driver);
    }

    public void addToCartProduct() {
        addProductToCartPage.buttonAddToCart.click();
        addProductToCartPage.cartButton.click();
    }

    public AddProductToCartPage addToCartAndGoToCartPage() {
        addToCartProduct();

        return new AddProductToCartPage(driver);
    }
}
