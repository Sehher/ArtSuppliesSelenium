package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SeleniumTest {

    private ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\ArtSuppliesSelenium\\src\\test\\java\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void deleteDisplayTest() throws InterruptedException {
        driver.get("http://34.89.69.35/index.html");
        Thread.sleep(1000); //This keeps the window open for 2 seconds before closing it
        WebElement deleteButton = driver.findElementByXPath("//*[@id=\"cardList\"]/div[1]/div[2]/button[1]");
        Thread.sleep(1000);
        assertTrue(deleteButton.isDisplayed());
    }

    @Test
    public void deleteTest() throws InterruptedException {
        driver.get("http://34.89.69.35/index.html");
        Thread.sleep(1000); //This keeps the window open for 2 seconds before closing it
        WebElement deleteButton = driver.findElementByXPath("//*[@id=\"cardList\"]/div[1]/div[2]/button[1]");
        Thread.sleep(1000);
        deleteButton.click();
        Thread.sleep(1000);
    }




}
