package steps;

import models.User;
import page.cart.CartPage;
import page.data_input.DataInputPage;
import page.overview.OverviewPage;
import page.product.ProductPage;

public class CheckoutSteps {
    private ProductPage productPage;
    private CartPage cartPage;
    private DataInputPage dataInputPage;
    private OverviewPage overviewPage;


    public CheckoutSteps() {
        productPage = new ProductPage();
        cartPage = new CartPage();
        dataInputPage = new DataInputPage();
        overviewPage = new OverviewPage();
    }

    public CheckoutSteps addToCartProduct() {
        productPage.getButtonAddToCartLocator().click();
        return this;
    }

    public CheckoutSteps goToCartPage() {
        productPage.getCartButtonLocator().click();
        return this;
    }

    public CheckoutSteps clickButtonCheckout() {
        cartPage.getButtonCheckoutLocator().click();
        return this;
    }

    public CheckoutSteps dataInputAndGoToOverview(User user) {
        dataInputPage.getInputFirstNameLocator().setValue(user.getFirstName());
        dataInputPage.getInputLastNameLocator().setValue(user.getLastName());
        dataInputPage.getInputZIPCodeLocator().setValue(user.getZipCode());
        dataInputPage.getButtonContinueLocator().click();
        return this;
    }

    public OverviewPage clickFinish() {
        overviewPage.getButtonFinishLocator().click();
        return overviewPage;
    }
}
