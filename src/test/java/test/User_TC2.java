package test;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pom.HomePage;
import pom.MyAccountPage;
import pom.MycartPage;
import pom.PaymentMethodPage;
import pom.ProductCategoryPage;
import pom.ProductDetailsPage;



public class User_TC2 extends BaseClass{
	@Test(priority = 4)
	public void searchProduct() throws Throwable {

		HomePage hp=new HomePage(driver);
		hp.SearchProductTF(eLib, "Sheet2", 0, 1);
		}
	
	@Test(priority = 5)
	public void product() {
		HomePage hp=new HomePage(driver);
		hp.clkCategory();
	ProductCategoryPage pcp=new ProductCategoryPage(driver);
	pcp.clkSubCategoryTshirts();
	pcp.clkProduct();
	}
	
	@Test(priority = 6)
	public void updateShipBillAddress() throws Throwable {
		
		
		HomePage hp=new HomePage(driver);
		hp.MyAccountbtn();
		MyAccountPage mp=new MyAccountPage(driver);
		mp.clkShipBillAddressbtn();
		mp.UpdateAddress(wLib, eLib, driver);
		//wLib.acceptAlert(driver);
	}
	@Test(priority = 7)
	public void payment() {
		HomePage hp=new HomePage(driver);
		ProductCategoryPage pcp=new ProductCategoryPage(driver);
		hp.clkCategory();
		pcp.clkSubCategoryTshirts();

		pcp.clkProduct();
		
		ProductDetailsPage pdp=new ProductDetailsPage(driver);
		pdp.clkAddToCartBtn();
		
		wLib.acceptAlert(driver);
		MycartPage mp=new MycartPage(driver);
		mp.clkCheckOutBtn();
		PaymentMethodPage pmp=new PaymentMethodPage(driver);
		pmp.clkCODPaymentOptions();
		pmp.clkSubmitBtn();


	}
	
}
