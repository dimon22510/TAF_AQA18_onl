package steps;

import models.User;
import page.login.LoginPage;

public class UserStep {
    private LoginPage loginPage;

    public UserStep() {
        loginPage = new LoginPage();
    }

    public void login(String userName, String password) {
        loginPage.getUserNameInputLocator().setValue(userName);
        loginPage.getPasswordInputLocator().setValue(password);
        loginPage.getLoginButtonLocator().click();
    }

    public CheckoutSteps loginSuccessful(User user) {
        login(user.getUserName(),user.getPassword());
        return new CheckoutSteps();
    }
}
