package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CategoryPage;
import pages.HomePage;
import pages.ProductPage;

public class AddCartStep {
    private String url = "https://www.plazavea.com.pe/";

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Given("^that is in the section of (.*)$")
    public void thatIsInTheSection(String category) {
        driver.get(url);
        HomePage homePage = new HomePage(driver);
        homePage.selectCategory();
    }

    @When("^adding a product to cart (.*)$")
    public void addingAProductToCart(String product) {
        CategoryPage categoryPage = new CategoryPage(driver);
        ProductPage productPage = new ProductPage(driver);
        categoryPage.selectProduct();
        productPage.addProduct();
    }

    @Then("^confirm that it was added to the cart with message (.*)$")
    public void confirmThatItWasAddedToTheCart(String message) {
        ProductPage productPage = new ProductPage(driver);
        Assert.assertEquals(productPage.isMessage(),message);
    }
}
