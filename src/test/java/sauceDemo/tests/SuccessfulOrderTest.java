package sauceDemo.tests;

import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.baseEntities.BaseTest;
import sauceDemo.models.User;

public class SuccessfulOrderTest extends BaseTest {

    @Test
    public void successfulOrderTest() {
        User user = new User.Builder()
                .withUsername(ReadProperties.username())
                .withPassword(ReadProperties.password())
                .withFirsName(ReadProperties.firstname())
                .withLastname(ReadProperties.lastname())
                .withZipCode(ReadProperties.zipcode())
                .build();

        Assert.assertTrue(userSteps.successfulLogin(user)
                .addToCartProduct()
                .goToCartPage()
                .clickButtonCheckOut()
                .dataInputAndGoToOverview(user)
                .clickFinish()
                .isPageOpened());
    }
}
