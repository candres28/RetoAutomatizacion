package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {

    @FindBy(how = How.XPATH,using = "//img[@alt='LG TV LED SMART 43UM7100']")
    WebElement selectProduct;

    public CategoryPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void selectProduct(){
        clickOnElement(selectProduct);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }
}
