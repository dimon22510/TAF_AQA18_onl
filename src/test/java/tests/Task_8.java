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
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void sauceDemoTest() throws InterruptedException {
        driver.get(ReadProperties.getUrl());

        //Поиск элемента по id
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());
        //Поиск элемента по name
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());
        //Поиск элемента по className
        driver.findElement(By.className("submit-button")).click();
        //Поиск элемента по cssSelector(id)
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        //Поиск элемента по xPath(class)
       Assert.assertEquals( driver.findElement(By.xpath("//*[@class='inventory_item_price']")).getText(),
               "$29.99");


    }
}
