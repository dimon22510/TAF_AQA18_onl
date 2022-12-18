package homeWork.steps;

import homeWork.baseEntites.BaseHomeWorkSteps;
import homeWork.pages.productCheck.DashBoardHomeWork3;
import homeWork.pages.productCheck.ProductCheckPage;
import org.openqa.selenium.WebDriver;

public class ProductCheckSteps extends BaseHomeWorkSteps {
    private ProductCheckPage productCheckPage;

    public ProductCheckSteps(WebDriver driver) {
        super(driver);

        productCheckPage = new ProductCheckPage(driver);
    }

    public void checkProductName() {
        productCheckPage.getCheckNameProduct();

    }

    public void checkProductPrice() {
        productCheckPage.getCheckPriceProduct();
    }

    public void clickButton() {
        productCheckPage.getButtonCheckout().click();
    }

    public DashBoardHomeWork3 checkNameProduct() {
        checkProductName();
        return new DashBoardHomeWork3(driver);
    }

    public DashBoardHomeWork3 checkPriceProduct() {
        checkProductPrice();
        return new DashBoardHomeWork3(driver);
    }

    public DashBoardHomeWork3 clickButtonCheckout() {
        clickButton();
        return new DashBoardHomeWork3(driver);
    }

}
