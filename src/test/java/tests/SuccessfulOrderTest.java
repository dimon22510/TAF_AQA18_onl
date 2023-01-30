package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SuccessfulOrderTest extends BaseTest {

    @Test
    public void successfulOrderTest() {
        User user = User.builder()
                .userName(ReadProperties.username())
                .password(ReadProperties.password())
                .lastName(ReadProperties.lastname())
                .firstName(ReadProperties.firstname())
                .zipCode(ReadProperties.zipcode())
                .build();

        Assert.assertTrue(
                userStep.loginSuccessful(user)
                        .addToCartProduct()
                        .goToCartPage()
                        .clickButtonCheckout()
                        .dataInputAndGoToOverview(user)
                        .clickFinish()
                        .isPageOpened()
        );
    }
}
