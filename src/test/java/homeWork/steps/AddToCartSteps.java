package homeWork.steps;

import homeWork.baseEntites.BaseHomeWorkSteps;
import homeWork.pages.AddToCart.AddToCartPage;
import homeWork.pages.AddToCart.DashBoardHomeWork2;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps extends BaseHomeWorkSteps {
   private AddToCartPage addToCartPage;

    public AddToCartSteps(WebDriver driver) {
        super(driver);

        addToCartPage = new AddToCartPage(driver);
    }

    public void addToCart() {
        addToCartPage.getButtonAddToCart().click();
        addToCartPage.getCartButton().click();
    }

    public DashBoardHomeWork2 addToCartSuccessful() {
        addToCart();

        return new DashBoardHomeWork2(driver);
    }
}
