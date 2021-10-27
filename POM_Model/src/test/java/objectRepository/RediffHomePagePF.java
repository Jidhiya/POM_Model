package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF {
	WebDriver driver;
	
	@FindBy(id="srchword")
	WebElement search_keyword;
	
	@FindBy(xpath="//input[@class='newsrchbtn']")
	WebElement search;
	
	@FindBy(linkText = "rediff.com")
	WebElement home;
	
	


 
 
 public RediffHomePagePF(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public WebElement search_keyword()
 {
	 return search_keyword;
 }
 public WebElement search()
 {
	 return search;
 }
 public WebElement Home()
	{
		return home;
	}
}

 
