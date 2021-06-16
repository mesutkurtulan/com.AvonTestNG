package com.avon.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Set;

public class TestData {
    public static Faker faker = new Faker();
    public static String invalidEmailAddress = "123gmail.com";
    public static String validEmailAddress = faker.internet().emailAddress();
    public static String LoginRegistrationExpectedUrl = "https://kozmetik.avon.com.tr/musteri/oturum-ac/";
    public static String invalidPassword = "12345";
    public static String invalidFirstName = "???";
    public static String validFirstName = faker.name().firstName();
    public static String invalidLastName = "???";
    public static String validLastName = faker.name().lastName();
    public static String invalidShippingAddress = "???";
    public static String validShippingAddress = faker.address().streetAddress();
    public static WebElement eMail;
    public static WebElement eMailError;
    public static WebElement password;
    public static WebElement passwordError;
    public static WebElement confirmpassword;
    public static WebElement confirmpasswordError;
    public static WebElement province;
    public static WebElement country;
    public static WebElement city;
    public static WebElement contactNumber;
    public static WebElement termsAndConditionsCheckBox;
    public static WebElement submitClick;
    public static WebElement firstName;
    public static WebElement errorFirstName;
    public static WebElement lastName;
    public static WebElement errorLastName;
    public static WebElement shippingAddress;
    public static WebElement errorShippingAddress;
    public static WebElement basketQuantity;
    public static WebElement plusIcon;
    public static String breadcrumbsMakyaj= "Makyaj";
    public static ArrayList<String> socialTabs;

}
