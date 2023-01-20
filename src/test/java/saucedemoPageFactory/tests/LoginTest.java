package saucedemoPageFactory.tests;

import configuration.ReadProperties;
import saucedemoPageFactory.baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void LoginTest() {
        Assert.assertTrue(userStep.successfulLogin(ReadProperties.username(), ReadProperties.password())
                .isPageOpened());
    }
}
