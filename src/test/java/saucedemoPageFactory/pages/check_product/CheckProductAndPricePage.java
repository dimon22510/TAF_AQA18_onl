package saucedemoPageFactory.pages.check_product;

import saucedemoPageFactory.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckProductAndPricePage extends BasePage {
    @FindBy(className = "cart_quantity")
    public WebElement checkQuantityProduct;
    @FindBy(className = "inventory_item_name")
    public WebElement checkNameProduct;
    @FindBy(className = "inventory_item_price")
    public WebElement checkPriceProduct;
    @FindBy(id = "checkout")
    public WebElement buttonCheckOut;
    private final By nextPageTitleLocator = By.xpath("//*[text() ='Checkout: Your Information']");
    public CheckProductAndPricePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return nextPageTitleLocator;
    }

//    public WebElement getQuantityProductLocator() {return driver.findElement(checkQuantityProduct);}
//    public WebElement getCheckNameProduct() {return driver.findElement(checkNameProduct);}
//    public WebElement getCheckPriceProduct() {return driver.findElement(checkPriceProduct);}
//    public WebElement getButtonCheckout() {return  driver.findElement(buttonCheckOut);}
}
