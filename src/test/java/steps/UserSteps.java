package steps;
import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.login.LoginPage;

public class UserSteps extends BaseStep {
    private LoginPage loginPage;

    public UserSteps(WebDriver driver) {
        super(driver);

        this.loginPage = new LoginPage(driver);
    }

    public void login(String username, String password) {
        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.logInButton.click();
    }

    public CheckoutSteps successfulLogin(String userName, String password) {
        login(userName,password);

        return new CheckoutSteps(driver);
    }
}
