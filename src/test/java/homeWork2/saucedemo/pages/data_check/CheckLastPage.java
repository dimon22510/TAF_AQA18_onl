package homeWork2.saucedemo.pages.data_check;

import homeWork2.saucedemo.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckLastPage extends BasePage {
    private final By pageTitleLocator = By.xpath("//*[text()='THANK YOU FOR YOUR ORDER']");

    public CheckLastPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageTitleLocator;
    }
}
