package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {
    @FindBy(xpath = "//i[.='Search']")
    public WebElement submitButton;
    @FindBy(className = "mw-page-title-main")
    public WebElement header;

    @FindBy(className = "fn")
    public WebElement imageHeader;

    @FindBy(xpath = "//*[@id='searchInput']")
    public WebElement searchBox;


    public WikipediaSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}