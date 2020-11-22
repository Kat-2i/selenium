package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KatarzynaKmiotek\\Downloads\\chromedriver_win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.gototempora.com/HostedTempora/Login.aspx?ReturnUrl=%2fHostedTempora%2f");
        WebElement loginField = driver.findElement(By.id("txtUserName"));
        loginField.sendKeys("Katarzyna.Kmiotek");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Misia123");
        WebElement loginButton = driver.findElement(By.id("cmdSubmit"));
        loginButton.click();
        WebElement popupOne = driver.findElement(By.className("hopscotch-bubble-close"));
        popupOne.click();
        WebElement popupTwo = driver.findElement(By.id("ctl00_btnOKLatestUpdates"));
        popupTwo.click();
//
        for (int i = 1; i < 6; i++) {
            String stringI = Integer.toString(i);
            driver.findElement(By.id("ctl00_cpEdit_TeList_ctl01_Hrs"+ stringI)).clear();
            driver.findElement(By.id("ctl00_cpEdit_TeList_ctl01_Hrs"+ stringI)).sendKeys("1");
        }

//        WebElement saveTimesheet = driver.findElement(By.id("ctl00_btnSubmit"));
//        saveTimesheet.click();

        driver.close();


    }
}
