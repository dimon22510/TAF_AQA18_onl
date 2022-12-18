package homeWork.pages.Login;

import homeWork.baseEntites.BaseHomeWorkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardHomeWorkPage extends BaseHomeWorkPage {
    private final By headerTitleLabelLocator = By.className("peek");

    public DashboardHomeWorkPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }





}
