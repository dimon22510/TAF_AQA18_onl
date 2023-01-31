package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage  {
    // Блок описания локаторов для эментов
    private final By emailInputLocator = By.id("name");
    private final By passwordInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("button_primary");
    private final By errorTextLocator = By.className("error-text");


    // Блок атомарных методов
    public SelenideElement getEmailInput() {
        return $(emailInputLocator).should(visible);
    }

    public SelenideElement getPassword() {
        return $(passwordInputLocator).should(visible);
    }

    public SelenideElement getLogInButton() {
        return $(logInButtonLocator).should(visible);
    }

    public SelenideElement getErrorTextElement() {
        return $(errorTextLocator).should(visible);
    }
}
