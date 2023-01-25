package sauceDemo.tests;

import configuration.ReadProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.baseEntities.BaseTest;
import sauceDemo.models.User;


public class SuccessfulOrderTest extends BaseTest {
    @Test
    public void successfulOrderTest() {

        User user = User.builder()
                .username(ReadProperties.username())
                .password(ReadProperties.password())
                .firstName(ReadProperties.firstname())
                .lastName(ReadProperties.lastname())
                .zipCode(ReadProperties.zipcode())
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
