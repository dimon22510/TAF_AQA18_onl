package saucedemoPageFactory.steps;

import saucedemoPageFactory.baseEntities.BaseStep;
import saucedemoPageFactory.pages.check_product.CheckProductAndPricePage;
import saucedemoPageFactory.pages.data_check.DataCheckPage;
import org.openqa.selenium.WebDriver;

public class CheckoutStep extends BaseStep {
    private CheckProductAndPricePage checkProductAndPricePage;
    private DataCheckPage dataCheckPage;

    public CheckoutStep(WebDriver driver) {
        super(driver);

        checkProductAndPricePage = new CheckProductAndPricePage(driver);
        dataCheckPage = new DataCheckPage(driver);
    }

    public void checkProductAndPrice() {
        checkProductAndPricePage.checkQuantityProduct.getText();
        checkProductAndPricePage.checkNameProduct.getText();
        checkProductAndPricePage.checkPriceProduct.getText();
    }

    public void clickButtonCheckOut() {
        checkProductAndPricePage.buttonCheckOut.click();
    }


    public void dataInput() {
        dataCheckPage.checkNameProduct.getText();
        dataCheckPage.checkPriceProduct.getText();
        dataCheckPage.checkPayment.getText();
        dataCheckPage.checkShippingInformation.getText();
        dataCheckPage.checkItemTotal.getText();
        dataCheckPage.checkTax.getText();
        dataCheckPage.checkTotalSum.getText();
    }

    public void clickFinish() {
        dataCheckPage.buttonFinish.click();
    }

    public DataCheckPage CheckFinishData() {
        dataInput();

        return dataCheckPage;
    }

    public DataCheckPage checkDataAndGoToCompletePage() {
        clickFinish();

        return new DataCheckPage(driver);
    }

    public CheckProductAndPricePage checkProductionAndPrice() {
        checkProductAndPrice();

        return checkProductAndPricePage;
    }

    public CheckProductAndPricePage goToYourInformationPage() {
        clickButtonCheckOut();

        return new CheckProductAndPricePage(driver);
    }
}
