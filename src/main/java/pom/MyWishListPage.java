package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishListPage {

	@FindBy(xpath = "//a[.='Add to cart']")
	private WebElement clkAddToCartBtn;

	public WebElement getClkAddToCartBtn() {
		return clkAddToCartBtn;
	}

	public MyWishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clkAddToCartBtn() {
		clkAddToCartBtn.click();
	}
}
