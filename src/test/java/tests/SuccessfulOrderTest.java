package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import models.User;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;


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

                userStep.loginSuccessful(user)
                        .addToCartProduct()
                        .goToCartPage()
                        .clickButtonCheckout()
                        .dataInputAndGoToOverview(user)
                        .clickFinish()
                        .successfulOrderPage().shouldBe(visible);
    }
}
