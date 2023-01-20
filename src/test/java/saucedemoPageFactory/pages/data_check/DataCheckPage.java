package saucedemoPageFactory.pages.data_check;

import saucedemoPageFactory.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataCheckPage extends BasePage {
    @FindBy(xpath = "//*[text()='Sauce Labs Bolt T-Shirt']")
    public WebElement checkNameProduct;
    @FindBy(className = "inventory_item_price")
    public WebElement checkPriceProduct;
    @FindBy(xpath = "//*[text()='SauceCard #31337']")
    public WebElement checkPayment;
    @FindBy(xpath = "//*[text()='FREE PONY EXPRESS DELIVERY!']")
    public WebElement checkShippingInformation;
    @FindBy(className = "summary_subtotal_label")
    public WebElement checkItemTotal;
    @FindBy(className = "summary_tax_label")
    public WebElement checkTax;
    @FindBy(className = "summary_total_label")
    public WebElement checkTotalSum;
    @FindBy(id = "finish")
    public WebElement buttonFinish;
    private final By nextPageTitleLocator = By.xpath("//*[text()='THANK YOU FOR YOUR ORDER']");


    public DataCheckPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return nextPageTitleLocator;
    }

}
