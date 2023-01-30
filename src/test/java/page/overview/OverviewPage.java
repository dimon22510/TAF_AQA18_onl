package page.overview;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class OverviewPage {
    private final By buttonFinishLocator = By.id("finish");
    private final By completePageLocator = By.xpath("//h2[contains(text(), 'THANK YOU FOR YOUR ORDER')]");

    public SelenideElement getButtonFinishLocator() {
        return $(buttonFinishLocator).should(visible);
    }

    public boolean isPageOpened() {
        return $(completePageLocator).isDisplayed();
    }
}
