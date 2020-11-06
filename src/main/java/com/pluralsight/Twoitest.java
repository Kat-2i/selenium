package com.pluralsight;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Twoitest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KatarzynaKmiotek\\Downloads\\chromedriver_win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://www.2itesting.com");
        driver.manage().window().setSize(new Dimension(1280, 680));
        WebElement about = driver.findElement(By.xpath("//div[3]/div/nav/div/ul/li[3]/a/span"));
        about.click();
        WebElement cookies = driver.findElement(By.xpath("//html[@id='site']/body/div/div/div/div[2]/button"));
        cookies.click();
        WebElement people = driver.findElement(By.linkText("Our People"));
        people.click();
        WebElement loadMore = driver.findElement(By.id("load-more-btn"));
        loadMore.click();
//        js.executeScript("window.scrollBy(0,300)");
//        WebElement adam = driver.findElement(By.xpath("//div[16]/div/a/img"));
//        adam.click();
        WebElement grace = driver.findElement(By.xpath("//*[@id=\"infiniteScroll\"]/div[4]/div/a/img"));

        grace.click();
        WebElement name = driver.findElement(By.xpath("//*[@id=\"mp-pusher\"]/div[5]/div/div[2]/div/div/div[1]/div/div/div[1]/span"));
        Assert.assertTrue(name.getText().equals("Grace Galloway (ACMA, CGMA)"));
        System.out.println(name.getText());
        driver.close();
    }
}
