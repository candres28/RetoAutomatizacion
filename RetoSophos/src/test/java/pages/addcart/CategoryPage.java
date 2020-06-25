package pages.addcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {

    @FindBy(how = How.XPATH,using = "//select[@class='sdespacho']")
    WebElement despacho;

    @FindBy(how = How.XPATH,using = "//option[@value='1']")
    WebElement optionDespacho;

    @FindBy(how = How.XPATH,using = "//select[@class='szona']")
    WebElement zona;

    @FindBy(how = How.XPATH,using = "//option[@value='0-2']")
    WebElement optionZona;

    @FindBy(how = How.XPATH,using = "//button[text()='Confirmar']")
    WebElement confirm;

    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Televisor LG LED 43')]")
    WebElement selectProduct;

    public CategoryPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void selectProduct(){
        clickOnElement(despacho);
        clickOnElement(optionDespacho);
        clickOnElement(zona);
        clickOnElement(optionZona);
        clickOnElement(confirm);
        clickOnElement(selectProduct);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }
}
