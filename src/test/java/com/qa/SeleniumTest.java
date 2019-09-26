package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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
    public void searchTest() throws InterruptedException {
        driver.get("http://google.com");
        Thread.sleep(2000); //This keeps the window open for 2 seconds before closing it
        WebElement searchField = driver.findElement(By.name("q"));
        assertTrue(searchField.isDisplayed());
        searchField.sendKeys("funny cat pictures"); //adds text to search field
        Thread.sleep(5000);



//        driver.findElement(By.xpath())
//                driver.findElement(By.cssSelector()) These are for when the element doesn't have an ID
    }


}
