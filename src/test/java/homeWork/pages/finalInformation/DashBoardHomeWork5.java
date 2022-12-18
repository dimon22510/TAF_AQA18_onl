package homeWork.pages.finalInformation;

import homeWork.baseEntites.BaseHomeWorkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardHomeWork5 extends BaseHomeWorkPage {
private final By pageTitleLocator = By.xpath("//*[text()='THANK YOU FOR YOUR ORDER']");

    public DashBoardHomeWork5(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageTitleLocator;
    }
}
