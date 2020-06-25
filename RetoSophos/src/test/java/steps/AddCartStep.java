package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.addcart.CategoryPage;
import pages.addcart.HomePage;
import pages.addcart.ProductPage;

public class AddCartStep {
    private String url = "https://www.plazavea.com.pe/";
    public WebDriverWait wait;

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Given("^that is in the section of Televisores$")
    public void thatIsInTheSection() {
        driver.get(url);
        HomePage homePage = new HomePage(driver);
        CategoryPage categoryPage = new CategoryPage(driver);
        if (homePage.validatePoppup()) {
            homePage.closePoppup();
        }
        homePage.selectCategory();
        categoryPage.selectProduct();
    }

    @When("^adding a product to cart LG TV LED$")
    public void addingAProductToCart() {
        ProductPage productPage = new ProductPage(driver);
        productPage.addProduct();
    }

    @Then("^confirm that it was added to the cart with message (.*)$")
    public void confirmThatItWasAddedToTheCart(String message) {
        ProductPage productPage = new ProductPage(driver);
        Assert.assertEquals(productPage.isMessage(), message);
    }
}
