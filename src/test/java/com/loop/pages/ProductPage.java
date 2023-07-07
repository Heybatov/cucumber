package com.loop.pages;

import com.loop.utilities.BrowserUtils;
import com.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ProductPage {

    @FindBy(xpath = "//a[@onclick=\"byCat('phone')\"]")
    public WebElement phone;
    @FindBy(xpath = "//a[@onclick=\"byCat('notebook')\"]")
    public WebElement laptop;

    @FindBy(xpath = "//a[@onclick=\"byCat('monitor')\"]")
    public WebElement monitor;


    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickCategory(String category) {

        Driver.getDriver().findElement(By.xpath("//a[.='" + category + "']")).click();
        BrowserUtils.justWait(2);
    }

    public String getProductPrice(String product) {

        String actualPrice = Driver.getDriver().findElement(By.xpath("//a[normalize-space(.)='" + product + "']/../../h5")).getText();
        return actualPrice.substring(1);
    }

    public String productDetail(String detail) {

        return "";
    }
}