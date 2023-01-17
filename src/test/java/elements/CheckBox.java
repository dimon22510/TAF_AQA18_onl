package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    private UIElement uiElement;

    public CheckBox(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }


    public void setCheckBox() {
        clickCheckBox(true);
    }

    public void removeCheckBox() {
        clickCheckBox(false);
    }

    public boolean isSelected() {
        return uiElement.isSelected();
    }

    private void clickCheckBox(boolean condition) {
        if(condition != isSelected()) {
            uiElement.click();
        }
    }
}
