package page_obj;

import org.openqa.selenium.remote.RemoteWebDriver;

public class GoodsManagePage extends Page {
	//定位
	//商品名称
	public static final String[] nameLoc= {"name","l_name"};
	//sku属性名称
	public static final String[] skuDescLoc= {"name","sku_desc"};
	//正品保证
	public static final String[] showQualityTureLoc= {"name","show_quality"};
	//上传图片
	public static final String[] picUploadLoc= {"id","idi_pic"};
	//编辑
	public static final String[] editLoc= {"link","编辑"};
	//一级分类
	public static final String[] firstClassLoc= {"name","class_name"};
	//二级分类
	public static final String[] secondClassLoc= {"name","second_class_name"};
	//品牌
	public static final String[] brandLoc= {"xpath","//div[@id='J_brand_query']/input"};
	
	public GoodsManagePage(RemoteWebDriver selenium_diver) {
		super(selenium_diver);
	}
	//上传图片
	 public void picUpload(String pic) {
		 this.driver.executeScript("var q=document.getElementById('idi_pic').style.display='block';");
		 this.findE(picUploadLoc[0], picUploadLoc[1]).sendKeys(pic); 
	 }

}
