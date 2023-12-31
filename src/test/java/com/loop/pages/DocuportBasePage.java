package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocuportBasePage {
    public DocuportBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    
    @FindBy(xpath = "//span[.='Home']")
    private WebElement home_button;
    @FindBy(xpath = "//span[.='Received docs']")
    private WebElement receivedDocs_button;
    @FindBy(xpath = "//span[.='My uploads']")
    private WebElement myUploads_button;
    @FindBy(xpath = "//span[.='Clients']")
    private WebElement clients_button;
    @FindBy(xpath = "//span[.='Invitations']")
    private WebElement invitations_button;
    @FindBy(xpath = "//span[.='Users']")
    private WebElement users_button;
    @FindBy(xpath = "//span[.='Leads']")
    private WebElement leads_button;
    @FindBy(xpath = "//span[.='Bookkeeping']")
    private WebElement bookkeeping_button;
    @FindBy(xpath = "//span[.='1099 Form']")
    private WebElement tenNineForm_button;
    @FindBy(xpath = "//span[.='Reconciliations']")
    private WebElement reconciliations_button;
    @FindBy(xpath = "//span[.=' Continue ']/..")
    private WebElement continueButtonOnClient_button;
    @FindBy(xpath = "//label[.='Username or email']/following-sibling::input")
    public WebElement usernameInput;
    @FindBy(xpath = "//label[.='Password']/following-sibling::input")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[.='Search']")
    public WebElement searchButton;
    @FindBy(xpath = "//i/following-sibling::span[.='Download']")
    public WebElement downloadButton;
    @FindBy(xpath = "//h1[.='Received docs']")
    public WebElement receiveDocsHeader;
    @FindBy(xpath = "//span[.='My uploads']")
    public WebElement myUploadButton;
    @FindBy(xpath = "//i/following-sibling::span[.='Search']")
    public WebElement searchInUploads;
    @FindBy(xpath = "//h1[.='My uploads']")
    public WebElement myUploadHeader;


    public void  loginDocuport(String username, String password){
        BrowserUtils.waitForVisibility(usernameInput, 10);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        BrowserUtils.waitForClickable(loginButton,10);
        BrowserUtils.clickWithJS(loginButton);
    }
    public void clickButton(String button){
        switch (button.toLowerCase()){
            case "home":
                BrowserUtils.clickWithJS( home_button);
                //home_button.click();
                break;
            case "received docs":
                BrowserUtils.clickWithJS( receivedDocs_button);
                //receivedDocs_button.click();
                break;
            case "my uploads":
                BrowserUtils.clickWithJS( myUploads_button);
                //myUploads_button.click();
                break;
            case "clients":
                BrowserUtils.clickWithJS( clients_button);
                //clients_button.click();
                break;
            case "invitations":
                BrowserUtils.clickWithJS( invitations_button);
                //invitations_button.click();
                break;
            case "users":
                BrowserUtils.clickWithJS( users_button);
                //users_button.click();
                break;
            case "leads":
                BrowserUtils.clickWithJS( leads_button);
                //leads_button.click();
                break;
            case "bookkeping":
                BrowserUtils.clickWithJS( bookkeeping_button);
                //bookkeeping_button.click();
                break;
            case "1099 form":
                BrowserUtils.clickWithJS( tenNineForm_button);
                //tenNineForm_button.click();
                break;
            case "reconciliations":
                BrowserUtils.clickWithJS( reconciliations_button);
                //reconciliations_button.click();
                break;
            case "continue":
                BrowserUtils.waitForVisibility(continueButtonOnClient_button,5);
                BrowserUtils.clickWithJS( continueButtonOnClient_button);
                //continueButtonOnClient_button.click();
                BrowserUtils.waitForClickable(tenNineForm_button,3);
                break;
        }
    }
}