package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CheckBox {
    private UIElement uiElement;
    private List<UIElement> uiElementsList;
    private List<String> valueList;
    private List<String> textList;

    public CheckBox(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }

    public CheckBox(WebDriver driver, String attributeNameValue) {
        uiElementsList = new ArrayList<>();
        valueList = new ArrayList<>();
        textList = new ArrayList<>();

        for (WebElement webElement : driver.findElements(By.name(attributeNameValue))) {
            UIElement element = new UIElement(driver, webElement);
            uiElementsList.add(element);
            valueList.add(element.getAttribute("value"));
            textList.add(element.findUIElement(By.xpath("parent::*/strong")).getText());
        }
    }

    public void selectCheckBox(boolean condition) {
        if (condition != uiElement.isSelected()) {
            uiElement.click();
        }
    }

    public void clickCheckBox() {
        selectCheckBox(true);
    }

    public void removeCheckBox() {
        selectCheckBox(false);
    }

    public void selectByIndex(int index) {
        uiElementsList.get(index).click();
    }

    public void selectByValue(String value) {
        uiElementsList.get(valueList.indexOf(value)).click();
    }

    public void selectByText(String text) {
        uiElementsList.get(textList.indexOf(text)).click();
    }
}
