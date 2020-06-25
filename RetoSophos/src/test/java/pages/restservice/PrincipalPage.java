package pages.restservice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {

    @FindBy(how = How.XPATH,using = "//a[text()= 'Rest Console']")
    WebElement restConsole;

    public PrincipalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void restConsole(){
        clickOnElement(restConsole);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

}
