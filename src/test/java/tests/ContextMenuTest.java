package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenuTest() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
        actions
                .contextClick(waitService.waitForVisibilityBy(By.id("hot-spot")))
                .build()
                .perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();
    }
}
