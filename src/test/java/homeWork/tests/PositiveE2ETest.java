package homeWork.tests;

import configuration.ReadProperties;
import homeWork.baseEntites.BaseHomeWorkTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveE2ETest extends BaseHomeWorkTest {
    @Test
    public void PositiveE2ETest() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(userHomeWorkSteps.loginSuccessful(ReadProperties.username(), ReadProperties.password())
                .isPageOpened());
        Thread.sleep(3000);

       Assert.assertTrue(addToCartSteps.addToCartSuccessful().isPageOpened());
        Thread.sleep(3000);

        Assert.assertEquals(productCheckSteps.checkNameProduct(),
                "Sauce Labs Bike Light");
        Thread.sleep(3000);
        Assert.assertEquals(productCheckSteps.checkPriceProduct(),
                "$9.99");
        Thread.sleep(3000);

        productCheckSteps.clickButtonCheckout().isPageOpened();
        Thread.sleep(3000);

//        Assert.assertTrue(inputInformationSteps.inputAllInformation().isPageOpened());
//        Thread.sleep(3000);
//
//        finalCheckInformationSteps.checkInfo().isPageOpened();

//*[text()='1']
    }
}
