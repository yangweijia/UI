package page_obj;

import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends Page{
	//定位
	public  static final String[] userLoc= {"name","login[name]"};
	public  static final String[] passwordLoc= {"name","login[pwd]"};
	public  static final String[] submitLoc= {"css","button.llv-submit"};
	//构造函数		
	public LoginPage(RemoteWebDriver selenium_diver) {
		super(selenium_diver);//调用父类构造方法
	}
	
	//输入用户名
	public void user(String user) {
		this.findE(userLoc[0],userLoc[1]).clear();
		this.findE(userLoc[0],userLoc[1]).sendKeys(user);
	}
	
	//输入密码
	public void password(String pwd) {
		this.findE(passwordLoc[0], passwordLoc[1]).clear();
		this.findE(passwordLoc[0], passwordLoc[1]).sendKeys(pwd);
		
	}
	
	//点击登录按钮
	public void submit() {
		this.findE(submitLoc[0], submitLoc[1]).click();
	}
	
	//登录
	public void login(String user,String pwd) throws InterruptedException {
		this.user(user);
		this.password(pwd);
		this.submit();	
		Thread.sleep(2000);
	}
	

}
