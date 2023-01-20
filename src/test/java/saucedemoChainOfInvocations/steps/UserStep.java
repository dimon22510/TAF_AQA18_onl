package saucedemoChainOfInvocations.steps;

import org.openqa.selenium.WebDriver;
import saucedemoChainOfInvocations.baseEntities.BaseStep;
import saucedemoChainOfInvocations.pages.login.LoginPage;

public class UserStep extends BaseStep {
    private LoginPage loginPage;
    private CheckoutStep checkoutStep;

    public UserStep(WebDriver driver, CheckoutStep checkoutStep) {
        super(driver);

        this.loginPage = new LoginPage(driver);
        this.checkoutStep = checkoutStep;
    }

    public void login(String username, String password) {
        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.logInButton.click();
    }

    public CheckoutStep successfulLogin(String username, String password) {
        login(username,password);

        return checkoutStep;
    }
}

