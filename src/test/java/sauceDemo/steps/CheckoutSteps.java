package sauceDemo.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sauceDemo.baseEntities.BaseStep;
import sauceDemo.models.User;
import sauceDemo.pages.cart.CartPage;
import sauceDemo.pages.overview.OverviewPage;
import sauceDemo.pages.data_input.DataInputPage;
import org.openqa.selenium.WebDriver;
import sauceDemo.pages.product.ProductPage;

public class CheckoutSteps extends BaseStep {
    private CartPage cartPage;
    private OverviewPage overviewPage;
    private DataInputPage dataInputPage;
    private ProductPage addProductToCartPage;
    Logger logger = LogManager.getLogger();

    public CheckoutSteps(WebDriver driver) {
        super(driver);

        cartPage = new CartPage(driver);
        dataInputPage = new DataInputPage(driver);
        addProductToCartPage = new ProductPage(driver);
        overviewPage = new OverviewPage(driver);
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
        cartPage.buttonCheckOut.click();
        return this;
    }

    public CheckoutSteps dataInputAndGoToOverview(User user) {
        logger.info("This step uses the User object which contains: " + user + " values");
        dataInputPage.inputFirstName.sendKeys(user.getFirstName());
        dataInputPage.inputLastName.sendKeys(user.getLastName());
        dataInputPage.inputZIPCode.sendKeys(user.getZipCode());
        dataInputPage.buttonContinue.click();
        return this;
    }

    public OverviewPage clickFinish() {
        overviewPage.buttonFinish.click();
        return overviewPage;
    }
}
