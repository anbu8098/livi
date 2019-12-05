

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressPageObject extends BasePage{
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement txtHeadr;
	@FindBys(@FindBy(xpath="//ul[@class='product_list grid row']//li[2]"))
	private List<WebElement> listproducts;
	
	public DressPageObject(){
		PageFactory.initElements(driver, this);
	}
	public int getProductFromHeader(){
		String text=txtHeadr.getText();
		String [] arr=text.split(" ");
		String value=arr[2];
		int number=Integer.parseInt(value);
		return number;
	}
	
	public int getproductcount(){
		return listproducts.size();
	}

}
