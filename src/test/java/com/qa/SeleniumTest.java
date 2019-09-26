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

        WebElement addButton1 = driver.findElementByXPath("/html/body/center/button");
        Thread.sleep(1000);
        addButton1.click();
        Thread.sleep(1000);
        WebElement productName1 = driver.findElementByXPath("//*[@id=\"InputName\"]");
        assertTrue(productName1.isDisplayed());
        productName1.clear();
        productName1.sendKeys("acrylic Paint");
        Thread.sleep(1000);
        WebElement categoryName1 = driver.findElementByXPath("//*[@id=\"InputCategory\"]");
        categoryName1.clear();
        categoryName1.sendKeys("Paint");
        Thread.sleep(1000);
        WebElement description1 = driver.findElementByXPath("//*[@id=\"InputDescription\"]");
        description1.clear();
        description1.sendKeys("Slow drying Paint");
        Thread.sleep(1000);
        WebElement url1 = driver.findElementByXPath("//*[@id=\"InputImageLink\"]");
        url1.clear();
        url1.sendKeys("https://imgs.michaels.com/MAM/assets/1/726D45CA1C364650A39CD1B336F03305/img/85DCA835551945A5B976482AF84ED9DB/10452898_2_u.jpg?fit=inside|1024:1024");
        Thread.sleep(1000);
        WebElement submit1 = driver.findElementByXPath("/html/body/center/div[2]/div/div/div[2]/form/button");
        submit1.click();
        Thread.sleep(1000);
        WebElement close1 = driver.findElementByXPath("//*[@id=\"myModal\"]/div/div/div[1]/button");
        close1.click();
        Thread.sleep(1000);

        WebElement deleteButton = driver.findElementByXPath("//*[@id=\"cardList\"]/div[2]/div[2]/button[1]");
        Thread.sleep(1000);
        deleteButton.click();
        Thread.sleep(1000);

        WebElement header = driver.findElementByXPath("//*[@id=\"cardList\"]/div[1]/div[1]/div[2]/h4");
        assertEquals("Oil Paint",header.getText());

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

    @Test
    public void updateTest() throws InterruptedException {
        driver.get("http://34.89.69.35/index.html");
        Thread.sleep(1000);
//        WebElement addButton = driver.findElementByXPath("/html/body/center/button");
//        Thread.sleep(1000);
//        addButton.click();
//        Thread.sleep(1000);
//        WebElement productName = driver.findElementByXPath("//*[@id=\"InputName\"]");
//        assertTrue(productName.isDisplayed());
//        productName.sendKeys("Oil Paint");
//        Thread.sleep(1000);
//        WebElement categoryName = driver.findElementByXPath("//*[@id=\"InputCategory\"]");
//        categoryName.sendKeys("Paint");
//        Thread.sleep(1000);
//        WebElement description = driver.findElementByXPath("//*[@id=\"InputDescription\"]");
//        description.sendKeys("Slow drying Paint");
//        Thread.sleep(1000);
//        WebElement url = driver.findElementByXPath("//*[@id=\"InputImageLink\"]");
//        url.sendKeys("https://imgs.michaels.com/MAM/assets/1/726D45CA1C364650A39CD1B336F03305/img/85DCA835551945A5B976482AF84ED9DB/10452898_2_u.jpg?fit=inside|1024:1024");
//        Thread.sleep(1000);
//        WebElement submit = driver.findElementByXPath("/html/body/center/div[2]/div/div/div[2]/form/button");
//        submit.click();
//        Thread.sleep(1000);
//        WebElement close1 = driver.findElementByXPath("//*[@id=\"myModal\"]/div/div/div[1]/button");
//        close1.click();
//        Thread.sleep(1000);

        WebElement id = driver.findElementByXPath("//*[@id=\"cardList\"]/div/div[1]/div[2]/ul/li[1]");
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.moveToElement(id).moveByOffset(-10, 0).doubleClick().perform();
        Thread.sleep(1000);
        //actions.moveToElement(id).moveByOffset(0, 10).click();
        //actions.moveToElement(id).moveByOffset(-10, 0).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
        Thread.sleep(1000);
        //actions.sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        //actions.sendKeys(Keys.RETURN);
        actions.sendKeys(Keys.chord(Keys.CONTROL+"c"));
        Thread.sleep(1000);


        WebElement update = driver.findElementByXPath("//*[@id=\"cardList\"]/div/div[2]/button[2]");
        update.click();
        Thread.sleep(1000);
        WebElement productid = driver.findElementByXPath("//*[@id=\"Inputid\"]");
        productid.sendKeys(Keys.CONTROL+"v");
        Thread.sleep(1000);
//        WebElement productName1 = driver.findElementByXPath("//*[@id=\"InputName2\"]");
//        productName1.sendKeys("Oil Paint 2");
//        Thread.sleep(1000);
//        WebElement categoryName1 = driver.findElementByXPath("//*[@id=\"InputCategory2\"]");
//        categoryName1.sendKeys("Paint");
//        Thread.sleep(1000);
//        WebElement description1 = driver.findElementByXPath("//*[@id=\"InputDescription2\"]");
//        description1.sendKeys("Slow drying Paint");
//        Thread.sleep(1000);
//        WebElement url1 = driver.findElementByXPath("//*[@id=\"InputImageLink2\"]");
//        url1.sendKeys("https://imgs.michaels.com/MAM/assets/1/726D45CA1C364650A39CD1B336F03305/img/85DCA835551945A5B976482AF84ED9DB/10452898_2_u.jpg?fit=inside|1024:1024");
//        Thread.sleep(1000);
//        WebElement submit1 = driver.findElementByXPath("/html/body/center/div[2]/div/div/div[2]/form/button");
//        submit1.click();
//        Thread.sleep(1000);



    }



}
