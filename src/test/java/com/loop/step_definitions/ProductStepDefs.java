package com.loop.step_definitions;

import com.google.common.base.Equivalence;
import com.loop.pages.ProductPage;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.Driver;
import io.cucumber.java.en.*;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductStepDefs {
    ProductPage productPage = new ProductPage();

    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("product.url"));
    }

    @Then("User should be able to see expected prices in following products")
    public void user_should_be_able_to_see_expected_prices_in_following_products(List<Map<String, String>> productDetails) {

        for (Map<String, String> productDetail : productDetails) {
            System.out.println("==========Product Details========");
            System.out.println(productDetail.get("Category"));
            System.out.println(productDetail.get("Product"));
            System.out.println(productDetail.get("expectedPrice"));

            productPage.clickCategory(productDetail.get("Category"));
            String actualPrice = productPage.getProductPrice(productDetail.get("Product"));// get price from UI

            String expectedPrice = productDetail.get("expectedPrice"); // get price from feature file

            Assert.assertEquals(expectedPrice, actualPrice);

        }

//
//        String actualPrice= productPage.getProductPrice(productDetail.get("Product"));// get price from UI
//
//        String expectedPrice = productDetail.get("expectedPrice"); // get price from feature file
//
//        Assert.assertEquals(expectedPrice,actualPrice);

    }



    @Then("User should be able to see expected prices in following products with listOflist")
    public void user_should_be_able_to_see_expected_prices_in_following_products_with_list_oflist(List<List<String>> productDetails) {

        for(List<String> productDetail : productDetails){
            System.out.println("==========Product Details========");
            System.out.println(productDetail.get(0));
            System.out.println(productDetail.get(1));
            System.out.println(productDetail.get(2));


            productPage.clickCategory(productDetail.get(0));
            String actualPrice = productPage.getProductPrice(productDetail.get(1));
            String expectedPrice = productDetail.get(2);

            Assert.assertEquals(expectedPrice,actualPrice);
        }



    }

    @Then("User should be able to see following names in their groups")
    public void user_should_be_able_to_see_following_names_in_their_groups(Map<String , List<String>> students) {

        List<String> group1 = students.get("Group1");
        System.out.println("group1 = " + group1);


        List<String> group2 = students.get("Group2");
        System.out.println("group2 = " + group2);



        List<String> group3 = students.get("Group3");
        System.out.println("group3 = " + group3);

    }


    @Test
    public void WindowHandle() {
        Driver.getDriver().get("https://nxtgenaiacademy.com/multiplewindows/%22");


                String CurrentHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();
        Set<String>windowHandles = Driver.getDriver().getWindowHandles();
        for (String eachWindow:windowHandles) {
            Driver.getDriver().switchTo().window(eachWindow);
            if(Driver.getDriver().getTitle().contains("NxtGen")){
                Driver.getDriver().manage().window().maximize();
                Driver.getDriver().close();
//                break;
            }
        }
    }


}
