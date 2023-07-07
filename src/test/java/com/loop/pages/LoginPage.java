package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DocuportBasePage {
    @FindBy(xpath = "//label[.='Username or email']/following-sibling::input")
    public WebElement usernameInput;
    @FindBy(xpath = "//label[.='Password']/following-sibling::input")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[.='Home']")
    public WebElement homeButton;
    public void  loginDocuport(String username, String password){
        BrowserUtils.waitForVisibility(usernameInput, 10);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        BrowserUtils.waitForClickable(loginButton,10);
        BrowserUtils.clickWithJS(loginButton);
    }
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}