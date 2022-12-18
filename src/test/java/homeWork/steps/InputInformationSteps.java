package homeWork.steps;

import homeWork.baseEntites.BaseHomeWorkSteps;
import homeWork.pages.inputInformation.DashBoardHomeWork4;
import homeWork.pages.inputInformation.InputInformationPages;
import org.openqa.selenium.WebDriver;

public class InputInformationSteps extends BaseHomeWorkSteps {
    private InputInformationPages inputInformationPages;

    public InputInformationSteps(WebDriver driver) {
        super(driver);

        inputInformationPages = new InputInformationPages(driver);
    }

    public void inputInformation() {
        inputInformationPages.getFirstNameLocator().sendKeys("Egor");
        inputInformationPages.getLastNameLocator().sendKeys("Olegovich");
        inputInformationPages.getZipCodeLocator().sendKeys("12345");
        inputInformationPages.getButtonContinueLocator().click();
    }

    public DashBoardHomeWork4 inputAllInformation() {
        inputInformation();
        return new DashBoardHomeWork4(driver);
    }
}
