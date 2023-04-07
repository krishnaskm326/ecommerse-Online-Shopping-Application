package test;

import org.openqa.selenium.By;

import genericUtility.BaseClass1;
import pom.CategoryPage;
import pom.ChangePasswordPage;
import pom.InsertProductPage;
import pom.SubCategoryPage;




public class InsertProduct  extends BaseClass1{

	public void insertProduct() throws Throwable {

		ChangePasswordPage cpp=new ChangePasswordPage(driver);
		cpp.clkCategoryBtn();
		CategoryPage cp=new CategoryPage(driver);
		String category_Name = cp.createCategoryTF(eLib, driver);
		cpp.clkSubCategoryBtn();
		SubCategoryPage scp=new SubCategoryPage(driver);
		String subCategory_name = scp.createSubcategory(wLib, category_Name, driver, eLib);
		InsertProductPage ipp=new InsertProductPage();
		ipp.insertProductCategoryAndSubCategory(wLib,category_Name, subCategory_name);
		ipp.insertDetailsOfTF(driver, eLib, "Address");
		ipp.stockAvailability(wLib, "In Stock");
		String result = driver.findElement(By.xpath("//div[contains(.,'Product Inserted Successfully !!')]/strong")).getText();
		System.out.println(result);
		if(result.contains("Well done")) {
			System.out.println(result+"product added successfully"+" TC Pass ");
		}
	}

}


