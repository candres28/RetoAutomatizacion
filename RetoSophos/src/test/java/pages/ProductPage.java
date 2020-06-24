package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(how = How.ID,using = "ProductCard__add-to-cart")
    WebElement product;

    @FindBy(how = How.XPATH,using = "//span[text()='El producto se agregó al carrito']")
    WebElement message;


    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addProduct(){
        clickOnElement(product);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public String isMessage(){
        return message.getText();
    }
}
