package sauceDemo.tests;

import configuration.ReadProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import sauceDemo.baseEntities.BaseTest;
import sauceDemo.models.User;


public class SuccessfulOrderTest extends BaseTest {
    Logger logger = LogManager.getLogger();

    @Test
    public void successfulOrderTest() {
        logger.info("The Builder pattern is implemented in the successfulOrderTest test method " +
                "in the SuccessfulOrderTest class");

        User user = User.builder()
                .username(ReadProperties.username())
                .password(ReadProperties.password())
                .firstName(ReadProperties.firstname())
                .lastName(ReadProperties.lastname())
                .zipCode(ReadProperties.zipcode())
                .build();

        logger.info("The Chain of Invocations pattern is implemented in the successfulOrderTest test method" +
                " in the SuccessfulOrderTest class");

        Assert.assertTrue(
                userSteps.successfulLogin(user)
                        .addToCartProduct()
                        .goToCartPage()
                        .clickButtonCheckOut()
                        .dataInputAndGoToOverview(user)
                        .clickFinish()
                        .isPageOpened());
    }
}
