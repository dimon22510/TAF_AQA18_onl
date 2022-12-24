package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    @Test
    public void iframeTest() {
        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        Assert.assertEquals(waitService.waitForVisibilityBy(By.tagName("p")).getText(), "Your content goes here.");
    }
}
