package homeWork.baseEntites;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BaseHomeWorkPage {
    protected WebDriver driver;


    public BaseHomeWorkPage(WebDriver driver) {
        this.driver = driver;
    }

    protected abstract By getPageIdentifier();


    public boolean isPageOpened() {
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }



    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);
    }
}
