package com.pluralsight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class TwoitestTest {
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KatarzynaKmiotek\\Downloads\\chromedriver_win64\\chromedriver.exe");
    }

    @Test
    public void goToAboutPage() {
        Pages.about().goTo();
        Assert.assertTrue(Pages.about().isAt());
    }
    @Test
    public void getGraceName(){
        WebDriver driver = new ChromeDriver();
        String url = "https://2itesting.com/about/our-business/";
//
//        Browser.goTo(url);
//        driver.manage().window().setSize(new Dimension(1280, 680));
//        WebElement cookies = driver.findElement(By.xpath("//html[@id='site']/body/div/div/div/div[2]/button"));
//        cookies.click();
//        WebElement people = driver.findElement(By.linkText("Our People"));
//        people.click();
//        WebElement loadMore = driver.findElement(By.id("load-more-btn"));
//        loadMore.click();
//        WebElement grace = driver.findElement(By.xpath("//*[@id=\"infiniteScroll\"]/div[4]/div/a/img"));
//        grace.click();
//        WebElement name = driver.findElement(By.xpath("//*[@id=\"mp-pusher\"]/div[5]/div/div[2]/div/div/div[1]/div/div/div[1]/span"));
//
//        assertTrue(name.getText().equals("Grace Galloway (ACMA, CGMA)"));

    }
}