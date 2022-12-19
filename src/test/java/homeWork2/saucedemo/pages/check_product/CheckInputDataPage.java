package homeWork2.saucedemo.pages.check_product;

import homeWork2.saucedemo.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckInputDataPage extends BasePage {
    private final By pageTitleLocator = By.xpath("//*[text() ='Checkout: Your Information']");

    public CheckInputDataPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageTitleLocator;
    }
}
