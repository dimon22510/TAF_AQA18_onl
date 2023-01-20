package saucedemoPageFactory.steps;

import configuration.ReadProperties;
import saucedemoPageFactory.baseEntities.BaseStep;
import saucedemoPageFactory.pages.data_check.DataCheckPage;
import saucedemoPageFactory.pages.data_input.DataInputPage;
import saucedemoPageFactory.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;

public class UserStep extends BaseStep {
    private LoginPage loginPage;
    private DataInputPage dataInputPage;

    public UserStep(WebDriver driver) {
        super(driver);

        loginPage = new LoginPage(driver);
        dataInputPage = new DataInputPage(driver);
    }

    public void login(String username, String password) {
        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.logInButton.click();
    }

    public LoginPage successfulLogin(String username, String password) {
        login(username,password);

        return new LoginPage(driver);
    }

    public void dataInput(String firsName, String lastName, String zipCode) {
        dataInputPage.inputFirstName.sendKeys(firsName);
        dataInputPage.inputLastName.sendKeys(lastName);
        dataInputPage.inputZIPCode.sendKeys(zipCode);
        dataInputPage.buttonContinue.click();
    }

    public DataInputPage goToOverview(String firsName, String lastName, String zipCode) {
        dataInput(firsName,lastName,zipCode);
        return new DataInputPage(driver);
    }

}

