package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import services.WaitsService;
import java.util.ArrayList;
import java.util.List;

public class DropDownMenu {
    private UIElement uiElement;
    private UIElement menuDropDown;
    private UIElement searchElement;
    private List<UIElement> menuDropDownElementList;
    private List<String> menuDropDownList;
    private WaitsService waitsService;

    public DropDownMenu(WebDriver driver, String dropDownElementId) {
        UIElement dropDownElements = new UIElement(driver, By.id(dropDownElementId));
        uiElement = dropDownElements.findUIElement(By.tagName("a"));
        menuDropDown = dropDownElements.findUIElement(By.className("chzn-results"));
        searchElement = dropDownElements.findUIElement(By.tagName("input"));
        waitsService = new WaitsService(driver);

        menuDropDownElementList = new ArrayList<>();
        menuDropDownList = new ArrayList<>();
        for (UIElement element : menuDropDown.findUIElements(By.tagName("li"))) {
            menuDropDownElementList.add(element);
            menuDropDownList.add(element.getAttribute("innerText"));
        }
    }

    public void showDropDownMenu() {
        if (!menuDropDown.isDisplayed()) {
            uiElement.click();
            waitsService.waitForElementVisible(menuDropDown);
        }
    }

    public void search(String text) {
        showDropDownMenu();
        searchElement.sendKeys(text);
    }

    public void selectByText(String text) {
        showDropDownMenu();
        menuDropDownElementList.get(menuDropDownList.indexOf(text)).click();
    }
}
