package homeWork2.saucedemo.pages.check_product;

import homeWork2.saucedemo.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckProductAndPricePage extends BasePage {
    private final By checkQuantityProductLocator = By.className("cart_quantity");
    private final By checkNameProductLocator = By.className("inventory_item_name");
    private final By checkPriceProductLocator = By.className("inventory_item_price");
    private final By buttonCheckOutLocator = By.id("checkout");

    public CheckProductAndPricePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonCheckOutLocator;
    }

    public WebElement getQuantityProductLocator() {return driver.findElement(checkQuantityProductLocator);}
    public WebElement getCheckNameProduct() {return driver.findElement(checkNameProductLocator);}
    public WebElement getCheckPriceProduct() {return driver.findElement(checkPriceProductLocator);}
    public WebElement getButtonCheckout() {return  driver.findElement(buttonCheckOutLocator);}
}
