package com.avon.tests;

import com.avon.utilities.TestBase;
import com.avon.utilities.TestData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class TC04_SocialMedia extends TestBase {

    @Test // Step-01; Click Facebook button
    public void Step01(){
        driver.findElement(By.xpath("//span[text()=' Facebook']")).click();
    }

    @Test // Step-02; Click Instagram button
    public void Step02(){
        driver.findElement(By.xpath("//span[text()=' Instagram']")).click();
    }

    @Test // Step-03; Click Twitter button
    public void Step03(){
        driver.findElement(By.xpath("//span[text()=' Twitter']")).click();
    }

    @Test // Step-04; Click Youtube button
    public void Step04(){
        driver.findElement(By.xpath("//span[text()=' Youtube']")).click();
    }

    @Test // Step-05; Click Pinterest button  Tiktok
    public void Step05(){
        driver.findElement(By.xpath("//span[text()=' Pinterest']")).click();
    }

    @Test // Step-06; Click Tiktok button
    public void Step06(){
        driver.findElement(By.xpath("//span[text()=' Tiktok']")).click();
    }

    @Test // Step-07; Go to Facebook and Get Title
    public void Step07(){
        TestData.socialTabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(TestData.socialTabs.get(6));
        System.out.println("Facebook Title= " + driver.getTitle());
    }

    @Test // Step-08; Go to Instagram and Get Title
    public void Step08(){
        driver.switchTo().window(TestData.socialTabs.get(5));
        System.out.println("Instagram Title= " + driver.getTitle());
    }
    @Test // Step-09; Go to Twitter and Get Title
    public void Step09(){
        driver.switchTo().window(TestData.socialTabs.get(4));
        System.out.println("Twitter Title= " + driver.getTitle());
    }
    @Test // Step-10; Go to Youtube and Get Title
    public void Step10(){
        driver.switchTo().window(TestData.socialTabs.get(3));
        System.out.println("Youtube Title= " + driver.getTitle());
    }
    @Test // Step-11; Go to Pinterest and Get Title
    public void Step11(){
        driver.switchTo().window(TestData.socialTabs.get(2));
        System.out.println("Pinterest Title= " + driver.getTitle());
    }
    @Test // Step-12; Go to Tiktok and Get Title
    public void Step12(){
        driver.switchTo().window(TestData.socialTabs.get(1));
        System.out.println("Tiktok Title= " + driver.getTitle());
    }

}
