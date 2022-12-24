package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test
    public void fileUploadTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/upload");

        WebElement fileUpload = waitService.waitForVisibilityBy(By.id("file-upload"));
        String pathToFile = FileUploadTest.class.getClassLoader()
                .getResource("picture.jpg")
                .getPath()
                .substring(1);
        fileUpload.sendKeys(pathToFile);

        waitService.waitForVisibilityBy(By.id("file-submit")).submit();
        Assert.assertEquals(waitService.waitForVisibilityBy(By.id("uploaded-files")).getText().trim(),
                "picture.jpg");
    }
}
