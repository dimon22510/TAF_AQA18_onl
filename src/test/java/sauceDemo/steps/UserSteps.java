package sauceDemo.steps;

import org.openqa.selenium.WebDriver;
import sauceDemo.baseEntities.BaseStep;
import sauceDemo.models.User;
import sauceDemo.pages.login.LoginPage;

public class UserSteps extends BaseStep {
    private LoginPage loginPage;
    private CheckoutSteps checkoutStep;

    public UserSteps(WebDriver driver, CheckoutSteps checkoutStep) {
        super(driver);

        this.loginPage = new LoginPage(driver);
        this.checkoutStep = checkoutStep;
    }

    public void login(String username, String password) {
        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.logInButton.click();
    }

    public CheckoutSteps successfulLogin(User user) {
        login(user.getUsername(), user.getPassword());

        return checkoutStep;
    }
}

