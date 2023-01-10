package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button {
    private UIElement uiElement;

    public Button(WebDriver driver, By by) {
        this.uiElement = uiElement;
    }

    public Button(WebDriver driver, WebElement webElement) {
        this.uiElement = uiElement;
    }

    public void click() {
        uiElement.click();
    }

    public void isEnabled() {
        uiElement.isEnabled();
    }
}
