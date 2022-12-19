package homeWork2.saucedemo.steps;

import homeWork2.saucedemo.baseEntities.BaseStep;
import homeWork2.saucedemo.pages.data_check.CheckLastPage;
import homeWork2.saucedemo.pages.data_check.DataCheckPage;
import org.openqa.selenium.WebDriver;

public class DataCheckSteps extends BaseStep {
    protected DataCheckPage dataCheckPage;

    public DataCheckSteps(WebDriver driver) {
        super(driver);

        dataCheckPage = new DataCheckPage(driver);
    }

    public void dataInput() {
        dataCheckPage.getNameProductLocator();
        dataCheckPage.getPriceProductLocator();
        dataCheckPage.getPaymentLocator();
        dataCheckPage.getShippingLocator();
        dataCheckPage.getItemTotalLocator();
        dataCheckPage.getTaxLocator();
        dataCheckPage.getTotalSumLocator();
    }

    public void clickFinish() {
        dataCheckPage.getButtonFinishLocator().click();
    }

    public DataCheckPage CheckFinishData() {
        dataInput();

        return dataCheckPage;
    }

    public CheckLastPage checkDataAndClickNextPage() {
        clickFinish();

        return new CheckLastPage(driver);
    }
}
