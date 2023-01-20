package saucedemoPageFactory.tests;

import configuration.ReadProperties;
import saucedemoPageFactory.baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartAndGoingToCartTest extends BaseTest {

    @Test
    public void AddToCartAndGoingToCartPageTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        Assert.assertTrue(cartStep.addToCartAndGoToCartPage().isPageOpened());
    }
}
