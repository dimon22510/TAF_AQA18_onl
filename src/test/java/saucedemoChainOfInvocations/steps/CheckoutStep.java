package saucedemoChainOfInvocations.steps;

import saucedemoChainOfInvocations.baseEntities.BaseStep;
import saucedemoChainOfInvocations.pages.check_product.CheckProductAndPricePage;
import saucedemoChainOfInvocations.pages.data_check.DataCheckPage;
import saucedemoChainOfInvocations.pages.data_input.DataInputPage;
import org.openqa.selenium.WebDriver;
import saucedemoChainOfInvocations.pages.product.AddProductToCartPage;

public class CheckoutStep extends BaseStep {
    private CheckProductAndPricePage checkProductAndPricePage;
    private DataCheckPage dataCheckPage;
    private DataInputPage dataInputPage;
    private AddProductToCartPage addProductToCartPage;

    public CheckoutStep(WebDriver driver) {
        super(driver);

        checkProductAndPricePage = new CheckProductAndPricePage(driver);
        dataInputPage = new DataInputPage(driver);
        addProductToCartPage = new AddProductToCartPage(driver);
        dataCheckPage = new DataCheckPage(driver);
    }

    public void checkProductAndPrice() {
        checkProductAndPricePage.checkQuantityProduct.getText();
        checkProductAndPricePage.checkNameProduct.getText();
        checkProductAndPricePage.checkPriceProduct.getText();
    }

    public CheckoutStep addToCartProduct() {
        addProductToCartPage.buttonAddToCart.click();
        return this;
    }

    public CheckoutStep goToCartPage() {
        addProductToCartPage.cartButton.click();
        return this;
    }

    public CheckoutStep clickButtonCheckOut() {
        checkProductAndPricePage.buttonCheckOut.click();
        return this;
    }

    public CheckoutStep dataInputAndGoToOverview(String firsName, String lastName, String zipCode) {
        dataInputPage.inputFirstName.sendKeys(firsName);
        dataInputPage.inputLastName.sendKeys(lastName);
        dataInputPage.inputZIPCode.sendKeys(zipCode);
        dataInputPage.buttonContinue.click();
        return this;
    }

    public DataCheckPage clickFinish() {
        dataCheckPage.buttonFinish.click();
        return new DataCheckPage(driver);
    }
}
