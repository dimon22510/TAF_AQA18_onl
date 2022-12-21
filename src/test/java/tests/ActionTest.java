package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionTest extends BaseTest {

//    @Test
//    public void hoverTest() {
//        driver.get("http://the-internet.herokuapp.com/hovers");
//
//        List<WebElement> targetElements = waitService.waitForAllVisibleElementsLocatedBy(By.className("figure"));
//
//        Actions actions = new Actions(driver);
//        actions
//                .moveToElement(targetElements.get(0), 10, 10)
//                .click(waitService.waitForExists(By.cssSelector("[href='/users/1']")))
//                .build()
//                .perform();
//
//        Assert.assertTrue(waitService.waitForElementInvisibleBy(targetElements.get(0)));
//    }

//    @Test
//    public void fileUploadTest() throws InterruptedException {
//        driver.get("http://the-internet.herokuapp.com/upload");
//
//        WebElement fileUploadElement = waitService.waitForExists(By.xpath("//input[@type='file']"));
//        String pathToFile = ActionTest.class.getClassLoader().getResource("download.jpeg").getPath().substring(1);
//        System.out.println(pathToFile);
//
//        fileUploadElement.sendKeys(pathToFile);
//        waitService.waitForVisibilityBy(By.id("file-submit")).submit();
//
//        Assert.assertEquals(waitService.waitForVisibilityBy(By.id("uploaded-files")).getText().trim(),
//                "download.jpeg");
//    }
}
