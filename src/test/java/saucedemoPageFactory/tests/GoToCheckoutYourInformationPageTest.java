package saucedemoPageFactory.tests;

import configuration.ReadProperties;
import saucedemoPageFactory.baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoToCheckoutYourInformationPageTest extends BaseTest {

    @Test
    public void goToCheckoutPageTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        cartStep.addToCartAndGoToCartPage();
        Assert.assertTrue(checkoutStep.goToYourInformationPage().isPageOpened());
    }
}
