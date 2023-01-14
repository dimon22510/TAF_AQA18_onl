package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DropDownMenu {
//    private UIElement uiElement;
//
//
//
//    public DropDownMenu(WebDriver driver, By by) {
//        this.uiElement = new UIElement(driver, by);
//    }
//
//    public void selectDropDownMenu(boolean flag) {
//        if (flag != uiElement.isSelected()) {
//            uiElement.click();
//        }
//    }
//
//    public void clickDropDownMenu(){
//        selectDropDownMenu(true);
//    }

    private List<UIElement> uiElementsListDropDown;
    private List<UIElement> searchElement;
    private UIElement uiElement;

    public DropDownMenu (WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }

    public DropDownMenu (WebDriver driver, String allListDropDown) {
        uiElementsListDropDown = new ArrayList<>();
        searchElement = new ArrayList<>();


        for (WebElement webElement : driver.findElements(By.className(allListDropDown))){
            UIElement element = new UIElement(driver, webElement);
            uiElementsListDropDown.add(element);
            searchElement.add(element);
        }
    }

    public void selectByIndexTemplateElement(int index) {
        uiElementsListDropDown.get(index).click();
    }


    public void clickInputTemplateElement(int index) {
        searchElement.get(index).click();
    }

    public void selectLiId(boolean flag) {
        if (flag != uiElement.isSelected()) {
            uiElement.click();
        }
    }

    public void clickLiId() {
        selectLiId(true);
    }










}
