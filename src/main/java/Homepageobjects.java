import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepageobjects extends BasePage{
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womtab;
	@FindBy(xpath="//ul//li[3]//a[@title='T-shirts']")
	private WebElement tshirt;
	@FindBy (xpath="//input[@id='newsletter-input']")
	private WebElement emailid;
	@FindBy(xpath="//button[@name='submitNewsletter']")
	private WebElement gobtns;
	@FindBy (xpath="//p[@class='alert alert-success']")
	private WebElement success;
	@FindBy (xpath="//ul[@id='ul_layered_id_attribute_group_1']//li[1]//label[1]//a")
	private WebElement smalsz;
	@FindBy (xpath="//ul[@id='ul_layered_id_attribute_group_1']//li[2]//a")
	private WebElement mediumsz;
	@FindBy (xpath="//ul[@id='ul_layered_id_attribute_group_1']//li[3]//a")
	private WebElement largesz;
	
	public Homepageobjects () {
		PageFactory.initElements(driver, this);
		
	}
	public void small(){
		smalsz.click();
	}
	public void medium(){
		mediumsz.click();
	}
	public void large(){
		largesz.click();
	}
	public WebElement sizes(){
		if (smalsz.isDisplayed()){
			System.out.println("small size is available");
		}else{
			System.out.println("NA");
		}
		return smalsz;
	}
	
	public WebElement women (){
	 return womtab;
		
	}
	public void womenclick(){
		womtab.click();
	}
	public void SetEmail (String email){
		setText(emailid, email);
	}
	
	public void gobtn(){
		gobtns.click();
		
}
	public WebElement vrifyemail(){
		return success; 
	}
	public void womenbtnvfy(){
		String e= womtab.getAttribute("Women");
	}
}