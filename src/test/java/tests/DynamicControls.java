package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControls extends BaseTest {

    @Test
    public void checkBoxTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkBox = waitService.waitForVisibilityBy(By.xpath("//*[text() = ' A checkbox']"));
        actions
                .click(waitService.waitForVisibilityBy(By.cssSelector("[onclick='swapCheckbox()']")))
                .build()
                .perform();

        Assert.assertEquals(waitService.waitForVisibilityBy(By.id("message")).getText(),"It's gone!");
        Assert.assertTrue(waitService.waitForElementInvisibleBy(checkBox));
    }

    @Test
    public void inputTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement input = waitService.waitForVisibilityBy(By.cssSelector("[type ='text']"));

        Assert.assertFalse(input.isEnabled());
        actions
                .click(waitService.waitForVisibilityBy(By.cssSelector("[onclick = 'swapInput()']")))
                .build()
                .perform();
        Assert.assertEquals(waitService.waitForVisibilityBy(By.id("message")).getText(),"It's enabled!");
        Assert.assertTrue(input.isEnabled());
    }
}
