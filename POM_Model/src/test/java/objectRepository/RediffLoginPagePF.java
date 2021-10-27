package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffLoginPagePF {
	WebDriver driver;
 
	public RediffLoginPagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(linkText = "rediff.com")
	WebElement home;
	
	
	
	public WebElement Email()
	{
		return username;
	}
	public WebElement Password()
	{
		return password;
	}

	public WebElement Home()
	{
		return home;
	}
}
