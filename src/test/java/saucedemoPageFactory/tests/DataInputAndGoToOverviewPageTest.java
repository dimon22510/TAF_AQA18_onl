package saucedemoPageFactory.tests;

import configuration.ReadProperties;
import saucedemoPageFactory.baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataInputAndGoToOverviewPageTest extends BaseTest {

    @Test
    public void dataInputAndGoToOverviewPageTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        cartStep.addToCartAndGoToCartPage();
        checkoutStep.goToYourInformationPage();
        Assert.assertTrue(userStep.goToOverview(ReadProperties.firstname()
                , ReadProperties.lastname()
                , ReadProperties.zipcode()).isPageOpened());
    }
}
