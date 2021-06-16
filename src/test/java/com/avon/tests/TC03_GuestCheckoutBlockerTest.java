package com.avon.tests;

import com.avon.utilities.TestBase;
import org.testng.annotations.Test;

public class TC03_GuestCheckoutBlockerTest extends TestBase {
    TC01_ValidationsOfRegistrationFieldsIsWorking object = new TC01_ValidationsOfRegistrationFieldsIsWorking();

    @Test // Step-1; Click on 'Customer Login / Registration' button
    public void Step01() throws InterruptedException {
        object.step01();
    }

    @Test // Step-2; Click 'Create an account' button
    public void Step02() throws InterruptedException {
        object.Step02();
    }

    @Test // Step-3; Type an invalid e-mail address in 'Email Address*' field (for example'123gmail.com'.)
    public void Step03() {
        object.Step03();
    }

    @Test // Step 4 Type a valid e-mail in 'Email Address*' edit box.
    public void Step04(){
        object.Step04();
    }

    @Test // Step 5 Type a less than 6 character password in 'Password' field.
    public void Step05(){
        object.Step05();
    }

    @Test // Step 6 Type a more than 5 character password in 'Password*' field
    public void Step06(){
        object.Step06();
    }

    @Test // Step 7 Type a wrong password in 'Confirm Password*' field.
    public void Step07(){
        object.Step07();
    }

    @Test // Step 8 Type the good password in 'Confirm Password*' field
    public void Step08(){
        object.Step08();
    }
    @Test // Step 9 Type a name which contains not only the appropriate language's ABC letters in 'First Name*' field
    public void Step09(){
        object.Step09();
    }

    @Test // Step 10 Type a name which contains only the appropriate language's ABC letters in 'First Name*' field
    public void Step10(){
        object.Step10();
    }

    @Test // Step 11 Type a name which contains not only the appropriate language's ABC letters in 'Last Name*' field
    public void Step11(){
        object.Step11();
    }

    @Test // Step 12 Type a name which contains only the appropriate language's ABC letters in 'Last Name*' field
    public void Step12(){
        object.Step12();
    }

    @Test // Step 13 Type an address in 'Address' field
    public void Step13(){
        object.Step13();
    }

    @Test // Step 14 Select a city in 'City *' field.
    public void Step14() throws InterruptedException {
        object.Step14();
    }

    @Test // Step 15 Select a County in 'County *' field.
    public void Step15(){
        object.Step15();;
    }

    @Test // Step 16 Select a City in 'City *' field.
    public void Step16(){
        object.Step16();
    }

    @Test // Step 17 Type a wrong formatted mobile number in 'Mobile number*' field or some text
    public void Step17(){
        object.Step17();
    }

    @Test // Step 18 Type a correct mobile number in 'Mobile number*'field
    public void Step18(){
        object.Step18();
    }

    @Test // Step 19 Click on Continue Botton. ("Şartlar ve koşulları kabul etmelisin" ikazı çıkmalıdır)
    public void Step19(){
        object.Step19();
    }

    @Test // Step 20 Click Button for "Aydınlanma Metni ve Kullanım Koşulları". ("Şartlar ve koşulları kabul etmelisin" ikazı kaybolmalıdır.)
    public void Step20(){
        object.Step20();
    }

    @Test // Step 21 Click on Continue Botton.
    public void Step21(){
        object.Step21();
    }

    @Test //Step 22 I log out // Log out is successful
    public void Step22(){

    }
}
