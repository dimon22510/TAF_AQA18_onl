package homeWork.pages.AddToCart;

import homeWork.baseEntites.BaseHomeWorkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardHomeWork2 extends BaseHomeWorkPage {
    private final By pageTitleLocator = By.xpath("//*[text()='Your Cart']");

    public DashBoardHomeWork2(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return pageTitleLocator;
    }

//    public DashBoardHomeWork2(WebDriver driver, boolean openPageByUrl) {
//        super(driver);
//
//        if (openPageByUrl) {
//            openPageByUrl();
//        }
//    }


//    public void openPageByUrl() {
//        super.openPageByUrl(pagePath);
//    }
}
