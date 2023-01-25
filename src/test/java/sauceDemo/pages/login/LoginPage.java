package sauceDemo.pages.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sauceDemo.baseEntities.BasePage;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement userNameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(id = "login-button")
    public WebElement logInButton;

    Logger logger = LogManager.getLogger();


    public LoginPage(WebDriver driver) {
        super(driver);

        logger.info("В классе LoginPage реализован паттерн PageFactory");
    }

    @Override
    protected WebElement getPageIdentifier() {
        return logInButton;
    }
}











