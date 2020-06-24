package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(how = How.XPATH,using = "//div[@class='CategoriesAnchor__item']//h6[text()='Televisores']")
    WebElement category;

    @FindBy(how = How.XPATH,using = "//span[@class='BannerModalPrecyber__close pvaicon pvaicon-14-close']")
    WebElement poppup;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectCategory(){
        clickOnElement(poppup);
        clickOnElement(category);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }
}
