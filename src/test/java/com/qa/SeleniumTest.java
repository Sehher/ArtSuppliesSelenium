package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;


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
        Thread.sleep(1000);
        WebElement deleteButton = driver.findElementByXPath("//*[@id=\"cardList\"]/div[1]/div[2]/button[1]");
        Thread.sleep(1000);
        assertTrue(deleteButton.isDisplayed());
    }

    @Test
    public void deleteTest() throws InterruptedException {
        driver.get("http://34.89.69.35/index.html");
        Thread.sleep(1000);
        WebElement addButton = driver.findElementByXPath("/html/body/center/button");
        Thread.sleep(1000);
        addButton.click();
        Thread.sleep(1000);
        WebElement productName = driver.findElementByXPath("//*[@id=\"InputName\"]");
        assertTrue(productName.isDisplayed());
        productName.sendKeys("Oil Paint");
        Thread.sleep(1000);
        WebElement categoryName = driver.findElementByXPath("//*[@id=\"InputCategory\"]");
        categoryName.sendKeys("Paint");
        Thread.sleep(1000);
        WebElement description = driver.findElementByXPath("//*[@id=\"InputDescription\"]");
        description.sendKeys("Slow drying Paint");
        Thread.sleep(1000);
        WebElement url = driver.findElementByXPath("//*[@id=\"InputImageLink\"]");
        url.sendKeys("https://imgs.michaels.com/MAM/assets/1/726D45CA1C364650A39CD1B336F03305/img/85DCA835551945A5B976482AF84ED9DB/10452898_2_u.jpg?fit=inside|1024:1024");
        Thread.sleep(1000);
        WebElement submit = driver.findElementByXPath("/html/body/center/div[2]/div/div/div[2]/form/button");
        submit.click();
        Thread.sleep(1000);
        WebElement close = driver.findElementByXPath("//*[@id=\"myModal\"]/div/div/div[1]/button");
        close.click();
        Thread.sleep(1000);
        WebElement deleteButton = driver.findElementByXPath("//*[@id=\"cardList\"]/div/div[2]/button[1]");
        Thread.sleep(1000);
        deleteButton.click();
        Thread.sleep(1000);

        assertFalse(deleteButton.ifPresent());
    }

    @Test
    public void createTest() throws InterruptedException {
        driver.get("http://34.89.69.35/index.html");
        Thread.sleep(1000);
        WebElement addButton = driver.findElementByXPath("/html/body/center/button");
        Thread.sleep(1000);
        addButton.click();
        Thread.sleep(1000);
        WebElement productName = driver.findElementByXPath("//*[@id=\"InputName\"]");
        assertTrue(productName.isDisplayed());
        productName.sendKeys("Oil Paint");
        Thread.sleep(1000);
        WebElement categoryName = driver.findElementByXPath("//*[@id=\"InputCategory\"]");
        categoryName.sendKeys("Paint");
        Thread.sleep(1000);
        WebElement description = driver.findElementByXPath("//*[@id=\"InputDescription\"]");
        description.sendKeys("Slow drying Paint");
        Thread.sleep(1000);
        WebElement url = driver.findElementByXPath("//*[@id=\"InputImageLink\"]");
        url.sendKeys("https://imgs.michaels.com/MAM/assets/1/726D45CA1C364650A39CD1B336F03305/img/85DCA835551945A5B976482AF84ED9DB/10452898_2_u.jpg?fit=inside|1024:1024");
        Thread.sleep(1000);
        WebElement submit = driver.findElementByXPath("/html/body/center/div[2]/div/div/div[2]/form/button");
        submit.click();
        Thread.sleep(1000);
        WebElement header = driver.findElementByXPath("//*[@id=\"cardList\"]/div/div[1]/div[2]/h4");
        assertEquals("Oil Paint",header.getText());
    }



}
