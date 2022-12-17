package homeWork.pages;

import homeWork.baseEntites.BaseHomeWorkPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginHomeWorkPage extends BaseHomeWorkPage {
    private final By userNameInputLocator = By.id("user-name");
    private final By passwordInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");


    public LoginHomeWorkPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserNameInput() {return driver.findElement(userNameInputLocator);}
    public WebElement getPasswordInput() {return driver.findElement(passwordInputLocator);}
    public WebElement getLogInButton() {return  driver.findElement(logInButtonLocator);}
}
