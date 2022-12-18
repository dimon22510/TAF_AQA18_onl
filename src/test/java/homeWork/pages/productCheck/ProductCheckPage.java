package homeWork.pages.productCheck;

import homeWork.baseEntites.BaseHomeWorkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCheckPage extends BaseHomeWorkPage {
private final By checkNameProductLocator = By.className("inventory_item_name");
private final By checkPriceProductLocator = By.className("inventory_item_price");
private final By checkQuantityProductLocator = By.className("cart_quantity");
private final By buttonCheckOutLocator = By.id("checkout");

    public ProductCheckPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonCheckOutLocator;
    }

    public WebElement getCheckNameProduct() {return driver.findElement(checkNameProductLocator);}
    public WebElement getCheckPriceProduct() {return driver.findElement(checkPriceProductLocator);}
    public WebElement getButtonCheckout() {return  driver.findElement(buttonCheckOutLocator);}
    public WebElement getQuantityProductLocator() {return driver.findElement(checkQuantityProductLocator);}
}
