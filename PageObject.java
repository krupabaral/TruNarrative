package Test.Run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

	public WebDriver driver;
	
	By Choose = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/a[1]");
	By FinancialServices = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[1]/ul/li[3]/a");
	By Insurance = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[1]/ul/li[4]/a");
	By LifeAndPensions = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[1]/ul/li[5]/a");
	By Corporations = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[1]/ul/li[6]/a");
	
	public PageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement RunButton() {
		return driver.findElement(Choose);
	}

	public WebElement FinancialServices() {
		return driver.findElement(FinancialServices);
		
	}
	
	public WebElement Insurance() {
		return driver.findElement(Insurance);
		
	}
	
	public WebElement LifeAndPensions() {
		return driver.findElement(LifeAndPensions);
		
	}
	
	public WebElement Corporations() {
		return driver.findElement(Corporations);
		
	}
	
}
