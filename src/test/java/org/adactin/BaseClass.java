package org.adactin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}
	
	public String getCurl() {
		return driver.getCurrentUrl();
	}
	
	public void enterText(WebElement element,String value) {
		element.clear();
		element.sendKeys(value);
    }
	public void btnClick(WebElement element) {
	element.click();
	}
	
	public void screenShot(String data) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+"\\target\\"+data+".png");
		FileUtils.copyFile(srcFile, destFile); 
	}
	
	public void selectDropdown(WebElement dropdown,String text) {
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(text);
	}
}
