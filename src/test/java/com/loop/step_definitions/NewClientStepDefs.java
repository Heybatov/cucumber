package com.loop.step_definitions;

import com.loop.pages.NewClientPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportUtils;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

public class NewClientStepDefs {

    NewClientPage newClientPage = new NewClientPage();

    @Given("The user is on DOCUPORT login page")
    public void the_user_is_on_docuport_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @When("they visit the URL: Docuport")
    public void they_visit_the_url_docuport() {

    }

    @When("the webpage should load successfully.")
    public void the_webpage_should_load_successfully() {

    }

    @When("the user types LOGIN and PASSWORD for ADVISOR")
    public void the_user_types_login_and_password_for_advisor() {
        DocuportUtils.login(Driver.getDriver(), "advisor");
    }

    @When("they click LOGIN button,")
    public void they_click_login_button() {

    }

    @When("the user sees home page.")
    public void the_user_sees_home_page() {

    }

    @When("the user clicks CLIENTS button")
    public void the_user_clicks_clients_button() {
        newClientPage.clientButton.click();
    }

    @When("they click “Create new client” button and choose PERSONAL,")
    public void they_click_create_new_client_button_and_choose_personal() {
        newClientPage.createNewClient.click();
        newClientPage.personalButton.click();

    }

    @When("the user sees client creation pop up window.")
    public void the_user_sees_client_creation_pop_up_window() {

    }

    @When("the user filled all the information about new client")
    public void the_user_filled_all_the_information_about_new_client() {
        BrowserUtils.justWait(2);
        newClientPage.firstNameNewClient.sendKeys("Spanch");

        newClientPage.lastnameNewClient.sendKeys("Bob");
        newClientPage.createNewClientCheckBox.click();
        newClientPage.emailNewClient.sendKeys("boblk123456789@gmail.com");
        BrowserUtils.justWait(1);
        newClientPage.advisorDropdown.click();
        newClientPage.batch1Group21.click();
        newClientPage.phoneNumber.sendKeys("555-555-5555");
        newClientPage.passwordNewCLient.sendKeys("123456Sb");
        newClientPage.confirmPasswordNewClient.sendKeys("123456Sb");
        newClientPage.saveButton.click();


    }

    @When("they click SAVE button")
    public void they_click_save_button() {


    }

    @When("the user sees Confirmation text - “<CLIENT FULL NAME> been created successfully”")
    public void the_user_sees_confirmation_text_client_full_name_been_created_successfully() {
        BrowserUtils.waitForVisibility(newClientPage.verifyClientCreating, 5);
        newClientPage.verifyClientCreating.isDisplayed();

    }

    @When("the user is redirected to “EDIT CLIENT” page.")
    public void the_user_is_redirected_to_edit_client_page() {
        BrowserUtils.justWait(3);

    }

    @When("the user filled out all fields")
    public void the_user_filled_out_all_fields() {
        newClientPage.serviceButton.click();
        newClientPage.consultancyButton.click();
        newClientPage.advisorDropdown1.click();
        newClientPage.batch1Group21.click();
        BrowserUtils.justWait(1);



        BrowserUtils.justWait(3);
        newClientPage.saveEnd.click();
        //BrowserUtils.waitForVisibility(newClientPage.successMessage, 5);
        //  newClientPage.successMessage.isDisplayed();


    }

    @When("the user sees Confirmation “ <CLIENT FULL NAME> has been updated successfully”")
    public void the_user_sees_confirmation_client_full_name_has_been_updated_successfully() {

    }

    @When("the user LOG OUT of the APP")
    public void the_user_log_out_of_the_app() {
        BrowserUtils.justWait(3);
        newClientPage.bGButton.click();
        newClientPage.logOut.click();

    }

    @When("they LOG IN as a new client which was created")
    public void they_log_in_as_a_new_client_which_was_created() {
        newClientPage.usernameInput.sendKeys("boblk123456789@gmail.com");
        newClientPage.passwordInput.sendKeys("123456Sb");
        newClientPage.loginButton.click();
    }

    @Then("the user should see the home page")
    public void the_user_should_see_the_home_page() {
        newClientPage.homeButton.isDisplayed();
    }


}
