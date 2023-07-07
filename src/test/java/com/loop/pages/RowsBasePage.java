package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;
public class RowsBasePage extends DocuportBasePage {
    @FindBy(xpath = "//div[contains(@class,'comma')]")
    private WebElement rowsNum;
    @FindBy(xpath = "//i[contains(@class,'menu-down')]")
    private WebElement changeTo;

    public void rowsVerification(int num){
        assertEquals(num,Integer.parseInt(rowsNum.getText()));
    }
    public void changeTheRowsPerPage(int num){
        changeTo.click();
        Driver.getDriver().findElement(By.xpath("//div[.='"+num+"' and @role='option']")).click();
    }
    public RowsBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
