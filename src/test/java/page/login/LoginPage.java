package page.login;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final By userNameInputLocator = By.cssSelector("#user-name");
    private final By passwordInputLocator = By.cssSelector("#password");
    private final By loginButtonLocator = By.cssSelector("#login-button");

    public SelenideElement getUserNameInputLocator() {
        return $(userNameInputLocator).should(visible);
    }

    public SelenideElement getPasswordInputLocator() {
        return $(passwordInputLocator).should(visible);
    }

    public SelenideElement getLoginButtonLocator() {
        return $(loginButtonLocator).should(visible);
    }
}
