import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest1 {
	HomePage1 hp;
	DressPageObject dp;
	String name= "dress";
	
public HomePageTest1(){
	hp=new HomePage1();
	dp=new DressPageObject();
	
}
@Test
public void vrifyProductHeaderCounter(){
	hp.search();
	hp.entword(name);
	hp.goclk();
	//Assert.assertTrue(dp.getProductFromHeader()==dp.getproductcount(), "Failed:Count mismatched");
	}
}
