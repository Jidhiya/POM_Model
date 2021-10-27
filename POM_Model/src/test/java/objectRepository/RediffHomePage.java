package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	WebDriver driver;


 By search_keyword = By.id("srchword");
 By search = By.xpath("//input[@class='newsrchbtn']");
 
 public RediffHomePage(WebDriver driver) {
	this.driver = driver;
}
public WebElement search_keyword()
 {
	 return driver.findElement(search_keyword);
 }
 public WebElement search()
 {
	 return driver.findElement(search);
 }
}

 
