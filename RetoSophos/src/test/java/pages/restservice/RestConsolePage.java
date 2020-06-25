package pages.restservice;

import models.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RestConsolePage {

    private Data data;

    @FindBy(how = How.XPATH, using = "//select[@ng-model='request.method']")
    WebElement requestMethod;

    @FindBy(how = How.XPATH, using = "//option[text()='POST']")
    WebElement typeRequest;

    @FindBy(how = How.XPATH, using = " //button[@ng-click='addData($event)']")
    WebElement addData;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.name'])[1]")
    WebElement inputFirstName;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.value'])[1]")
    WebElement valueFirstName;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.name'])[2]")
    WebElement inputLastName;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.value'])[2]")
    WebElement valueLastName;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.name'])[3]")
    WebElement inputEmail;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.value'])[3]")
    WebElement valueEmail;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.name'])[4]")
    WebElement inputPhone;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.value'])[4]")
    WebElement valuePhone;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.name'])[5]")
    WebElement inputGender;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='data.value'])[5]")
    WebElement valueGender;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-success']")
    WebElement send;

    @FindBy(how = How.XPATH, using = "//pre[@class='alert ng-binding alert-success']")
    WebElement responseRequest;


    public RestConsolePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void restConsole(Data data) {
        clickOnElement(requestMethod);
        clickOnElement(typeRequest);
        clickOnElementFor(addData);
        sendText(inputFirstName, data.getFirstname());
        sendText(valueFirstName, data.getValuefirst());
        sendText(inputLastName, data.getLastname());
        sendText(valueLastName, data.getValuelastname());
        sendText(inputEmail, data.getEmail());
        sendText(valueEmail, data.getValueemail());
        sendText(inputPhone, data.getPhone());
        sendText(valuePhone, data.getValuephone());
        sendText(inputGender, data.getGender());
        sendText(valueGender, data.getValuegender());
        clickOnElement(send);
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void clickOnElementFor(WebElement element) {
        for (int i = 1; i <= 4; i++) {
            element.click();
        }
    }

    public void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public String isMessage() {
        return responseRequest.getText();
    }

}
