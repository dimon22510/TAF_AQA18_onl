package sauceDemo.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import sauceDemo.baseEntities.BaseStep;
import sauceDemo.models.User;
import sauceDemo.pages.login.LoginPage;

public class UserSteps extends BaseStep {
    private LoginPage loginPage;
    Logger logger = LogManager.getLogger(LoginPage.class);
    Logger loggerUser = LogManager.getLogger();

    public UserSteps(WebDriver driver) {
        super(driver);

        this.loginPage = new LoginPage(driver);
    }

    public void login(String username, String password) {
        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.logInButton.click();
    }

    public CheckoutSteps successfulLogin(User user) {
        loggerUser.info("This step uses the User object which contains: " + user + " values");
        logger.info("The LoginPage class implements the PageFactory pattern");
        login(user.getUsername(), user.getPassword());

        return new CheckoutSteps(driver);
    }
}

