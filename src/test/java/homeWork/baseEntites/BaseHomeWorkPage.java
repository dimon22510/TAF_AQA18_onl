package homeWork.baseEntites;

import org.openqa.selenium.WebDriver;

public class BaseHomeWorkPage {
    protected WebDriver driver;

    public BaseHomeWorkPage(WebDriver driver) {
        this.driver = driver;
    }
}
