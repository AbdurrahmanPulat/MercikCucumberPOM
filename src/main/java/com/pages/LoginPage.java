package com.pages;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By girisYap = By.xpath("//a[.='Giriş Yap']\r\n");
	
	private By userName=By.id("username");
	private By password=By.id("password");
	
	private By continuee= By.xpath("//button[@name='action']\r\n");
	
	private By photoButton = By.xpath("//label[@class= \"jsx-1eacf099358fc717 select-img\"]");
	
	
	public LoginPage  (WebDriver driver) {
		this.driver=driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
		
	}
	
	public void clikGiris() {
		driver.findElement(girisYap).click();
		
	}
	
	public void enterUserName(String username) {
		driver.findElement(userName).sendKeys(username);
	}
	
	public void enterPassword(String passwd) {
		driver.findElement(password).sendKeys(passwd);
		
	}
	
	public void clickContinue() {
		driver.findElement(continuee).click();
		
	}
	


}
