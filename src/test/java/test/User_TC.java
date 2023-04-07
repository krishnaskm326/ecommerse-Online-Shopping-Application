package test;



import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pom.HomePage;
import pom.MyWishListPage;
import pom.MycartPage;
import pom.PaymentMethodPage;
import pom.ProductCategoryPage;
import pom.ProductDetailsPage;




public class User_TC extends BaseClass{

	@Test(priority = 1)
	public void checkOut() throws Throwable{
		HomePage hp=new HomePage(driver);
		hp.SearchProductTF(eLib, "Sheet2", 0, 1);
	    MycartPage mp=new MycartPage(driver);
	    ProductCategoryPage pcp=new ProductCategoryPage(driver);
	    pcp.clkAddToCartBtns();
	    wLib.acceptAlert(driver);
	    hp.MyCartBtn();
	    mp.clkCheckOutBtn();
	    
	    PaymentMethodPage pmp=new PaymentMethodPage(driver);
	    pmp.clkCODPaymentOptions();
	    pmp.clkSubmitBtn();
	    }
	@Test(priority = 2)
	public void wishList() {
		HomePage hp=new HomePage(driver);
		hp.clkCategory();
		ProductCategoryPage pcp=new ProductCategoryPage(driver);
		pcp.clkSubCategoryTshirts();

		pcp.clkProduct();
		ProductDetailsPage
		pdp=new ProductDetailsPage(driver);
		pdp.clkWislistBtn();
		
	    }
	@Test(priority = 3)
	public void wishListToAddToCart() throws Throwable {
	HomePage hp=new HomePage(driver);
	hp.SearchProductTF(eLib, "Sheet2", 0, 1);
	ProductCategoryPage pcp=new ProductCategoryPage(driver);
	pcp.clkWishlistBtn();
	MyWishListPage wp=new MyWishListPage(driver);
	wp.clkAddToCartBtn();
	hp.MyCartBtn();
	}
	
}
