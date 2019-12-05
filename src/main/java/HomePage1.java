import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 extends BasePage {
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dressbtn;
	@FindBy(xpath="//*[@id='search_query_top']")
	private WebElement searchbtn;
	@FindBy (xpath="//*[@type='submit']")
	private WebElement clkbtn;
	
	public HomePage1(){
		PageFactory.initElements(driver, this);
		
	}
	public void Dressclk(){
		Dressbtn.click();
                Dressbtn.click();

	public void search(){
		searchbtn.click();
	}
	public void entword(String word){
		setText(searchbtn, word);
	}
	public void goclk(){
		clkbtn.click();
	}
	

}
