package com.avon.tests;

import com.avon.utilities.TestData;
import com.avon.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TC01_ValidationsOfRegistrationFieldsIsWorking extends TestBase {

    @Test (groups = { "checkinTest" }) // Step-1; Click on 'Customer Login / Registration' button
    public void  step01() throws InterruptedException {
        driver.findElement(By.xpath("//span[.='Müşteri Girişi']")).click();
        Thread.sleep(1000);
        String actualURL= driver.getCurrentUrl();
        Assert.assertEquals(actualURL, TestData.LoginRegistrationExpectedUrl);
    }
    @Test // Step-2; Click 'Create an account' button
    public void Step02(){
        driver.findElement(By.linkText("ŞİMDİ ÜYE OL")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//section[@id='Registration']")).isDisplayed());
    }

    @Test // Step-3; Type an invalid e-mail address in 'Email Address*' field (for example'123gmail.com'.)
    public void Step03() {
        TestData.eMail = driver.findElement(By.id("RegistrationEmail"));
        TestData.eMail.sendKeys(TestData.invalidEmailAddress);
        TestData.eMailError = driver.findElement(By.xpath("(//span[.='Geçerli bir e-posta adresi girmelisin'])[4]"));
        System.out.println();
        Assert.assertTrue(TestData.eMailError.isDisplayed());
    }

    @Test // Step 4 Type a valid e-mail in 'Email Address*' edit box.
    public void Step04(){
        TestData.eMail.clear();
        TestData.eMail.sendKeys(TestData.validEmailAddress);
        Assert.assertFalse(TestData.eMailError.isDisplayed());
    }

    @Test // Step 5 Type a less than 6 character password in 'Password' field.
    public void Step05(){
        TestData.password = driver.findElement(By.id("RegistrationPassword"));
        TestData.password.sendKeys(TestData.invalidPassword);
        TestData.passwordError = driver.findElement(By.xpath("//span[.='Rakam ve harflerden oluşan en az 6 karakter girmelisin.']"));
        Assert.assertTrue(TestData.passwordError.isDisplayed());
    }

    @Test // Step 6 Type a more than 5 character password in 'Password*' field
    public void Step06(){
        TestData.password.clear();
        TestData.password.sendKeys("Test01!");
        try {
            Assert.assertFalse(TestData.passwordError.isDisplayed());
        } catch (StaleElementReferenceException e) {
        }
    }

    @Test // Step 7 Type a wrong password in 'Confirm Password*' field.
    public void Step07(){
        TestData.confirmpassword = driver.findElement(By.id("RegistrationConfirmPassword"));
        TestData.confirmpassword.sendKeys("12345");
        TestData.confirmpasswordError = driver.findElement(By.xpath("//span[.='Şifreler eşleşmiyor']"));
        Assert.assertTrue(TestData.confirmpasswordError.isDisplayed());
    }

    @Test // Step 8 Type the good password in 'Confirm Password*' field
    public void Step08(){
        TestData.confirmpassword.clear();
        TestData.confirmpassword.sendKeys("Test01!");
        try {
            Assert.assertFalse(TestData.confirmpasswordError.isDisplayed());
        } catch (StaleElementReferenceException e) {
        }
    }
    @Test // Step 9 Type a name which contains not only the appropriate language's ABC letters in 'First Name*' field
    public void Step09(){
        TestData.firstName = driver.findElement(By.id("RegistrationFirstName"));
        TestData.firstName.sendKeys(TestData.invalidFirstName);
        TestData.errorFirstName = driver.findElement(By.xpath("//span[.='Lütfen geçerli bir ad gir']"));
        Assert.assertTrue(TestData.errorFirstName.isDisplayed());
    }

    @Test // Step 10 Type a name which contains only the appropriate language's ABC letters in 'First Name*' field
    public void Step10(){
        TestData.firstName.clear();
        TestData.firstName.sendKeys(TestData.validFirstName);
        Assert.assertFalse(TestData.errorFirstName.isDisplayed());
    }

    @Test // Step 11 Type a name which contains not only the appropriate language's ABC letters in 'Last Name*' field
    public void Step11(){
        TestData.lastName = driver.findElement(By.id("RegistrationLastName"));
        TestData.lastName.sendKeys(TestData.invalidLastName);
        TestData.errorLastName = driver.findElement(By.xpath("//span[.='Lütfen geçerli soyad gir']"));
        Assert.assertTrue(TestData.errorLastName.isDisplayed());
        }

    @Test // Step 12 Type a name which contains only the appropriate language's ABC letters in 'Last Name*' field
    public void Step12(){
        TestData.lastName.clear();
        TestData.lastName.sendKeys(TestData.validLastName);
        Assert.assertFalse(TestData.errorLastName.isDisplayed());
    }

    @Test // Step 13 Type an address in 'Address' field
    public void Step13(){
        TestData.shippingAddress = driver.findElement(By.id("ShippingAddress1"));
        TestData.shippingAddress.sendKeys(TestData.validShippingAddress);
        TestData.errorShippingAddress = driver.findElement(By.xpath("//span[.='Minimum 3 maksimum 60 karakter girebilirsiniz.']"));
        Assert.assertFalse(TestData.errorShippingAddress.isDisplayed());
    }

    @Test // Step 14 Select a city in 'City *' field.
    public void Step14() throws InterruptedException {
        TestData.province = driver.findElement(By.id("ShippingProvinceDropDown"));
        TestData.province.click();
        List<WebElement> provinceList = driver.findElements(By.id("ShippingProvinceDropDown"));
        for (WebElement each : provinceList) {
            System.out.println(each.getText());
        }
        driver.findElement(By.xpath("//li[@id='ui-select-choices-row-3-11']")).click();
    }

    @Test // Step 15 Select a County in 'County *' field.
    public void Step15(){
        TestData.country = driver.findElement(By.id("ShippingCountyDropDown"));
        TestData.country.click();
        List<WebElement> countryList = driver.findElements(By.id("ShippingCountyDropDown"));
        for (WebElement each : countryList) {
            System.out.println(each.getText());
        }
        driver.findElement(By.xpath("//li[@id='ui-select-choices-row-4-0']")).click();
    }

    @Test // Step 16 Select a City in 'City *' field.
    public void Step16(){
        TestData.city = driver.findElement(By.id("ShippingCityDropDown"));
        TestData.city.click();
        List<WebElement> cityList = driver.findElements(By.id("ShippingCityDropDown"));
        for (WebElement each : cityList) {
            System.out.println(each.getText());
        }
        driver.findElement(By.xpath("//li[@id='ui-select-choices-row-5-0']")).click();
    }

    @Test // Step 17 Type a wrong formatted mobile number in 'Mobile number*' field or some text
    public void Step17(){
        TestData.contactNumber = driver.findElement(By.id("RegistrationContactNumber"));
        TestData.contactNumber.sendKeys("1111111111");
        Assert.assertTrue(driver.findElement(By.xpath("//span[.='Geçersiz telefon numarası. Lütfen telefon numaranın 10 haneli olduğundan emin ol. (Ör:5xxxxxxxxx)']")).isDisplayed());
    }

    @Test // Step 18 Type a correct mobile number in 'Mobile number*'field
    public void Step18(){
        TestData.contactNumber.clear();
        TestData.contactNumber.sendKeys("5111111111");
        Assert.assertFalse(driver.findElement(By.xpath("//span[.='Geçersiz telefon numarası. Lütfen telefon numaranın 10 haneli olduğundan emin ol. (Ör:5xxxxxxxxx)']")).isDisplayed());
    }

    @Test // Step 19 Click on Continue Botton. ("Şartlar ve koşulları kabul etmelisin" ikazı çıkmalıdır)
    public void Step19(){
        TestData.submitClick  = driver.findElement(By.xpath("//span[.='Devam Et']"));
        TestData.submitClick.click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[.='Şartlar ve koşulları kabul etmelisin']")).isDisplayed());
    }

    @Test // Step 20 Click Button for "Aydınlanma Metni ve Kullanım Koşulları". ("Şartlar ve koşulları kabul etmelisin" ikazı kaybolmalıdır.)
    public void Step20(){
        TestData.termsAndConditionsCheckBox  = driver.findElement(By.xpath("//div[@name='AgreedTerms']"));
        TestData.termsAndConditionsCheckBox.click();
        Assert.assertFalse(driver.findElement(By.xpath("//span[.='Şartlar ve koşulları kabul etmelisin']")).isDisplayed()); //#AgreedTerms
    }

    @Test // Step 21 Click on Continue Botton.
    public void Step21(){
        TestData.submitClick.click();

    }

}
