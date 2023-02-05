package stepDefs.sauceDemo;

import baseEntities.BaseCucumberTest;
import configuration.ReadProperties;
import factory.BrowserFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.sauceDemo.overview.OverviewPage;
import steps.sauceDemo.CheckoutSteps;
import steps.sauceDemo.UserSteps;

public class SuccessfulOrderScenarioStep extends BaseCucumberTest {
    private BaseCucumberTest baseCucumberTest;
    private CheckoutSteps checkoutSteps;
    private OverviewPage overviewPage;

    public SuccessfulOrderScenarioStep(BaseCucumberTest baseCucumberTest) {
        this.baseCucumberTest = baseCucumberTest;

    }

    @Given("open browser")
    public void startBrowser() {
        driver = new BrowserFactory().getDriver();
    }

    @When("open login page")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrl());
    }

    @When("user {string} with password {string} logged in")
    public void userWithPasswordLoggedIn(String username, String password) {
        UserSteps userSteps = new UserSteps(driver);
        checkoutSteps = userSteps.successfulLogin(username, password);
    }

    @And("user added the item to cart")
    public void addToCartProduct() {
        checkoutSteps.addToCartProduct();
    }

    @And("user went to the cart page")
    public void goToCartPage() {
        checkoutSteps.goToCartPage();
    }


    @And("user clicked on the checkout button")
    public void clickButtonCheckout() {
        checkoutSteps.clickButtonCheckOut();
    }

    @And("user enters the data to be sent: FirstName {string} , LastName {string} , ZipCode {string}")
    public void userEntersHisOrHerData(String firstName, String lastName, String zipCode) {
        checkoutSteps.dataInputAndGoToOverview(firstName,lastName,zipCode);
    }

    @And("user successfully paid for the order")
    public void userSuccessfullyPaidForTheOrder() {
        overviewPage = checkoutSteps.clickFinish();
    }


    @Then("page with the successful order is open")
    public void pageWithTheSuccessfulOrderIsOpen() {
       Assert.assertTrue(overviewPage.isPageOpened());
    }
}


