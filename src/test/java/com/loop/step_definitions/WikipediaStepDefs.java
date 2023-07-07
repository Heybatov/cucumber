package com.loop.step_definitions;

import com.loop.pages.WikipediaSearchPage;
import com.loop.utilities.BrowserUtils;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikipediaStepDefs {
    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia"));

    }

    @When("user searches {string} in the wiki search box")
    public void user_searches_in_the_wiki_search_box(String string) {
        wikipediaSearchPage.searchBox.sendKeys(string);
        wikipediaSearchPage.submitButton.click();
    }

    @Then("user should see {string} is in the wiki title")
    public void user_should_see_is_in_the_wiki_title(String titleName) {
        Assert.assertEquals(titleName, Driver.getDriver().getTitle());
    }

    @Then("user should see {string} is in the main header")
    public void user_should_see_is_in_the_main_header(String header) {

        Assert.assertEquals(header, wikipediaSearchPage.header.getText());
    }


    @Then("user should see {string} is in the image header")
    public void user_should_see_is_in_the_image_header(String imageHeader) {
        Assert.assertEquals(imageHeader, wikipediaSearchPage.imageHeader.getText());

    }

    @Given("The user is on Wikipedia home page")
    public void the_user_is_on_wikipedia_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia"));
    }
    @When("the user types {string} in the wiki search box")
    public void the_user_types_in_the_wiki_search_box(String string) {
        wikipediaSearchPage.searchBox.sendKeys(string);
        wikipediaSearchPage.submitButton.click();
    }


    @Then("user sees the {string} in {string}")
    public void user_sees_the_in(String name , String verification) {
        switch (verification){
            case "Title":
                Assert.assertEquals(name+" - Wikipedia", Driver.getDriver().getTitle());
                break;
            case "Header":
                Assert.assertEquals(name, wikipediaSearchPage.header.getText());
                break;
            case "Image Header":
                Assert.assertEquals(name, wikipediaSearchPage.imageHeader.getText());
                break;
        }
    }
}
