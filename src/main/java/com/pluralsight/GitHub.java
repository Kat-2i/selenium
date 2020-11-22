package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KatarzynaKmiotek\\Downloads\\chromedriver_win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        WebElement login = driver.findElement(By.linkText("Sign in"));
        login.click();
        WebElement userName = driver.findElement(By.id("login_field"));
        userName.sendKeys("KatKmiotek");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("qLznVUvc4mxzvk2");
        WebElement loginButton = driver.findElement(By.name("commit"));
        loginButton.click();
        WebElement newRepo = driver.findElement(By.linkText("New"));
        newRepo.click();
        WebElement repoName = driver.findElement(By.className("js-reponame-suggestion"));
        repoName.click();
//        try {
//            driver.wait(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        WebElement errorPopup = driver.findElement(By.id("input-check-3919"));
//        if(errorPopup != null){
//            repoName.clear();
//            repoName.sendKeys("Selenium_1");
//        }
        WebElement cookies = driver.findElement(By.className("js-cookie-consent-accept"));
        cookies.click();
//        WebElement create = driver.findElement(By.className("first-in-line"));
        WebElement create = driver.findElement(By.cssSelector("#new_repository > div.js-with-permission-fields > button"));
        create.click();
    }
}
