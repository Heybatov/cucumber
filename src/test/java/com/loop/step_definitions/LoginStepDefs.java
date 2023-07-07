package com.loop.step_definitions;

import com.loop.pages.DocuportBasePage;
import com.loop.pages.LoginPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;

import java.util.Map;

import static org.junit.Assert.assertTrue;


public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    DocuportBasePage docuportBasePage = new DocuportBasePage();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters username for client")
    public void user_enters_username_for_client() throws InterruptedException {
        Thread.sleep(2000);
        BrowserUtils.waitForClickable(loginPage.loginButton, 10);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
    }

    @When("user enters password for client")
    public void user_enters_password_for_client() throws InterruptedException {
        BrowserUtils.waitForClickable(loginPage.passwordInput, 10);
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() throws InterruptedException {
        BrowserUtils.waitForClickable(loginPage.loginButton, 10);
        loginPage.loginButton.click();
    }

    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {
        BrowserUtils.waitForVisibility(loginPage.homeButton, 10);
        loginPage.homeButton.isDisplayed();
    }

    @When("user enters username for employee")
    public void userEntersUsernameForEmployee() {
        BrowserUtils.waitForClickable(loginPage.loginButton, 10);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
    }

    @When("user enters password for employee")
    public void userEntersPasswordForEmployee() {
        BrowserUtils.waitForClickable(loginPage.passwordInput, 10);
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }

    @Then("user should see the home page for employee")
    public void userShouldSeeTheHomePageForEmployee() {
        BrowserUtils.waitForVisibility(loginPage.homeButton, 10);
        loginPage.homeButton.isDisplayed();
    }

    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {
        BrowserUtils.waitForVisibility(loginPage.loginButton, 10);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_ADVISOR);
    }

    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {
        BrowserUtils.waitForClickable(loginPage.loginButton, 10);
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }

    @Then("user should see the home page for advisor")
    public void user_should_see_the_home_page_for_advisor() {
        BrowserUtils.waitForVisibility(loginPage.homeButton, 10);
        loginPage.homeButton.isDisplayed();
    }

    @When("user enters username for admin")
    public void user_enters_username_for_admin() {
        BrowserUtils.waitForClickable(loginPage.loginButton, 10);
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
    }

    @When("user enters password for admin")
    public void user_enters_password_for_admin() {
        BrowserUtils.waitForClickable(loginPage.passwordInput, 10);
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }

    @Then("user should see the home page for admin")
    public void user_should_see_the_home_page_for_admin() {
        BrowserUtils.waitForVisibility(loginPage.homeButton, 10);
        loginPage.homeButton.isDisplayed();
    }

    @When("user enters credentials")
    public void user_enters_credentials(Map<String, String> credentials) {
//        for (Map.Entry<String, String> entry : credentials.entrySet()) {
//            String key = entry.getKey();
//            System.out.println("key = "+key);
//            String value = entry.getValue();
//            System.out.println("value = " + value);
//        }
        loginPage.loginDocuport(credentials.get("username"), credentials.get("password"));


    }

}