package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffNewsPagePF {
	WebDriver driver;
	
	@FindBy (id="srchword")
	WebElement search_word;

	@FindBy (xpath="//input[@type='submit']")
	WebElement search;

	
	@FindBy (linkText="NEWS")
	WebElement news;
	
	
	public RediffNewsPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement search_word()
	 {
		 return search_word;
	 }
	 public WebElement search()
	 {
		 return search;
	 }
	 public WebElement news()
	 {
		 return news;
	 }
	

}
