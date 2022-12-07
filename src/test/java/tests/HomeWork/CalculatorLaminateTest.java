package tests.HomeWork;

import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorLaminateTest {               //Не разобрался с рекламой, если при начале теста прокрутить вниз до результатов,
    private WebDriver driver;                       //то тест выполниться, а если ничего не трогать, не прожимается кнопка результата.

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


    @Test()
    public void dataInputTest() throws InterruptedException {
        driver.get("https://calc.by/building-calculators/laminate.html");

        driver.findElement(By.id("ln_room_id")).sendKeys(Keys.CONTROL + "a"); //Можно такой вариант удаления из строки использовать
        driver.findElement(By.id("ln_room_id")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("ln_room_id")).sendKeys("5463");
        driver.findElement(By.id("wd_room_id")).clear(); // А можно и такой, я читал он не всегда срабатывает
        driver.findElement(By.id("wd_room_id")).sendKeys("2312");
        driver.findElement(By.id("ln_lam_id")).clear();
        driver.findElement(By.id("ln_lam_id")).sendKeys("964");
        driver.findElement(By.id("wd_lam_id")).clear();
        driver.findElement(By.id("wd_lam_id")).sendKeys("236");
        driver.findElement(By.id("n_packing")).clear();
        driver.findElement(By.id("n_packing")).sendKeys("9");

        WebElement selectWebElement = driver.findElement(By.id("laying_method_laminate"));
        Select selectLayingMethodLaminate = new Select(selectWebElement);
        selectLayingMethodLaminate.selectByValue("1");


        driver.findElement(By.id("indent_walls_id")).clear();
        driver.findElement(By.id("indent_walls_id")).sendKeys("8");
        driver.findElement(By.id("direction-laminate-id2")).click();
        driver.findElement(By.linkText("Рассчитать")).click();


        Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Требуемое количество досок ламината: ']")).getText(),
                "Требуемое количество досок ламината: 5625");

        Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Количество упаковок ламината: ']")).getText(),
                "Количество упаковок ламината: 625");


    }


}
