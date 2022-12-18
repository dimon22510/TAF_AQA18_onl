package homeWork.steps;

import homeWork.baseEntites.BaseHomeWorkSteps;
import homeWork.pages.Login.DashboardHomeWorkPage;
import homeWork.pages.Login.LoginHomeWorkPage;
import org.openqa.selenium.WebDriver;

public class UserHomeWorkSteps extends BaseHomeWorkSteps {
    private LoginHomeWorkPage loginHomeWorkPage;

    public UserHomeWorkSteps(WebDriver driver) {
        super(driver);

        loginHomeWorkPage = new LoginHomeWorkPage(driver);
    }

    public void login(String username, String password) {
        loginHomeWorkPage.getUserNameInput().sendKeys(username);
        loginHomeWorkPage.getPasswordInput().sendKeys(password);
        loginHomeWorkPage.getLogInButton().click();
    }

    public DashboardHomeWorkPage loginSuccessful(String username, String password) {
        login(username,password);

        return new DashboardHomeWorkPage(driver);
    }
}
