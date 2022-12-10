package tests;

import configuration.ReadProperties;
import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_8 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowserFactory().getDriver();
    }

    @AfterMethod
    public void teatDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void sauceDemoTest() {
        driver.get(ReadProperties.getUrl());

        //Searching for an element by id
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());

        //Searching for an element by name
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());

        //Searching for an element by className
        driver.findElement(By.className("submit-button")).click();

        //Searching for an element by cssSelector(id)
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();

        //Searching for an element by cssSelector(class)
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();

        //Searching for an element by linkText
        Assert.assertEquals(driver.findElement(By.linkText("Sauce Labs Backpack")).getText(),
                "Sauce Labs Backpack");
        //Searching for an element by xPath(attribute)
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='inventory_item_price']")).getText(),
                "$29.99");


    }
}
