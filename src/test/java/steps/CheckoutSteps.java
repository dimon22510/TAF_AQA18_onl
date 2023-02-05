package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.cart.CartPage;
import pages.data_input.DataInputPage;
import pages.overview.OverviewPage;
import pages.product.ProductPage;

public class CheckoutSteps extends BaseStep {
    private CartPage checkProductAndPricePage;
    private OverviewPage dataCheckPage;
    private DataInputPage dataInputPage;
    private ProductPage addProductToCartPage;

    public CheckoutSteps(WebDriver driver) {
        super(driver);

        checkProductAndPricePage = new CartPage(driver);
        dataInputPage = new DataInputPage(driver);
        addProductToCartPage = new ProductPage(driver);
        dataCheckPage = new OverviewPage(driver);
    }

    public CheckoutSteps addToCartProduct() {
        addProductToCartPage.buttonAddToCart.click();
        return this;
    }

    public CheckoutSteps goToCartPage() {
        addProductToCartPage.cartButton.click();
        return this;
    }

    public CheckoutSteps clickButtonCheckOut() {
        checkProductAndPricePage.buttonCheckOut.click();
        return this;
    }

    public CheckoutSteps dataInputAndGoToOverview(String firstName, String lastName, String zipCode) {
        dataInputPage.inputFirstName.sendKeys(firstName);
        dataInputPage.inputLastName.sendKeys(lastName);
        dataInputPage.inputZIPCode.sendKeys(zipCode);
        dataInputPage.buttonContinue.click();
        return this;
    }

    public OverviewPage clickFinish() {
        dataCheckPage.buttonFinish.click();
        return new OverviewPage(driver);
    }
}
