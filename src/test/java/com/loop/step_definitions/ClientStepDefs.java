package com.loop.step_definitions;

import com.loop.pages.ClientPage;
import com.loop.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.*;
import org.assertj.core.api.SoftAssertions;

import static org.junit.Assert.*;

public class ClientStepDefs {
    ClientPage clientPage = new ClientPage();
    private Logger LOG = LogManager.getLogger();

    private SoftAssertions softAssertions = new SoftAssertions();


    @When("user validate choose account pop up is visible")
    public void user_validate_choose_account_pop_up_is_visible() {
        BrowserUtils.waitForVisibility(clientPage.chooseAccountText, 5);
//        assertTrue(clientPage.chooseAccountText.isDisplayed());
//        assertTrue(clientPage.chooseAccountText.getText().equals("Choose Account"));
//        assert (clientPage.chooseAccountText.getText().equals("Choose account"));
        softAssertions.assertThat(clientPage.chooseAccountText.getText()).isEqualTo("Choose account");
        LOG.info("Account text is visible");
    }

    @When("user chooses account from dropdown")
    public void user_chooses_account_from_dropdown() {
        // assertTrue(clientPage.continueButton.isDisplayed());
        softAssertions.assertThat(clientPage.continueButton.isDisplayed()).isTrue();
        softAssertions.assertThat(clientPage.continueButton.getText()).isEqualTo("Continue");
        clientPage.continueButton.click();
        softAssertions.assertAll();
    }
}
