package homeWork2.saucedemo.steps;

import homeWork2.saucedemo.baseEntities.BaseStep;
import homeWork2.saucedemo.pages.check_product.CheckInputDataPage;
import homeWork2.saucedemo.pages.check_product.CheckProductAndPricePage;
import org.openqa.selenium.WebDriver;

public class CheckProductSteps extends BaseStep {
    protected CheckProductAndPricePage checkProductAndPricePage;

    public CheckProductSteps(WebDriver driver) {
        super(driver);

        checkProductAndPricePage = new CheckProductAndPricePage(driver);
    }

    public void checkProductAndPrice() {
        checkProductAndPricePage.getQuantityProductLocator();
        checkProductAndPricePage.getCheckNameProduct();
        checkProductAndPricePage.getCheckPriceProduct();
    }

    public void clickButtonCheckOut() {
        checkProductAndPricePage.getButtonCheckout().click();
    }

    public CheckProductAndPricePage checkProductionAndPrice() {
        checkProductAndPrice();

        return checkProductAndPricePage;
    }

    public CheckInputDataPage checkNextPage() {
        clickButtonCheckOut();

        return new CheckInputDataPage(driver);
    }
}
