package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverDemo {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KatarzynaKmiotek\\Downloads\\chromedriver_win64\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KatarzynaKmiotek\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),
//				DesiredCapabilities.chrome());
		driver.get("http://www.pluralsight.com");
		driver.manage().window().setSize(new Dimension(1280, 680));
//		WebElement menu = driver.findElement(By.xpath("//*[@id=\"menuMobile\"]"));
		WebElement courses = driver.findElement(By.xpath("/html/body/div[1]/div/noindex[1]/nav/div/div[2]/ul[1]/li[2]/a"));

		courses.click();
		WebElement java = driver.findElement(By.xpath("//*[@id=\"software-development\"]/div/div[1]/ul/li[4]/a"));
		java.click();
		// WebElement courses = driver.findElement(By.xpath("/html/body/div[1]/div/noindex[1]/nav/div/div[2]/ul[1]/li[2]/a"));
		// courses.click();
//		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
//		imagesLink.click();
//
//		WebElement imageElement = driver.findElements(By.cssSelector("a[class = rg_l]")).get(0);
//		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
//		imageLink.click();

	}
}
