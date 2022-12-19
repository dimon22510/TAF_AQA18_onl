package homeWork2.saucedemo.tests;

import configuration.ReadProperties;
import homeWork2.saucedemo.baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class E2EPositiveSauceDemoTest extends BaseTest {

    @Test
    public void e2ePositiveTest() {
        Assert.assertTrue(userLoginSteps.successfulLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        Assert.assertTrue(addToCartSteps.successfulAddToCartAndGoingToCart().isPageOpened());

        Assert.assertEquals(checkProductSteps.checkProductionAndPrice().getQuantityProductLocator().getText(),
                "1");
        Assert.assertEquals(checkProductSteps.checkProductionAndPrice().getCheckNameProduct().getText(),
                "Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(checkProductSteps.checkProductionAndPrice().getCheckPriceProduct().getText(),
                "$15.99");

        Assert.assertTrue(checkProductSteps.checkNextPage().isPageOpened());
        Assert.assertTrue(dataInputSteps.dataInputAndClick().isPageOpened());

        Assert.assertEquals(dataCheckSteps.CheckFinishData().getNameProductLocator().getText(),
                "Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(dataCheckSteps.CheckFinishData().getPriceProductLocator().getText(),
                "$15.99");
        Assert.assertEquals(dataCheckSteps.CheckFinishData().getPaymentLocator().getText(),
                "SauceCard #31337");
        Assert.assertEquals(dataCheckSteps.CheckFinishData().getShippingLocator().getText(),
                "FREE PONY EXPRESS DELIVERY!");
        Assert.assertEquals(dataCheckSteps.CheckFinishData().getItemTotalLocator().getText(),
                "Item total: $15.99");
        Assert.assertEquals(dataCheckSteps.CheckFinishData().getTaxLocator().getText(),
                "Tax: $1.28");
        Assert.assertEquals(dataCheckSteps.CheckFinishData().getTotalSumLocator().getText(),
                "Total: $17.27");

        Assert.assertTrue(dataCheckSteps.checkDataAndClickNextPage().isPageOpened());
    }
}
