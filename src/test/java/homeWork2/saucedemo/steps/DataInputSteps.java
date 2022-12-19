package homeWork2.saucedemo.steps;

import homeWork2.saucedemo.baseEntities.BaseStep;
import homeWork2.saucedemo.pages.data_input.CheckFinalDataPage;
import homeWork2.saucedemo.pages.data_input.DataInputPage;
import org.openqa.selenium.WebDriver;

public class DataInputSteps extends BaseStep {
    protected DataInputPage dataInputPage;

    public DataInputSteps(WebDriver driver) {
        super(driver);

        dataInputPage = new DataInputPage(driver);
    }

    public void dataInput() {
        dataInputPage.getFirstNameLocator().sendKeys("Egor");
        dataInputPage.getLastNameLocator().sendKeys("Olegovich");
        dataInputPage.getZipCodeLocator().sendKeys("12345");
        dataInputPage.getButtonContinueLocator().click();
    }

    public CheckFinalDataPage dataInputAndClick() {
        dataInput();

        return new CheckFinalDataPage(driver);
    }
}
