package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import services.WaitsService;

import java.util.ArrayList;
import java.util.List;

public class DropDownMenu {
    private List<UIElement> uiElementsListDropDown;
    private UIElement uiElement;
    private WaitsService waitsService;

    public DropDownMenu (WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }

    public DropDownMenu (WebDriver driver, String allListDropDown) {
        uiElementsListDropDown = new ArrayList<>();
        this.waitsService = new WaitsService(driver);

        for (WebElement webElement : driver.findElements(By.className(allListDropDown))){
            UIElement element = new UIElement(driver, webElement);
            uiElementsListDropDown.add(element);
        }
    }

    public void selectionByIndexDropDownMenuElement(int index) {
        uiElementsListDropDown.get(index).click();
    }

    public void selectionLiIdElement(boolean condition) {
        if (condition != uiElement.isSelected()) {
            uiElement.click();
        }
    }

    public void clickLiIdElement() {
        selectionLiIdElement(true);
    }
}
