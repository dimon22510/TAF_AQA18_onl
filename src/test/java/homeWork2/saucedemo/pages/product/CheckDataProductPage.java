package homeWork2.saucedemo.pages.product;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckDataProductPage extends BasePage {
    private final By pageTitleLocator = By.xpath("//*[text()='Your Cart']");

    public CheckDataProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageTitleLocator;
    }
}
