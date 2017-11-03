package page_obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Page {
	RemoteWebDriver driver;
	
	Page(RemoteWebDriver selenium_diver){
		driver=selenium_diver;	
	}
	
	public WebElement findE(String type,String str) {
		WebElement el=null;
		try {
			if(type.equals("id")) {
				el=driver.findElement(By.id(str));
			}else if(type.equals("name")) {
				el=driver.findElement(By.name(str));
			}else if(type.equals("className")) {
				el=driver.findElement(By.className(str));
			}else if(type.equals("link")) {
				el=driver.findElement(By.linkText(str));
			}else if(type.equals("xpath")) {
				el=driver.findElement(By.xpath(str));
			}else if(type.equals("css")) {
				el=driver.findElement(By.cssSelector(str));
			}else {
				System.out.println("类型错误");
			}		
		}catch(Exception e){
			e.printStackTrace();
		}
		return el;
	}//查找元素

}
