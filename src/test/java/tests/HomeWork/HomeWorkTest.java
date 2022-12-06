package tests.HomeWork;

import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void validationDataTest() throws InterruptedException {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");

        driver.findElement(By.id("el_f_width")).sendKeys("3");
        driver.findElement(By.id("el_f_lenght")).sendKeys("4");

        WebElement selectWebElement = driver.findElement(By.id("room_type"));
        Select selectRoomType = new Select(selectWebElement);
        selectRoomType.selectByIndex(3);

        WebElement selectWebElementNumber2 = driver.findElement(By.id("heating_type"));
        Select selectHeatingType = new Select(selectWebElementNumber2);
        selectHeatingType.selectByIndex(2);

        driver.findElement(By.id("el_f_losses")).sendKeys("15");


        driver.findElement(By.className("buttHFcalc")).click();


        Assert.assertEquals(driver.findElement(By.id("floor_cable_power")).getAttribute(""),
                "8");

        Assert.assertEquals(driver.findElement(By.id("spec_floor_cable_power")).getAttribute("1"),
                "1");
    }
}
