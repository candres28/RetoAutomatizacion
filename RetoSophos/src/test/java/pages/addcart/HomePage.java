package pages.addcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(how = How.ID, using = "event-nonfood")
    WebElement category;

    @FindBy(how = How.XPATH, using = " //a[text()='TV LED']")
    WebElement categoryTV;

    @FindBy(how = How.XPATH, using = "//span[@class='BannerModalPrecyber__close pvaicon pvaicon-14-close']")
    WebElement poppup;

    @FindBy(how = How.XPATH, using = "//input[@class='BannerModalPrecyber__register__input']")
    WebElement validatePoppup;



    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void closePoppup() {
        clickOnElement(poppup);
    }

    public boolean validatePoppup() {
        return validatePoppup.isEnabled();
    }

    public void selectCategory() {
        clickOnElement(category);
        clickOnElement(categoryTV);
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }
}
