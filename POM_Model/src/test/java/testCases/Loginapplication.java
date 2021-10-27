package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffHomePagePF;
import objectRepository.RediffLoginPage;
import objectRepository.RediffLoginPagePF;
import objectRepository.RediffNewsPage;
import objectRepository.RediffNewsPagePF;

public class Loginapplication {
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jidhi\\OneDrive\\Desktop\\SDET training\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  //RediffLoginPage rd = new RediffLoginPage(driver);
	  RediffLoginPagePF rd = new RediffLoginPagePF(driver);
	  rd.Email().sendKeys("Hello");
	  rd.Password().sendKeys("Hello");
	  //rd.Submit().click();
	  rd.Home().click();
	  //RediffHomePage rh = new RediffHomePage(driver);
	  RediffHomePagePF rh = new RediffHomePagePF(driver);
	  rh.search_keyword().sendKeys("rediff");
	  rh.search().click();
	  rh.Home().click();
	  //RediffNewsPage rn = new RediffNewsPage(driver);
	  RediffNewsPagePF rn = new RediffNewsPagePF(driver);
	  rn.news().click();
	  rn.search_word().sendKeys("rediff");
	  rn.search().click();
	  
	  
  }
}
