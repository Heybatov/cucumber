package com.loop.step_definitions;

import com.loop.pages.LoginPage;
import com.loop.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.*;
import org.openqa.selenium.Keys;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class DocuportSteDefs {
    LoginPage loginPage = new LoginPage();
    private final Logger LOG= LogManager.getLogger();
    @When("user enters credentials {string} and {string}")
    public void user_enters_credentials_and(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
        if (username.equals("b1g2_client@gmail.com")) {
            loginPage.clickButton("Continue");
        }
    }
    @When("click on received documents")
    public void click_on_received_documents() {
        loginPage.clickButton("Recieved docs");
    }
    @When("validate following in received are displayed")
    public void validate_following_in_received_are_displayed(List<String> list) {
        for (String each : list) {
            switch (each) {
                case "search":
                    assertTrue(loginPage.searchButton.isDisplayed());
                    break;
                case "download":
                    assertTrue(loginPage.downloadButton.isDisplayed());
                    break;
                case "receive docs":
                    assertTrue(loginPage.receiveDocsHeader.isDisplayed());
                    break;
            }
        }
    }
       @When("click on my upload")
    public void click_on_my_upload() {
        BrowserUtils.justWait(2);
        loginPage.myUploadButton.click();
    }
    @Then("validate following in uploads are displayed")
    public void validate_following_in_uploads_are_displayed(List<String> list1) {
        for (String each : list1) {
            switch (each) {
                case "search":
                    assertTrue(loginPage.searchInUploads.isDisplayed());
                    break;
                case "download":
                    assertTrue(loginPage.downloadButton.isDisplayed());
                    break;
                case "uploads":
                    assertTrue(loginPage.myUploadHeader.isDisplayed());
                    break;
            }
        }
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password + Keys.ENTER);
        switch (username){
            case"b1g2_client@gmail.com":
                loginPage.clickButton("continue");
                LOG.info("LOGGED IN AS CLIENT");
                break;
            case"b1g2_advisor@gmail.com":
                LOG.info("LOGGED IN AS ADVISOR");
                break;
            case"b1g2_supervisor@gmail.com":
                LOG.info("LOGGED IN AS SUPERVISOR");
                break;
            case"b1g2_employee@gmail.com":
                LOG.info("LOGGED IN AS EMPLOYEE");
                break;
        }
    }
    @When("user clicks on {string}")
    public void user_clicks_on(String button) {
        loginPage.clickButton(button);
        LOG.info("CLICKED "+ button.toUpperCase());
    }
    @When("user sees {string} is displayed")
    public void user_sees_is_displayed(String validation) {
        switch (validation){
            case "Search":
                assertTrue(loginPage.searchButton.isDisplayed());
                LOG.info("Search is displayed");
                break;
            case "Download":
                assertTrue(loginPage.downloadButton.isDisplayed());
                LOG.info("Download is displayed");
                break;
            case "Received docs":
                assertTrue(loginPage.receiveDocsHeader.isDisplayed());
                LOG.info("Received docs is displayed");
                break;
            case "My uploads":
                assertTrue(loginPage.myUploadHeader.isDisplayed());
                LOG.info("My uploads is displayed");
                break;
        }
    }
}