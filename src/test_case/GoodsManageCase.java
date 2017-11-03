package test_case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page_obj.GoodsManagePage;
import page_obj.LoginPage;

public class GoodsManageCase {
  public RemoteWebDriver driver;
  
  @BeforeClass
  public void init() throws InterruptedException {
	driver=new FirefoxDriver(); //上转型
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://admin.codoon.com/admin/html/goods-manage/goods-list.html"); 
	LoginPage login=new LoginPage(driver);
	login.login("wy", "Aa123456");
  }
  
  @Test
  public void f() throws InterruptedException {
	  GoodsManagePage goods=new GoodsManagePage(driver);
	  driver.get("https://admin.codoon.com/admin/html/item-creator-test.html#!new");
	  Thread.sleep(2000);
	  goods.picUpload("/入口5.png");	
  }
  
  @AfterMethod
  public void tearDown() {
	  driver.get("https://admin.codoon.com/admin/html/goods-manage/goods-list.html");   
  }
  
  @AfterClass
  public void clear() {
	  driver.quit();
  }
  
}
