package saucedemoPageFactory.tests;

import configuration.ReadProperties;
import saucedemoPageFactory.baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingDataOnTheOverviewTest extends BaseTest {

    @Test
    public void checkingDataOnTheOverviewTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        cartStep.addToCartAndGoToCartPage();
        checkoutStep.goToYourInformationPage();
        userStep.dataInput(ReadProperties.firstname()
                , ReadProperties.lastname(), ReadProperties.zipcode());

        Assert.assertEquals(checkoutStep.CheckFinishData().checkNameProduct.getText(),
                "Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(checkoutStep.CheckFinishData().checkPriceProduct.getText(),
                "$15.99");
        Assert.assertEquals(checkoutStep.CheckFinishData().checkPayment.getText(),
                "SauceCard #31337");
        Assert.assertEquals(checkoutStep.CheckFinishData().checkShippingInformation.getText(),
                "FREE PONY EXPRESS DELIVERY!");
        Assert.assertEquals(checkoutStep.CheckFinishData().checkItemTotal.getText(),
                "Item total: $15.99");
        Assert.assertEquals(checkoutStep.CheckFinishData().checkTax.getText(),
                "Tax: $1.28");
        Assert.assertEquals(checkoutStep.CheckFinishData().checkTotalSum.getText(),
                "Total: $17.27");
    }
}
