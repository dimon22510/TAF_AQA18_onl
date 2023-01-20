package saucedemoPageFactory.tests;

import configuration.ReadProperties;
import saucedemoPageFactory.baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulOrderTest extends BaseTest {

    @Test
    public void successfulOrderTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        cartStep.addToCartAndGoToCartPage();
        checkoutStep.goToYourInformationPage();
        userStep.dataInput(ReadProperties.firstname(),ReadProperties.lastname(),ReadProperties.zipcode());

        Assert.assertTrue(checkoutStep.checkDataAndGoToCompletePage().isPageOpened());
    }
}
