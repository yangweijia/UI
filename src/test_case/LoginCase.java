package test_case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_obj.LoginPage;

public class LoginCase {
	  public WebDriver driver;
	  
	  @BeforeClass
	  public void init() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://admin.codoon.com/admin/html/order/order-ms.html"); 
	  }
	    
	  @Test
	  public void login001(){
		  LoginPage login=new LoginPage(driver);
		  login.user("wy");
		  login.password("Aa123456");	 
	  }
	  
	  @Test
	  public void login002() throws InterruptedException {
		  LoginPage login=new LoginPage(driver);
		  login.user("15201444715@163.com");
	  }
	  @AfterMethod
	  public void tearDown() {
		  driver.navigate().refresh();// 刷新浏览器
	  }

}
