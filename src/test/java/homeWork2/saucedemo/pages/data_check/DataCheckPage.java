package homeWork2.saucedemo.pages.data_check;

import homeWork2.saucedemo.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataCheckPage extends BasePage {
    private final By checkNameProductLocator = By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']");
    private final By checkPriceProductLocator = By.className("inventory_item_price");
    private final By checkPaymentLocator = By.xpath("//*[text()='SauceCard #31337']");
    private final By checkShippingInformationLocator = By.xpath("//*[text()='FREE PONY EXPRESS DELIVERY!']");
    private final By checkItemTotal = By.className("summary_subtotal_label");
    private final By checkTax = By.className("summary_tax_label");
    private final By checkTotalSum = By.className("summary_total_label");
    private final By buttonFinishLocator = By.id("finish");

    public DataCheckPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return buttonFinishLocator;
    }

    public WebElement getNameProductLocator() {return driver.findElement(checkNameProductLocator);}
    public WebElement getPriceProductLocator() {return  driver.findElement(checkPriceProductLocator);}
    public WebElement getPaymentLocator() {return driver.findElement(checkPaymentLocator);}
    public WebElement getShippingLocator() {return driver.findElement(checkShippingInformationLocator);}
    public WebElement getItemTotalLocator() {return driver.findElement(checkItemTotal);}
    public WebElement getTaxLocator() {return  driver.findElement(checkTax);}
    public WebElement getTotalSumLocator() {return driver.findElement(checkTotalSum);}
    public WebElement getButtonFinishLocator() {return driver.findElement(buttonFinishLocator);}
}
