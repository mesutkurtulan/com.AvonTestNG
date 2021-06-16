package com.avon.tests;

import com.avon.utilities.TestBase;
import com.avon.utilities.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_MiniBasketFunctionalityIsWAD extends TestBase {

    @Test //Step 1 Select an item in the website // Product page will open
    public void Step01() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='HeaderSubmenus']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//div[@class='ProductList Columns_2 ReadyToDisplay']/div[1]/div/div/div/a")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"Breadcrumbs\"]/div[2]/a/span")).getText(), TestData.breadcrumbsMakyaj);
    }
    @Test  //Step 2 Click 'Add to bag' link.
    public void Step02() {
        driver.findElement(By.xpath("//div[@class='add-to-cart-container']/div/div[2]/div")).click();
    }

    @Test  //Step 3 Observe the mini basket / Quantity will be 1 in the mini basket
    public void Step03() {
        TestData.basketQuantity = driver.findElement(By.xpath("//span[@ng-bind='CartSummary.LastProductChanged.Quantity']"));
        Assert.assertEquals(TestData.basketQuantity.getText(), "1");
    }

    @Test  // Step 4 Set the quantity to 2 by clicking on plus once / 2 will be displayed
    public void Step04() throws InterruptedException {
        TestData.plusIcon = driver.findElement(By.xpath("//div[@class='add-to-cart-container']/div/div[3]/div"));
        TestData.plusIcon.click();
        Thread.sleep(1000);
        Assert.assertEquals(TestData.basketQuantity.getText(), "2");
    }
    @Test  // Step 5 Set the quantity to 3 by clicking on plus once / 3 will be displayed
    public void Step05() throws InterruptedException {
        TestData.plusIcon.click();
        Thread.sleep(1000);
        Assert.assertEquals(TestData.basketQuantity.getText(), "3");
    }
}
