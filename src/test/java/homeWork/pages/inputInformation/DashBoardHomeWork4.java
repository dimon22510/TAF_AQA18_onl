package homeWork.pages.inputInformation;

import homeWork.baseEntites.BaseHomeWorkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardHomeWork4 extends BaseHomeWorkPage {
private final By pageTitleLocator3 = By.xpath("//*[text()='Checkout: Overview']");

    public DashBoardHomeWork4(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageTitleLocator3;
    }
}
