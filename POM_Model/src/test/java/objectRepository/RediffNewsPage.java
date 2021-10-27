package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffNewsPage {
	WebDriver driver;
	
	By search_word = By.id("srchword");
	By search = By.xpath("//input[@type='submit']");
	By news = By.linkText("NEWS");
	
	public RediffNewsPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement search_word()
	 {
		 return driver.findElement(search_word);
	 }
	 public WebElement search()
	 {
		 return driver.findElement(search);
	 }
	 public WebElement news()
	 {
		 return driver.findElement(news);
	 }
	

}
