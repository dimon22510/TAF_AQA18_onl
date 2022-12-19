package homeWork2.saucedemo.pages.login;

import homeWork2.saucedemo.baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUserPage extends BasePage {
    private final By userNameInputLocator = By.id("user-name");
    private final By passwordInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");

    public LoginUserPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return logInButtonLocator;
    }

    public WebElement getUserNameInput() { return driver.findElement(userNameInputLocator);}
    public WebElement getPasswordInput() {return driver.findElement(passwordInputLocator);}
    public WebElement getLogInButton() {
        return driver.findElement(logInButtonLocator);
    }
}











