package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;

import java.time.Duration;

public class WaitsTest extends BaseTest {

    @Test
    public void implicitlyVisibilityTest() throws InterruptedException {    //Тест с неявным ожиданием
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        Assert.assertFalse(button.isDisplayed());

        WebElement loading = driver.findElement(By.id("loading"));
        Assert.assertTrue(loading.isDisplayed());
        Thread.sleep(7000);              // А что если, прогрузка будет дольше. Поэтому нужно явное ожидание
        Assert.assertFalse(loading.isDisplayed());

        Assert.assertTrue(driver.findElement(By.cssSelector("#finish h4")).isDisplayed());

    }

    @Test
    public void explicitlyVisibilityTest() throws InterruptedException {   //Тест с явным ожиданием
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        WaitService waitService = new WaitService(driver, Duration.ofSeconds(10));

        WebElement button = waitService.waitForVisibilityBy(By.tagName("button"));
        button.click();
        Assert.assertTrue(waitService.waitForElementInvisibleBy(button));

        WebElement loading = waitService.waitForVisibilityBy(By.id("loading"));
        Assert.assertTrue(loading.isDisplayed());
        Assert.assertTrue(waitService.waitForElementInvisibleBy(loading));

        Assert.assertTrue(driver.findElement(By.cssSelector("#finish h4")).isDisplayed());
    }
}
