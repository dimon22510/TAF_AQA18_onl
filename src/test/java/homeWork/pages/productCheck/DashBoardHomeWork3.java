package homeWork.pages.productCheck;

import homeWork.baseEntites.BaseHomeWorkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardHomeWork3 extends BaseHomeWorkPage {
    private final By pageTitleLocator21 = By.xpath("//*[text() ='Checkout: Your Information']");
    public DashBoardHomeWork3(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageTitleLocator21;
    }
}
