package homeWork2.saucedemo.pages.login;

import homeWork2.saucedemo.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckProductPage extends BasePage {
    private final By pageTitleLocator = By.className("peek");

    public CheckProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageTitleLocator;
    }
}
