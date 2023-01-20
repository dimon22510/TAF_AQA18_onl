package saucedemoChainOfInvocations.tests;

import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemoChainOfInvocations.baseEntities.BaseTest;

public class SuccessfulOrderTest extends BaseTest {

    @Test
    public void successfulOrderTest() {
        Assert.assertTrue(userStep.successfulLogin(ReadProperties.username(),ReadProperties.password())
                .addToCartProduct()
                .goToCartPage()
                .clickButtonCheckOut()
                .dataInputAndGoToOverview(ReadProperties.firstname(),ReadProperties.lastname(),ReadProperties.zipcode())
                .clickFinish()
                .isPageOpened());
    }
}
