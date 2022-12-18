package homeWork.steps;

import homeWork.baseEntites.BaseHomeWorkSteps;
import homeWork.pages.finalInformation.DashBoardHomeWork5;
import homeWork.pages.finalInformation.FinalInformationPages;
import org.openqa.selenium.WebDriver;

public class FinalCheckInformationSteps extends BaseHomeWorkSteps {
    private FinalInformationPages finalInformationPages;

    public FinalCheckInformationSteps(WebDriver driver) {
        super(driver);

        finalInformationPages = new FinalInformationPages(driver);
    }

    public void finalInfoCheck() {
        finalInformationPages.getNameProductLocator();
        finalInformationPages.getPriceProductLocator();
        finalInformationPages.getPaymentLocator();
        finalInformationPages.getShippingLocator();
        finalInformationPages.getItemTotalLocator();
        finalInformationPages.getTaxLocator();
        finalInformationPages.getTotalLocator();
        finalInformationPages.getButtonFinishLocator();
    }

    public DashBoardHomeWork5 checkInfo() {
        finalInfoCheck();
        return new DashBoardHomeWork5(driver);
    }
}
