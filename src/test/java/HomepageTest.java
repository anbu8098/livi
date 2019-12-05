import java.sql.Driver;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest {

	Homepageobjects hp;
	int random = new Random().nextInt(5000);
	String email= "anbu"+random+"@gmail.com";
			
	public HomepageTest() {
		hp=new Homepageobjects();
	}
	//@Test
	public void sendemail (){
		hp.SetEmail(email);
		hp.gobtn();
		Assert.assertTrue(hp.elementFound(hp.vrifyemail()));
	}
	@Test	
	public void verify(){
		hp.women();
		hp.womenclick();
		hp.small();
		hp.medium();
		hp.large();
		Assert.assertTrue(hp.elementFound(hp.sizes()));
		
	}
		
	}

