package homeWork2.saucedemo.steps;

import homeWork2.saucedemo.baseEntities.BaseStep;
import homeWork2.saucedemo.pages.login.CheckProductPage;
import homeWork2.saucedemo.pages.login.LoginUserPage;
import org.openqa.selenium.WebDriver;

public class UserLoginSteps extends BaseStep {
    private LoginUserPage loginUserPage;

    public UserLoginSteps(WebDriver driver) {
        super(driver);

        loginUserPage = new LoginUserPage(driver);
    }

    public void login(String username, String password) {
        loginUserPage.getUserNameInput().sendKeys(username);
        loginUserPage.getPasswordInput().sendKeys(password);
        loginUserPage.getLogInButton().click();
    }

    public CheckProductPage successfulLogin(String username, String password) {
        login(username,password);

        return new CheckProductPage(driver);
    }
}

