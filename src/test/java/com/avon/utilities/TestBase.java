package com.avon.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected static WebDriver driver;

    @BeforeClass
    protected static void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://kozmetik.avon.com.tr/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@title='Çerezleri Kabul Et']")).click();
    }
    @AfterClass
    protected static void tearDown(){
        //driver.quit();
    }

}
