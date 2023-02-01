package page.data_input;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DataInputPage {
    private final By inputFirstNameLocator = By.id("first-name");
    private final By inputLastNameLocator = By.id("last-name");
    private final By inputZIPCodeLocator = By.id("postal-code");
    private final By buttonContinueLocator = By.id("continue");

    public SelenideElement getInputFirstNameLocator() {
        return $(inputFirstNameLocator);
    }

    public SelenideElement getInputLastNameLocator() {
        return $(inputLastNameLocator);
    }

    public SelenideElement getInputZIPCodeLocator() {
        return $(inputZIPCodeLocator);
    }

    public SelenideElement getButtonContinueLocator() {
        return $(buttonContinueLocator);
    }
}
