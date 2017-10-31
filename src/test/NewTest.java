package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
//java+selenium+testng+ant
public class NewTest {
  public  WebDriver driver;

  @BeforeMethod
  public void setup()
  {
	  driver=new  FirefoxDriver();  
  }
  @Test
  public void login001() throws InterruptedException {
	      driver.get("http://www.codoon.com/");
	      assertEquals(driver.getTitle(),"1");
	  	  Thread.sleep(5000);
  }
  @Test
  public void login002() throws InterruptedException {
	  driver.get("http://www.baidu.com/");
	  Thread.sleep(5000);
  }
  @AfterMethod
  public void teardown() throws InterruptedException {
	  driver.quit(); 
  }
  
}
