package elements;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CheckBox {
    private List<UIElement> uiElementsList;
    private List<String> valueList;
    private List<String> textList;

    public CheckBox(WebDriver driver, String nameElement) {
        uiElementsList = new ArrayList<>();
        valueList = new ArrayList<>();
        textList = new ArrayList<>();

        for (WebElement webElement : driver.findElements(By.name(nameElement))) {
            UIElement element = new UIElement(driver, webElement);
            uiElementsList.add(element);
            valueList.add(element.getAttribute("value"));
            textList.add(element.findUIElement(By.xpath("parent::*/strong")).getText());
        }
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
