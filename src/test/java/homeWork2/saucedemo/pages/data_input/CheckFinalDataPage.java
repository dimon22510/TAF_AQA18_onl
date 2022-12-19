package homeWork2.saucedemo.pages.data_input;

import homeWork2.saucedemo.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckFinalDataPage extends BasePage {
    private final By pageTitleLocator = By.xpath("//*[text()='Checkout: Overview']");

    public CheckFinalDataPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageTitleLocator;
    }
}
