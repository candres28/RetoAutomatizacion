package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Data;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.restservice.PrincipalPage;
import pages.restservice.RestConsolePage;

import java.util.List;

public class RestServiceStep {
    private String url = "https://gorest.co.in/";

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Given("^user is on the home page$")
    public void userIsOnTheHomePage() {
        driver.get(url);
        PrincipalPage principalPage = new PrincipalPage(driver);
        principalPage.restConsole();
    }

    @When("^The user is consuming a rest service POST$")
    public void theUserIsConsumingARestServicePOST(List<Data> data) {
        RestConsolePage restConsolePage = new RestConsolePage(driver);
        restConsolePage.restConsole(data.get(0));
    }

    @Then("^the user observes the response the code (.*)$")
    public void theUserObservesTheResponseTheCode(String code) {
        RestConsolePage restConsolePage = new RestConsolePage(driver);
        String responseCode = restConsolePage.isMessage();
        Assert.assertTrue(responseCode.contains(code));
    }
}
