package com.loop.step_definitions;

import com.loop.pages.RowsBasePage;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Map;
public class RowsStepDefs {
    RowsBasePage rowsBasePage = new RowsBasePage();
    private final Logger LOG = LogManager.getLogger();
    @When("the user login as an ADVISOR")
    public void the_user_login_as_an_advisor(Map<String, String> login) {
        rowsBasePage.usernameInput.sendKeys(login.get("username"));
        rowsBasePage.passwordInput.sendKeys(login.get("password"));
        rowsBasePage.loginButton.click();
        LOG.info("User log in as an ADVISOR");
    }
    @When("the user clicks {string}")
    public void the_user_clicks(String string) throws InterruptedException {
        Thread.sleep(5);
        rowsBasePage.clickButton(string);
        LOG.info("User clicks on "+string);
    }
    @When("the user changes Rows Per Page to {int}")
    public void the_user_changes_rows_per_page_to(int int1) {
        rowsBasePage.changeTheRowsPerPage(int1);
        LOG.info("User change rows to "+int1);
    }
    @Then("the user sees that Rows Per Page shows {int}")
    public void the_user_sees_that_rows_per_page_shows(int int1) {
        rowsBasePage.rowsVerification(int1);
        LOG.info("User verify rows per page is "+int1);
    }
}