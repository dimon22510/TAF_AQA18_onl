package saucedemoPageFactory.tests;

import configuration.ReadProperties;
import saucedemoPageFactory.baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckProductTest extends BaseTest {

    @Test
    public void checkProductTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        cartStep.addToCartAndGoToCartPage();

        Assert.assertEquals(checkoutStep.checkProductionAndPrice().checkQuantityProduct.getText(),
                "1");
        Assert.assertEquals(checkoutStep.checkProductionAndPrice().checkNameProduct.getText(),
                "Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(checkoutStep.checkProductionAndPrice().checkPriceProduct.getText(),
                "$15.99");
    }
}
