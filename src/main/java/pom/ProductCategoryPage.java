package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCategoryPage {

	@FindBy(xpath = "//a[contains(text(),'t-shirts')]")
	private WebElement clkSubCategoryShirts;

	@FindBy(xpath = "//a[contains(text(),'t-shirts')]")
	private WebElement clkSubCategoryTshirts;

	@FindBy(xpath = "//a/img[1]")
	private WebElement clkProduct;

	@FindBy(xpath = "//a[@title='Wishlist']/i")
	private WebElement clkWishlistBtn;

	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	private WebElement clkAddToCartBtn;

	public WebElement getClkSubCategoryShirts() {
		return clkSubCategoryShirts;
	}

	public WebElement getClkSubCategoryTshirts() {
		return clkSubCategoryTshirts;
	}

	public WebElement getClkProduct() {
		return clkProduct;
	}

	public WebElement getClkWishlistBtn() {
		return clkWishlistBtn;
	}

	public WebElement getClkAddToCartBtn() {
		return clkAddToCartBtn;
	}
	public ProductCategoryPage(WebDriver driver) {
       	PageFactory.initElements(driver, this);
           }
	public void clkSubCategoryShirts() {
		clkSubCategoryShirts.click();
	}

	public void clkSubCategoryTshirts() {
		clkSubCategoryTshirts.click();
	}

	public void clkProduct() {
		clkProduct.click();
	}

	public void clkWishlistBtn() {
		clkWishlistBtn.click();
	}

	public void clkAddToCartBtns() {
		clkAddToCartBtn.click();
	}


}
